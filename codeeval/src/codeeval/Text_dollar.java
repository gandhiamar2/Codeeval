package codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;

public class Text_dollar {



	public static void main(String[] args)throws IOException {



		String fileinput = "C:/Users/gandhiamar2/Desktop/test.txt";

		File f = new File(fileinput);

		BufferedReader bfr = new BufferedReader(new FileReader(f));

		String newline = bfr.readLine();



		while(newline != null)
		{
			int ndigits = newline.length();
			String Dollars = "Dollars";
			String[] alpha= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
			String[] alphaunique = {"","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
			String[] alphatens = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninty"};
			String[] alphahundreds = {"","Hundred","Hundred","Hundred","Hundred","Hundred","Hundred","Hundred","Hundred","Hundred"};
			String[] alphathousands = {"","Thousand","Thousand","Thousand","Thousand","Thousand","Thousand","Thousand","Thousand","Thousand"};
			int a[] = new int[ndigits]; 
			if((Integer.parseInt(newline)>10 &&Integer.parseInt(newline)<20)||(Integer.parseInt(newline)>10000 &&Integer.parseInt(newline)<20000) )
			{
				//a[ndigits-2]= Integer.parseInt(newline.substring(ndigits-1));
				//alphatens = alphaunique;
				//for (int i = 0; i < ndigits-2; i++) {
				//a[i]=Integer.parseInt(newline.substring(i,i+1));
				a[ndigits-1]= Integer.parseInt(newline.substring(ndigits-1));


				for (int i = 0; i < ndigits-1; i++) {
					a[i]=Integer.parseInt(newline.substring(i,i+1));
				}

			}
			else{
				a[ndigits-1]= Integer.parseInt(newline.substring(ndigits-1));


				for (int i = 0; i < ndigits-1; i++) {
					a[i]=Integer.parseInt(newline.substring(i,i+1));
				}

			}
			switch (ndigits) {
			case 1:
				System.out.println(alpha[a[0]]+Dollars);
				break;
			case 2:
				System.out.println(alphatens[a[0]] +alpha[a[1]]+Dollars );
				break;
			case 3:
				System.out.println(alpha[a[0]]+alphahundreds[a[0]] +alphatens[a[1]]+alpha[a[2]]+Dollars );
				break;
			case 4:
				System.out.println(alpha[a[0]]+alphathousands[a[0]] +alpha[a[1]]+alphahundreds[a[1]]+alphatens[a[2]]+alpha[a[3]]+Dollars );
				break;
			case 5:
				System.out.println(alphatens[a[0]]+alpha[a[1]]+ alphathousands[a[0]] +alpha[a[2]]+alphahundreds[a[2]]+alphatens[a[3]]+alpha[a[4]] +Dollars);
				break;
			default:
				break;
			}


			newline= bfr.readLine();
		}

	}
}
