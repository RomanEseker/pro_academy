package org.example;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileScannerThread implements Runnable{

    private File file1;
    private File file2;
    private File []fileList;

    public FileScannerThread(File file1, File file2) {
        this.file1 = file1;
        this.file2 = file2;
    }

    private File [] scannerFolder(File file1){
        return file1.listFiles();
    }

    private void checker(File fileList[], File file2){
        int lastFileList = fileList.length;
       for(;;){
            int currentFileList = scannerFolder(file2).length;

           if(lastFileList != currentFileList){
               Date date = new Date();
               Thread thread = Thread.currentThread();
                System.out.println( thread.getName() + " Відбулись зміни у директорії. " + date);
                lastFileList = currentFileList;
            }

           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
        }
    }


    @Override
    public void run() {
        checker(scannerFolder(file1), file2);
    }
}
