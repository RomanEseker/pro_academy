package org.example;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {
    private final String[] arrayFileList;

    public MyFileFilter(String... arrayFileList){
        super();
        this.arrayFileList = arrayFileList;
    }

    private boolean check(String ext){
        for(String stringExt : arrayFileList){
            if(stringExt.equals(ext)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(File pathName){
        int pointerIndex = pathName.getName().lastIndexOf(".") + 1;

        if(pointerIndex == -1){
            return false;
        }
        String ext = pathName.getName().substring(pointerIndex);
        return check(ext);
    }
}
