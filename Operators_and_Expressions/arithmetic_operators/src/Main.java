import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner takes user input from console
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base length of triangle");
        double base = input.nextDouble();
        System.out.println("Enter height of triangle");
        double height=input.nextDouble();
        System.out.println("Area = "+rightTriangleArea(base,height)+"sq units");
    }
    public static double rightTriangleArea(double base,double height){
        // *,+,/,%,- are arithmetic operators, * used here
        //Math.round is rounding up the digits to 2 decimal points
        return (double) Math.round((0.5 * base * height) * 100) /100;
    }


}

