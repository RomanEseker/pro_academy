package org.example.filefilter;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        MyFileFilter mFF = new MyFileFilter( "text");
        File folder = new File(".");

        File [] fileList = folder.listFiles(mFF);

        for(File file : fileList){
            String newFilePath = ".\\src\\main\\resources\\" + file.getName();
            try {
                FileOperation.fileCopy(file.getPath(), newFilePath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
