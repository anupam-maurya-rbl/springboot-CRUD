package com.test.demo;

public class JavaTest {
	public static void main(String[] args) {
		int arr []= new int[7];
		//int a1[]=arr;
		//System.out.println(arr==a1);
		//int aa[]=new byte[2];
	Object obj=arr;
	//	System.out.println(obj);
	int aa[]=(int[])obj;
	System.out.println(obj==aa);
	System.out.println(aa[1]);
	byte b=45;
	int a[]= {1,2,3,'a',b};
	
	int arr4[]=null;
	//arr4={1,2,3};
	//int b1[]=12;
	int aa1[][]=new int[3][];
	//System.out.println(aa1);
	//System.out.println(aa1[1][1]);
	final short s = 120;
	byte b1=s;
	System.out.println(b1);
	final int i1=120;
	byte a1=i1;
	short ss1=i1;
	System.out.println(a1);
	System.out.println(ss1);
//	final long l1=120L;
//	short ss2=l1;
//	int aaa1=l1;
//	byte bby=l1;
//	System.out.println();
	
	
	}
}
