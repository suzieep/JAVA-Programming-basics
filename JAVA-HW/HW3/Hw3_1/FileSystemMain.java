package HW3.Hw3_1;
import java.io.*;
import java.util.*;
import java.nio.file.*;

public class FileSystemMain {

    public static void main(String args[]) throws IOException {

        FileInputStream in1 = null;
        FileInputStream in2 = null;
        FileOutputStream out = null;
        try {

            out = new FileOutputStream(
                    "/Users/soojinlee/repo/JAVA-Programming-basics/JAVA-HW/HW3/Hw3_1/third.txt");

            List<Integer> numbers = new ArrayList<>();
            for (String line : Files.readAllLines(
                    Paths.get("/Users/soojinlee/repo/JAVA-Programming-basics/JAVA-HW/HW3/Hw3_1/first.txt"))) {
                for (String part : line.split("\\s+")) {
                    Integer i = Integer.valueOf(part);
                    numbers.add(i);
                }
            }
            List<Integer> numbers2 = new ArrayList<>();
            for (String line : Files.readAllLines(
                    Paths.get("/Users/soojinlee/repo/JAVA-Programming-basics/JAVA-HW/HW3/Hw3_1/second.txt"))) {
                for (String part : line.split("\\s+")) {
                    Integer i = Integer.valueOf(part);
                    numbers2.add(i);
                }
            }
            Integer[] array1 = numbers.toArray(new Integer[numbers.size()]);
            Integer[] array2 = numbers2.toArray(new Integer[numbers2.size()]);

            for (int p = 0; p < array1.length; p++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[p] == array2[j]) {
                        out.write(String.valueOf(array1[p]).getBytes());
                        out.write(" ".getBytes());
                    
                    }
                }
            }
        } finally {
            if (in1 != null) {
                in1.close();
            }
            if (in2 != null) {
                in2.close();
            }
            if (out != null) {
                out.close();

            }
        }
    }

}

// 1. (40점) 파일 first.txt와 second.txt는 각각 숫자를 10개씩 저장하고 있다.
// 저장된 숫자는 스페이스로 구분되어 저장된다.
// 이떄 first.txt와 second.txt의 숫자를 읽어서 두 파일 모두에 공통적으로 저장되어 있는 숫자들을 third.txt에 저장하는
// 프로그램을 작성하여라.
