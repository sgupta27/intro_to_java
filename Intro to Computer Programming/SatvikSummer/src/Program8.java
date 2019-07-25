/*
 	Name:
	Date Created:
	Date Modified:
	Program #:			8
	Description:		The program will provide the user a menu from which the user can select from various menu options.
	Bonus:
*/
public class Program8 {
    public static void main(String args[]) {
        EasyReader console = new EasyReader();
        System.out.print("Please choose from the following list of menu items"
                + "\n(1) Output users name (1 per line) x times" + "\n(2) Output a list of every odd number from 1-X"
                + "\n(3) Output a table of integers from X down to 1, with their squares and square roots"
                + "\n(4) Output a list of divisors of a number entered by user" + "\n(5) Exit");
        System.out.print("\n\nChoice (1-5) = ");
        int choice = console.readInt();
        if (choice == 1) {
            System.out.print("What's your name? ");
            console.readLine();
            String name = console.readLine();
            System.out.print("How many times do you want to see your name? ");
            int amount = console.readInt();
            for (int i = 0; i < amount; i++) {
                System.out.print("\n" + name);
            }
        } else if (choice == 2) {
            System.out.print("Number = ");
            int oddNumber = console.readInt();
            if (oddNumber % 2 == 0) {
                oddNumber = oddNumber - 1;
            }
            for (int i = 1; i <= oddNumber; i++) {
                if (i % 2 == 1) {
                    System.out.print(i + " ");
                }
            }
        } else if (choice == 3) {
            System.out.print("Number = ");
            int squareNumber = console.readInt();
            for (int i = squareNumber; i > 0; i--) {
                double SqrtI = Math.sqrt(i);
                SqrtI = Math.round((SqrtI) * 10) / 10.0;
                System.out.println(i + " " + (i * i) + " " + SqrtI);
            }
        } else if (choice == 4) {
            System.out.print("Number = ");
            int input = console.readInt();
            for (int i = 1; i <=input; i++) {
                if (input % i ==0) {
                    System.out.print(i+ " ");
                }
            }
        } else {
            System.exit(0);
        }
    }
}