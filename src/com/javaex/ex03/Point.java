package com.javaex.ex03;

public class Point {
	//필드
	private int x;
	private int y;
	//생성자	
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//메소드gs
	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}
	//메소드일반
	//toString()을 작성 하세요

	@Override
	public String toString() {
		return "[포인트]x: " + x + ", y:" + y + " 입니다.";
	}
	
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass())
	    	return false;

	    Point other = (Point) obj;
	    return this.x == other.x && this.y == other.y;
	}

	

	

}