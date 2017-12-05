package Test.ForLearningGitHub;
import java.util.ArrayList;
public class learnjava {

public static void main(String[] args) {
	
	int ar[]=new int[4];
	ar[0]=5;
	ar[1]=51;ar[3]=35;
	
	for (int i:ar){
		
		System.out.println(i);
	}
	
	ArrayList<Integer> arr=new ArrayList<Integer>();
	arr.add(1);arr.add(2);arr.add(3);arr.add(4);
	arr.remove(3);
	
	for (int a :arr){
		
		System.out.println(a);
	}
	
}
}
