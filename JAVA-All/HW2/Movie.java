package hw2;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		double[][] movieArr = { { 3, 1, 5, 2, 5 }, { 4, 2, 1, 4, 2 }, { 5, 3, 1, 2, 4 }, { 2, 1, 5, 4, 4 },
				{ 3, 3, 4, 3, 3 } };

		// 영화별 평가점수
		System.out.print("영화별 평가점수\n");
		for (int i = 0; i < movieArr[0].length; i++) {
			double sum = 0;
			double mid = 0;
			for (int j = 0; j < movieArr.length; j++) {
				sum += movieArr[j][i];

			}
			mid = sum / movieArr.length;
			System.out.print("10" + i + "영화 평균:" + mid);
			System.out.print("\n");
		}
		System.out.print("\n");

		// 개인별 평가점수
		System.out.print("개인별 평가점수\n");
		for (int i = 0; i < movieArr.length; i++) {
			double sum = 0;
			double mid = 0;
			for (int j = 0; j < movieArr[0].length; j++) {
				sum += movieArr[i][j];

			}
			mid = sum / movieArr.length;
			System.out.print(i + "사용자 평균:" + mid);
			System.out.print("\n");

		}

		System.out.print("\n");

		// Cartesian distance

		String input;
		int a = 0;
		double distance = 0;
		System.out.print("영화를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();

		for (int i = 0; i < 1; i++) {
			if (input.equals("100")) {
				a = 0;
			} else if (input.equals("101")) {
				a = 1;
			} else if (input.equals("102")) {
				a = 2;
			} else if (input.equals("103")) {
				a = 3;
			} else if (input.equals("104")) {
				a = 4;
			} else {
				System.out.print("잘못입력하셨습니다.");
				System.exit(0);
			}
		}

		double sum = 0, root = 0;
		double dist[] = new double[5];

		for (int j = 0; j < movieArr[0].length; j++) {
			sum = 0;
			for (int i = 0; i < movieArr.length; i++) {
				sum += (movieArr[i][a] - movieArr[i][j]) * (movieArr[i][a] - movieArr[i][j]);
			}
			root = Math.sqrt(sum);
			dist[j] = root;
		}

		double min = dist[1];
		int minmovie = 1;

		for (int i = 0; i < dist.length; i++) {
			if (min > dist[i]) {
				if (dist[i] > 0) {

					min = dist[i];
					minmovie = i;
				}

			}

		}
		System.out.println("내영화 : 10" + a);

		System.out.println("추천영화 : 10" + minmovie + "\nCartesian distance :" + min);
	}
}
