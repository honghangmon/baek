package 백준;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int i = b % 10;
		int j = (b/10)%10;
		int h = b/100;
		
		System.out.println(a * i);
        System.out.println(a * j);
        System.out.println(a * h);
        System.out.println(a * b);
        
        sc.close();
		
		
	}

}
