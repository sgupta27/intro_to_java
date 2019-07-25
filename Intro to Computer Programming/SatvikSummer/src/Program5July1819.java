/**
 * Created by guptar1 on 7/19/2019. This program is designed to check to see if one number is a multiple of another number.
 */
public class Program5July1819 {
    public static void main (String args[]){
        System.out.println("What is your name?");

        EasyReader console = new EasyReader();

        String name = console.readLine();

        System.out.println(name + " , what is the first number? (Put higher number here)");

        int firstnumber = console.readInt();

        System.out.println(name + " , what is the second number? (Put lower number here)");

        int secondnumber = console.readInt();

        if (firstnumber % secondnumber == 0){
            System.out.println(" Congrats! " + firstnumber + " is a multiple of " + secondnumber );
        }
        else {
            System.out.println(firstnumber + " is not a multiple of " + secondnumber);
        }


    }
}
