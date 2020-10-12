//1.	(30점) 2x4 행렬 A 와 4x3 행렬 B 를 곱하는 프로그램을 작성하라. 단 행렬의 내용은 배열을 초기화하는 방법으로 할당한다.
public class Matrix_1 {
	    public int[][] multiplying(int[][] arr1, int[][] arr2) {
	        int[][] answerArr = new int[arr1.length][arr2[0].length];
	        
	        for(int i=0; i<arr1.length; i++) {
	            for(int j=0; j<arr1[0].length; j++) {
	                for(int k=0; k<arr2[0].length; k++) {
	                    answerArr[i][k] += arr1[i][j] * arr2[j][k];
	                }
	            }
	        }
	        return answerArr;
	    }
	
	
	public static void main(String[] args) {
		
		int[][] a1 = {{1,2,3,4},{5,6,7,8}};
		int[][] a2 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		Matrix_1 c = new Matrix_1();
		System.out.println("행렬의 곱셈 : " + c.multiplying(a1,a2));

	
		
		}
	}
