package com.javaex.ex05;

public class Add {
    
    private int a;
    private int b;
    
    
    
    public Add() {
	}

	public Add(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setValue(int a, int b) {
    }

    @Override
	public String toString() {
		return "Add [a=" + a + ", b=" + b + "]";
	}

	public int calculate() {
    }

}
