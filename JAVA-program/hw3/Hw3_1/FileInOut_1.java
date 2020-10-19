//1.	(40점) 파일 first.txt와 second.txt는 각각 숫자를 10개씩 저장하고 있다. 
//저장된 숫자는 스페이스로 구분되어 저장된다. 
//이떄 first.txt와 second.txt의 숫자를 읽어서 두 파일 모두에 공통적으로 저장되어 있는 숫자들을 third.txt에 저장하는 프로그램을 작성하여라. 

package Hw3_1;
import java.io.*;
public class FileInOut_1{
    public static void main(String args[]) throws IOException {

      
      FileInputStream in1 = null;
        FileInputStream in2 = null;
        FileOutputStream out = null;
        try {/* 
        in1 = new FileInputStream("/Users/soojinlee/repo/JAVA-Programming-basics/JAVA-program/hw3/first.txt");
        in2 = new FileInputStream("/Users/soojinlee/repo/JAVA-Programming-basics/JAVA-program/hw3/second.txt");
        out = new FileOutputStream("/Users/soojinlee/repo/JAVA-Programming-basics/JAVA-program/hw3/third.txt");
        int c,d;
        int [] arr1 = new int [100];
        int [] arr2 = new int [100];
        int i = 0;
        while ((c = in1.hasNextInt()) != -1) {
          arr1[i]= c;
        out.write(arr1[i++]);
        }
        int q =0;
        while ((d = in2.hasNextInt()) != -1) {
          arr2[i]= d;
        out.write(arr2[q++]);
        }
      
*/

out = new FileOutputStream("/Users/soojinlee/repo/JAVA-Programming-basics/JAVA-program/hw3/Hw3_1/third.txt");

List<Integer> numbers = new ArrayList<>();
for (String line : Files.readAllLines(Paths.get("/Users/soojinlee/repo/JAVA-Programming-basics/JAVA-program/hw3/Hw3_1/first.txt"))) {
  for (String part : line.split("\\s+")) {
    Integer i = Integer.valueOf(part);
    numbers.add(i);
  }
}
List<Integer> numbers2 = new ArrayList<>();
for (String line : Files.readAllLines(Paths.get("/Users/soojinlee/repo/JAVA-Programming-basics/JAVA-program/hw3/Hw3_1/second.txt"))) {
  for (String part : line.split("\\s+")) {
    Integer i = Integer.valueOf(part);
    numbers2.add(i);
  }
}
        for (int p=0;p<arr1.length;p++){
          for (int j=0;j<arr2.length; j++){
            if (numbers[p]==numbers2[j]){
              out.write(numbers[p]);
            }
          }
        }
        }finally {
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