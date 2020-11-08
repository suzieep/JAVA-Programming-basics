package HW.HW2;

import java.io.*;
import java.util.Scanner;
//2.	(30점) 영문 문자열을 입력받아 문자열에 있는 각 영문 모음의 수를 출력하는 프로그램을 작성하시오.
//영문 모음은 알파벳 a, e, i, o, u 를 말한다.
//키보드를 통해 입력을 받도록 하며 출력은 화면으로 출력을 한다.
public class Aeiou_2 {
	public static void main(String[] args) {
		String input;
	  //  int b, c = 0, z = 0;
		int aN=0,eN=0,iN=0,oN=0,uN=0;
		System.out.print("글자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a') {aN++;}
			if (input.charAt(i) == 'e') {eN++;}
			if (input.charAt(i) == 'i') {iN++;}
			if (input.charAt(i) == 'o') {oN++;}
			if (input.charAt(i) == 'u') {uN++;}
			}
		System.out.println("a:" + aN + " e:" + eN + " i:" +iN + " o:" + oN + " u:" +uN);
	}
}