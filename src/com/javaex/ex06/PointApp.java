package com.javaex.ex06;

public class PointApp {

	
	/*
	 * 아래의 프로그램 실행시 결과를 예상하고 주어진 프로그램을 실행 후 확인해 보세요.
		equals() 메소드가 없는데 실행되는 이유를 말하세요.
		모든 클래스는 java.lang.Object를 자동으로 상속받기 때문에
		Object 클래스의 equals() 메서드를 사용할 수 있음.		
		즉, 직접 equals()를 작성하지 않으면,
		자동으로 Object의 다음 기본 구현이 사용됨.
	 */
	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
	}

}


