package 조건문;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		sc.close();
		
		if( M >= 45) {
			System.out.println(H +" " + (M-45));
		}
		else {
			if( M < 45 && H == 0) {
			System.out.println(23+" "+ (M + 15));
			} else  {
			System.out.println((H-1)+" "+ (M + 15));
		}
	}
  }
}
