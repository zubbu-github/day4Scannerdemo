package day4;

import java.util.Scanner;

class B {
		void m1() {
			System.out.println("Iam in Method 1");
		}
	}
	public class Scannerclassdemo {
	public static void main(String[] args) {
	   	System.out.println("Enter the Number");
	   	Scanner sc = new Scanner(System.in);
	   	int x = sc.nextInt();
	   	B b = new B();
	     	System.out.println("Entered number is \n" + x);
		}
		}


