/**
 * Created by guptar1 on 7/20/2019.
 */
public class Papa$25 {
    public static void main(String args[]) {
        System.out.println("This program will take a 7 digit number and convert it into different possibilities of words.");

        EasyReader console = new EasyReader();

        System.out.println("Please type in a 7 digit number below without the digits 0 or 1.");

        double sevendigit = console.readDouble();

        if ((2222222 < sevendigit) && (sevendigit < 9999999)) {

            System.out.println("Your number is " + sevendigit);
        } else {
            System.out.println("LEARN HOW TO COUNT, BETA!!!!!!!!!!!!!");
        }

        String individuallettersoutoftheseven = new Double(sevendigit).toString();
        int i = 0;
        while (i < 7) {
            char firstdigit = individuallettersoutoftheseven.charAt(i);

            System.out.println(" The letter at position " + i + " is " + firstdigit);

            if (firstdigit == '2') {

                System.out.print(" A ");

                System.out.print(" B ");

                System.out.print(" C ");

            } else if (firstdigit == '3') {

                System.out.print(" D ");

                System.out.print(" E ");

                System.out.print(" F ");
            }
            i = i + 1;
        }

    }
}
/*
        2 - ABC 3 - DEF 4 - GHI 5 - JKL 6 - MNO 7 - PQRS 8 - TUV 9 - WXYZ
        so we will have 8 if statements and it will be like if u press 2 than it will cycle between the 3 letters like in one run itll be like a then the next itll be b and then c and then ittll start over at a
         */