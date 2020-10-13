
import java.io.*;

public class Myjava {
	public static void main(String[] args) {
		System.out.println("Y / N ?");
		try {
			char c = (char) System.in.read();
			switch (c) {
			case 'Y':
				System.out.println("Yes!!");
				break;
			case 'N':
				System.out.println("No!!");
				break;
			default:
				System.out.println("Y/N 을 눌러주십시오");
				break;
			}
		} catch (IOException e) {
		}
	}
}