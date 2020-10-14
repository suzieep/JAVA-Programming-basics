//1.	(40점) 파일 first.txt와 second.txt는 각각 숫자를 10개씩 저장하고 있다. 
//저장된 숫자는 스페이스로 구분되어 저장된다. 
//이떄 first.txt와 second.txt의 숫자를 읽어서 두 파일 모두에 공통적으로 저장되어 있는 숫자들을 third.txt에 저장하는 프로그램을 작성하여라. 

package hw3;
import java.io.*;
public class FileInOut_1{
    public static void main(String args[]) throws IOException {
        FileInputStream in1 = null;
      //  FileInputStream in2 = null;
        FileOutputStream out = null;
        try {
        in1 = new FileInputStream("first.txt");
     //   in2 = new FileInputStream("second.txt");
        out = new FileOutputStream("third.txt");
        int c;
        while ((c = in1.read()) != -1) {
        out.write(c);
        }
        }finally {
        if (in1 != null) {
        in1.close();
        }
        if (out != null) {
        out.close();

        }
        }
        }
}