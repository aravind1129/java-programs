package HelloWorld;

public class Demo {

	public static void main(String[] args) {
		
		int num =12365;
		int index=5;
		int rem;
		
		
		while(num>0)
		{
			rem = num%10;
			num = num/10;
			if(index%2==0)
			{
				rem+=index;
				if(rem>=10)
				{
					int last = rem%10;
					int first  = rem/10;
					rem = last+ first;
					System.out.println(rem);
				}
				else {
					
					System.out.println("even "+rem);
				}
				
			}
			else
				System.out.println("odd "+rem);
			index--;
		}
		
		
		

	}

}
