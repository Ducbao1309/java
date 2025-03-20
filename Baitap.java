package baitap;

import java.util.Scanner;
public class Baitap {

	public static void main(String[] args) {
////		Đề 1. Thông báo có bao nhiêu số 0
		Scanner s = new Scanner(System.in);
//		int x;
//		do {
//			System.out.println("Nhập một số x: ");
//			x = s.nextInt();
//		} while(x <= 1000);
//		int count = 0, sum = 0;
//		System.out.print("Số " + x + " ");
//		while(x != 0) {
//			if(x % 10 == 0) {
//				++count;
//			}
//			sum += x % 10;
//			x /= 10;
//		}
//		System.out.println("Có " + count + " số 0 và tổng là: " + sum);
		
		
//		Đề 2. Thông báo có bao nhiêu số chẳn
		int y;
		do {
			System.out.println("Nhập một số y: ");
			y = s.nextInt();
		} while(y <= 1000);
		int countEven = 0, sum = 0;
        System.out.print("Số " + y + " ");
        while (y != 0) {
            int sumC1 = y % 10;
            if (sumC1 % 2 == 0) {
                ++countEven;
                
            }sum += sumC1;
            y /= 10;
        }
        System.out.println("Có " + countEven + " chữ số chẵn." + sum);
	}
	
}
