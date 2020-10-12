package hw2;

public class q1 {
	public static int[][] compute(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2[0].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				int sum = 0;
				for (int k = 0; k < arr1[0].length; k++) {
					sum += arr1[i][k] * arr2[k][j];
				}
				answer[i][j] = sum;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[][] arr1 = {{1,2,3,4},{5,6,7,8}};
		int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int[][] answer = compute(arr1, arr2);
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.print(answer[i][j]);
				System.out.print(", ");
			}
			System.out.print("\n");
		}
	}
}
