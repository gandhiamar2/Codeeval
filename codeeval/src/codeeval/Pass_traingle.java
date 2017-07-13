package codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pass_traingle {

	  
	 
	 static String[][] sum_max;
	public static void main(String[] args) throws IOException {
		String str = "C:/Users/gandh/Desktop/test.txt";
		File f = new File(str);
		
		int n=0;
		List<List<Integer>> line = new ArrayList<List<Integer>>();

		List<Integer> line3 = new ArrayList<Integer>();
		//String[] line2 = {"a"};
		List<String> line1 = new ArrayList<String>();
		
		BufferedReader bis = new BufferedReader(new FileReader(f));
		String newline = bis.readLine();
		
		
		while(newline != null)
		{ 
			if(n>=0){
				String line2[] = newline.split(" ");
			line1 = Arrays.asList(line2);
			//line3.clear();
			for (int i = 0; i < line1.size(); i++)  {
				line3.add(Integer.parseInt(line1.get(i)));
				
			}
			
			}
			else
			{
				line3.add(Integer.parseInt(newline));
				
				
			}
			line.add(new ArrayList<Integer>(line3));
			
			
			newline = bis.readLine();
			
			//System.out.println(line);
			n++;
			line3.clear();
		
		}
		
		
		
		for (int i = n-2; i >=0 ; i--) 
		{
			for (int j = 0; j < line.get(i).size(); j++) 
		{
				
			if(line.get(i+1).get(j) > line.get(i+1).get(j+1))
			{
			line.get(i).set(j, line.get(i).get(j)+ line.get(i+1).get(j)) ; 
			}
			
			else
				line.get(i).set(j, line.get(i).get(j)+ line.get(i+1).get(j+1)) ; 
					
		}
	
			
		}
		
		
		System.out.println(line.get(0).toString().replace("[", "").replace("]", ""));
		
	}
	
}
