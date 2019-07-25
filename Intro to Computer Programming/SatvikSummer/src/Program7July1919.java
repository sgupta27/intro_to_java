/**
 * Created by guptar1 on 7/19/2019.
 */
public class Program7July1919 {
    public static void main (String args[]){
        EasyReader console = new EasyReader();
        System.out.println(" This program will tell you the slope of a line.");
        System.out.println(" What is the first X coordinate?");
        int firstx =  console.readInt();
        System.out.println(" What is the first Y coordinate?");
        int firsty = console.readInt();
        System.out.println(" What is the second X coordinate?");
        int secondx =  console.readInt();
        System.out.println(" What is the second Y coordinate?");
        int secondy = console.readInt();
        System.out.println(" Your slope is " + ((secondy - firsty) / (secondx - firstx)));

        System.out.println("What is ");


    }
}


