package a2;
import java.util.Scanner;
import java.io.File;

public class A2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[]konto=new double[5];
		for (int i = 0; i < konto.length; i++) {
			System.out.println("Kontostand "+(i+1)+": ");
			double k=sc.nextDouble();
			konto[i]=k;
		}
		
		for (int i = 0; i < konto.length; i++) {
			System.out.println(konto[i]);
		}
		System.out.println(konto[2]);
	}
}
