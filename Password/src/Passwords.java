import java.util.Scanner;

public class Passwords {										//class

	public static void main(String[] args) {					//metod
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		String pass= "1234";									//objekt
		
		System.out.println("Enter your Username: ");   //printLn output ny rad s� anv�ndaren ser vad den ska g�ra.
		String name= reader.nextLine();
		
		System.out.println("Enter your Password: ");
		String password=reader.nextLine();
		
		if (password.equals(pass))						//om password som anv�ndaren skriver in �r lika med pass som �r 1234
		{	
		System.out.println("Welcome "+ name +" You have loged in ");		//kommer denna texten ut.
		}
		else																//annars
		{
			System.out.println("Wrong password you have 2 attempt left try again ");		//kommer denna texten ut.
			String password2=reader.nextLine();												//sen k�rs allt om under h�r.
				if (password2.equals(pass))
				{
					System.out.println("Welcome "+ name +" You are in ");
					}
					else
					{
						System.out.println("Wrong password you have 1 attempt left try again ");
						String password3=reader.nextLine();
						if (password3.equals(pass))
						{
							System.out.println("Welcome "+ name +" You are in ");
							}
							else
							{
								System.out.println("Wrong password try again later ");
					}
			reader.close();
			}
		}
	}
}
