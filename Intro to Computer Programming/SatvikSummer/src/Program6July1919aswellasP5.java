/**
 * Created by guptar1 on 7/19/2019. This program will allow the user to enter the lengths of 3 sides of a triangle.
 */
public class Program6July1919aswellasP5 {
    public static void main (String args[]){
        EasyReader console = new EasyReader();

        System.out.println("\n This program will tell you what type of triangle you have.");

        System.out.println("\n What is the length of the first side? ");

        double side1 = console.readDouble();

        System.out.println("\n What is the length of the second side? ");

        double side2 = console.readDouble();

        System.out.println("\n What is the length of the third side? ");

        double side3 = console.readDouble();

        if( (side1 == side2) && (side2 == side3 )){
            System.out.println("YO! YOU GOT YOSELF UH EQUILATERAL TRY ANGLE!");
        }
        else if (side1 == side3 || side1 == side2 || side2 == side3){
            System.out.println("YO! YOU GOT YOSELF UH ISOSCELES TRY ANGLE!");
        }
        else
            System.out.println("YO! YOU GOT YOSELF UH SCAHLEAN TRY ANGLE!");

    }
}
