package com.capgemini.javafullstack.array;

public class TestG {
	public static void main(String[] args) {
		char[] c = {'A','P','P','L','E'};
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
		
		System.out.println();
		
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
	}
}
