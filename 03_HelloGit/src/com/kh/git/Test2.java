package com.kh.git;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("아싸!!!!");
		int e = 8;
		for(int i = 0 ; i<e; i++) {
			System.out.print(i+" : ");
			if((i*e)/2!=0) {
				System.out.println(i);
			}
		}
		System.out.println("test1브랜치 시작");
		System.out.println("test1브랜치 끝");

		System.out.println("master에서 작성함!!");
		System.out.println("test1에서 작성함!!");
	}

}
