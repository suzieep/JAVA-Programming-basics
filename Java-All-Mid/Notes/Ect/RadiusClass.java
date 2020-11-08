package Notes.Ect;
//반지름이 5인 원의 둘레와 면적을 구하는 프로그램을 구하시오


public class RadiusClass {
	double pi = 3.14;
	double round = 0;
	double surface= 0;	
	int halfr = 0;
	
	public RadiusClass(int r) {
		this.halfr =r;
	}
	public void CalculateRadius() {
		this.round = pi*halfr*2;
		this.surface = pi*halfr*halfr;
	}

	public static void main(String[] args) {
		RadiusClass my5Radius = new RadiusClass(5);
		System.out.println("원의 반지름 :" + my5Radius.halfr);
		my5Radius.CalculateRadius();
		System.out.println("원의 둘레 :" + my5Radius.round);
		System.out.println("원의 넓이  :" + my5Radius.surface);

	}

}
