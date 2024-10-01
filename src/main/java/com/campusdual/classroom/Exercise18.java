package com.campusdual.classroom;

public class Exercise18 {

	public static void main(String[] args) {
		createAndInitializeArray(3);
		showInlineArray(createAndInitializeArray(5));

	}

	public static int[] createAndInitializeArray(int n){
		int [] array = new int[n];
		int value=1;
		for (int i=0; i<array.length;i++){
			array[i]=value;
			System.out.println(array[i]);
			value++;
		}
		return array;
	}

	public static void showInlineArray(int[] array ){
		String cadenaN="";
		for (int i=0; i<array.length;i++){
			cadenaN=cadenaN+(Integer.toString(array[i]))+(" ");
		}
		System.out.println(cadenaN.trim());
	}

}
