package codeeval;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

public class First_non_repeated_character {
	

	static int index_checker, index_checker2;
	public static void main(String[] args) throws IOException {
		
		String str = "C:/Users/gandh/Desktop/test.txt";
		File f = new File(str);
	
		BufferedReader bis = new BufferedReader(new FileReader(f));
		String newline = bis.readLine();
		 int i =0;
		while(newline != null)
		{ 
			char array1[] = newline.toCharArray();
			i=0;
			for (char c : array1) 
			{
				char array2[] = Arrays.copyOfRange(array1, 0, i);
				
				char array3[] = Arrays.copyOfRange(array1, i, array1.length);
				Arrays.sort(array2);
				Arrays.sort(array3);
			index_checker = Arrays.binarySearch(array2, array1[i]);
			index_checker2= Arrays.binarySearch(array3, array1[i]);
		//	System.out.println(array2);
			//System.out.println(array3);
		//System.out.println(index_checker);
			//System.out.println(index_checker2);
			
			if (index_checker < 0 && index_checker2 < 0) 
			{
				
				System.out.println(array1[i]);
				break;
			}
			i++;
			}
			newline = bis.readLine();
		}
		
		
	}

}
