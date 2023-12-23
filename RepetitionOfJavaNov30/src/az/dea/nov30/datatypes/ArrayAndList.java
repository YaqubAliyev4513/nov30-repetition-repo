package az.dea.nov30.datatypes;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndList {
	
  public static int[] addElement(int[] oldArray,int newElement) {
	  int[] newArray = new int[oldArray.length + 1];
		
		for(int i = 0; i < oldArray.length;i++) {
			newArray[i] = oldArray[i];
		}
		newArray[newArray.length - 1] = newElement;
		
		return newArray;
  }
  
  public static int[] deleteElement(int[] oldArray,int deletableElementIndex) {
	  
	  int[] newArray = new int[oldArray.length - 1]; 
	  
	  int newArrayCounter = 0;
	  for(int i = 0; i < oldArray.length;i++) {
		  if( i == deletableElementIndex) {
			  continue;
		  }
		  newArray[newArrayCounter] = oldArray[i];
		  newArrayCounter++;
	  }
	  
	  return newArray;
	  
  }
  
  public static int indexOf(int[] array,int element) {
	  
	  int index = -1;
	  
	  for(int i = 0; i < array.length;i++) {
		  
		  if( array[i]  == element ) {
			  index = i;
			  break;
		  }
		  
	  }
	  
	  
	  return index;
  }
  
  public static String convertToString(int[] array) {
	  String result = "";
	  
	  result += "[";
	  for(int i = 0; i < array.length;i++) {
		  result += array[i];
		  if( i == array.length - 1) {
			  continue;
		  }
		  result += " ,";
	  }
	  result += "]";
	  
	  return result;
  }
  
  public static void sort(int[] array) {
	  
	  
	  for(int i = 0; i < array.length;i++) {
		  for(int j = i + 1;j < array.length;j++) {
			  if(array[i] > array[j]) {
				  int saver = array[i];
				  array[i] = array[j];
				  array[j] = saver;
				  System.out.println(convertToString(array));
			  }
		  }
	  }
	  
  }
	
  public static void main(String[] args) {
	
	 // massiv(array) her hansisa data tipinde olan elementlerin coxlugu
	  
	int[] numbers = new int[3];
	
	
	
	numbers[0] = 10;
	numbers[1] = 20;
	numbers[2] = 30;
	
	int[] numbers2 = addElement(numbers,40);
    
	int[] numbers3 = deleteElement(numbers2, 2);
	
	
	int[] numbersH = {50,30,40,45,35};
	System.out.println(convertToString(numbersH));
	sort(numbersH);
	System.out.println(convertToString(numbersH));
	
	
	
//    System.out.println(Arrays.toString(numbers3));
//	System.out.println(indexOf(numbers3, 10));
	
	// ArrayList
	
	ArrayList<Integer> elements = new ArrayList<>();
	
	elements.add(10);
	elements.add(20);
	elements.add(30);
	elements.add(40);
	

	
	
  
}
  
  
}
