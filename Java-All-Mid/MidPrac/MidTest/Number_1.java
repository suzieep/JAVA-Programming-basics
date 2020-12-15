package MidPrac.MidTest;

import java.io.*;
import java.util.*;
import java.nio.file.*;

public class Number_1 {
    public static String[][] rawFile;
    public static void main(String args[]) throws IOException {
        String[] realRawFile = new String [12];
        rawFile = new String [6][2];

        int lineCnt=0;
        for (String line : Files.readAllLines(Paths.get("MidPrac/MidTest/score.txt"))) {
            realRawFile[lineCnt++]=line;
        }

        int max =0;
        int j=0;
        for(int i=0;i<lineCnt/2;i++){
            rawFile[i][0]=realRawFile[j++];
            rawFile[i][1]=realRawFile[j++];
            if(Integer.valueOf(rawFile[i][1])>= max){
                max = Integer.valueOf(rawFile[i][1]);
            }
        }
        System.out.println("1번문제에 대한 풀이");
        
        int total = 0;
        for(int i=0;i<lineCnt/2;i++){
            total += Integer.valueOf(rawFile[i][1]);
            if(Integer.valueOf(rawFile[i][1])== max){
                System.out.println("최대점수를 기록한 사람은 "+rawFile[i][0]);
            }
        }
        System.out.println("평균은 "+ (double)total/(lineCnt/2));

        System.out.println("점수가 궁금한 사람의 이름을 입력하시오");
        Scanner scan = new Scanner(System.in);
        String nameIn = scan.nextLine();
        for(int i=0;i<lineCnt/2;i++){
        if(nameIn.equals(rawFile[i][0])){
            System.out.println("입력한 사람의 점수는 "+ rawFile[i][1]);
        }}
        scan.close();


    }
    
}
