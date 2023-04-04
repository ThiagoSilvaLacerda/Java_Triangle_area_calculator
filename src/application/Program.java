package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner (System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a=input.nextDouble();
        x.b=input.nextDouble();
        x.c=input.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a=input.nextDouble();
        y.b=input.nextDouble();
        y.c=input.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.2f", areaX);
        System.out.printf("Triangle Y area: %.2f", areaY);

        if (areaX>areaY){System.out.println("Larger area: X");}
        else if (areaY>areaX) {System.out.println("Larger area: Y");}
        else{System.out.println("Same area X and Y");}
    
        input.close();
    }
}
