/**
 * Created by guptar1 on 7/18/2019. This program is designed to allow user to enter five student
 * scores. The program will then calculate and output the sum and average of the
 * scores.
 */
public class Program3July1819 {
    public static void main (String args []){
        EasyReader console = new EasyReader();
        System.out.println("This program will take 3 scores and give you the total fraction and average of these scores");
        System.out.println("What is the first score?");
        double first = console.readDouble();
        System.out.println("How many points were possible?");
        double firstpossible = console.readDouble();
        System.out.println("What is the second score?");
        double second = console.readDouble();
        System.out.println("How many points were possible?");
        double secondpossible = console.readDouble();
        System.out.println("What is the third score?");
        double third = console.readDouble();
        System.out.println("How many points were possible?");
        double thirdpossible = console.readDouble();
        System.out.println(" The total of these scores are " + (first + second + third) + " out of " + (firstpossible + secondpossible + thirdpossible));
        System.out.println(" The average of these scores is " + (first + second + third)/3 + " out of " + (firstpossible + secondpossible + thirdpossible)/3 + " or " + ((first / firstpossible) + (second / secondpossible) + (third / thirdpossible))/3 *100 + "%" );
    }
}
