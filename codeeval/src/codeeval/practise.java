package codeeval;



public class practise {

	
	
	public static void main(String[] args) {
				
		for (int i = 0; i <=100; i++) {
			if(i%3==0)
			{
				if(i%5==0)
				{
					System.out.println("rightpoint");
				}
				else
					System.out.println("right");
	
			}
			
			else if(i%5==0)
			
				System.out.println("point");
			
			else
				System.out.println(i);
		}
		
	}
	
	
}
