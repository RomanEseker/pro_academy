package org.example;

import java.io.*;

public class CompareTextFile {

    public static void compareTextFile(File firstFile, File secondFile, File thirdFile) throws IOException {
        StringBuilder strBuilder1 = new StringBuilder();
        StringBuilder strBuilder2 = new StringBuilder();
        String line;
        String splitter= " ";

        try(BufferedReader bufferReaderFirstFile = new BufferedReader(new FileReader(firstFile.getPath()));
            BufferedReader bufferReaderSecondFile = new BufferedReader(new FileReader(secondFile.getPath()))){

            while((line = bufferReaderFirstFile.readLine()) != null){
                strBuilder1.append(line);
            }

            while((line = bufferReaderSecondFile.readLine()) != null){
                strBuilder2.append(line);
            }

        } catch (Exception e){
            e.printStackTrace();
        }


        int length1 = strBuilder1.toString().split(splitter).length;
        int length2 = strBuilder2.toString().split(splitter).length;

        String[] str1 = new String[length1];
        String[] str2 = new String[length2];

        System.arraycopy(strBuilder1.toString().split(splitter), 0, str1, 0, length1);

        System.arraycopy(strBuilder2.toString().split(splitter), 0, str2, 0, length2);

        StringBuilder stringBuilderResult = new StringBuilder();

        for(int i = 0; i < length1; i++){
            for(int j = 0; j < length2; j++){
                if(str1[i].equals(str2[j])){
                    stringBuilderResult.append(str1[i]);
                    stringBuilderResult.append(System.lineSeparator());
                }
            }
        }

        try(PrintWriter pw = new PrintWriter(thirdFile)){
            pw.write(stringBuilderResult.toString());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
