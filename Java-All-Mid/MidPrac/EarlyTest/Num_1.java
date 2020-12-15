package MidPrac.EarlyTest;

import java.io.*;
import java.util.*;
import java.nio.file.*;

public class Num_1 {

    public static void main(String args[]) throws IOException {

        FileInputStream inputText = null;

        String[][] rawFile = new String [5][2];
        int lineCnt=0;
        for (String line : Files.readAllLines(Paths.get("MidPrac/EarlyTest/gildong.txt"))) {
            int partCnt=0;
            for (String part : line.split("\\s+")) {
                rawFile[lineCnt][partCnt++]=String.valueOf(part);
            }
            lineCnt++;
        }

        int total=0;

        //String.valueOf(rawFile[i][1]).getBytes()==String.valueOf("B").getBytes()
        for(int i=0;i<lineCnt;i++){
            if(rawFile[i][1].equals("A")){
                total+=100;
            }
            else if(rawFile[i][1].equals("B")){
                total+=80;
            }
            else if(rawFile[i][1].equals("C")){
                total+=60;
            }
            else if(rawFile[i][1].equals("D")){
                total+=40;
            }
            else if(rawFile[i][1].equals("F")){
                total+=0;
            }
            
        }

        System.out.println(total/lineCnt);
    }

}
