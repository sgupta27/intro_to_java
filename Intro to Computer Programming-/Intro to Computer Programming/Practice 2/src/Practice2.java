/*************************************************************************** Class:  <Program or class name nere>Author:  <YOUR NAME HERE>  Date:  <date here><Description of program or class here>Date		Modification****************************************************************************/public class Practice2 {	public static void main(String args[]) 	{				EasyReader console = new EasyReader();				System.out.print("What is your name? ");				String userName = console.readLine();		String myName = "Sarvesh Gupta";				System.out.print("\n" + "Hello " + userName +"! My name is " + myName + ". Nice to meet you! What is your middle initial? (Type underscore if you don't have a middle name.");		char middleName = console.readChar();				System.out.print(userName + " " + middleName + "., how old are you?");		int userAge = console.readInt();		int myAge = 13;				System.out.println("\n" + "So you are " + userAge + "  years old? Cool! I'm " + myAge + " years old. ");				int ageDiff = Math.abs(userAge - myAge);				if (ageDiff == 0)		{			System.out.print("\n" + "We are the same age!");		}		else		{			System.out.print("\n" + "Wow, we're only " + ageDiff + " years apart!");		}			System.out.print(" What's your GPA? ");		double userGPA = console.readDouble();		double myGPA = 6.66;				if (userGPA >= 3.00)			System.out.print("\n" + "Wow, good job! You seem like you work hard in school. Keep it up! My GPA is " + myGPA + ".");		else			System.out.print("\n" + "That's okay! Just keep up the good work and that decent GPA will definitely go up! My GPA is " + myGPA + ".");				double ageDecimal = (double) userAge / 100;				System.out.print("\n" + "Your age decimal is " + ageDecimal + ".");	}}				