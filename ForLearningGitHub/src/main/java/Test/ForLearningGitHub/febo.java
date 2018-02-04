package Test.ForLearningGitHub;

public class febo {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		x=x+y;
		y=x-y;
		x=y+y;
		System.out.println(x +"   "+y);
		
		System.out.println("**********q*******");
		
		int xo=0,x1=1,x3;
		for (int i=1;i<21;i++){
			System.out.println(xo);
			x3=xo+x1;
			xo=x1;
			x1=x3;
		}

	}

}
