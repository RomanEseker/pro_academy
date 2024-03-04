package org.example;

import java.io.File;
import java.io.IOException;

public class CopyFileThread implements Runnable{

    private final String ext;
    private final File file;

    public CopyFileThread(File file, String ext) {
        this.file = file;
        this.ext = ext;
    }


    public String getExt() {
        return ext;
    }

    public File getFile() {
        return file;
    }


    private File[] generateFileList(File file, String ext){
        MyFileFilter mFF = new MyFileFilter( ext);
        File folder = new File(file.getPath());

        return  folder.listFiles(mFF);
    }

    private void copyFile(File [] array){
        for(File file : array){
            String newFilePath = ".\\resources\\" + file.getName();
            try {
                FileOperation.fileCopy(file.getPath(), newFilePath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        copyFile(generateFileList(file, ext));
    }
}
