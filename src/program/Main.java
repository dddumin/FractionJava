package program;

import model.Fraction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Fraction fraction1 = new Fraction(3);
        Fraction fraction2 = new Fraction(3, 5);
        Fraction fraction3 = new Fraction(2, 7);
        Fraction fraction4 = new Fraction(4, 2);
        Fraction fraction5 = new Fraction(125, 16);
        Fraction fraction6 = new Fraction(5, 8);

        //System.out.println(Fraction.getC());
        Fraction fraction = new Fraction("5 2");
        System.out.println(fraction.getB());
        System.out.println(new Fraction("5 2"));


        /*System.out.println(fraction1.multiplication(5));
        System.out.println(fraction2.multiplication(fraction3));
        System.out.println(fraction3.addition(fraction5));
        System.out.println(fraction3.division(13.25));
        System.out.println(fraction5.subtraction(fraction2));
        System.out.println(fraction6.reverse());*/


        /*Fraction[] fractions = new Fraction[]{fraction1, fraction2, fraction3, fraction4, fraction5};


        System.out.println(Arrays.toString(fractions));

        Arrays.sort(fractions);

        System.out.println(Arrays.toString(fractions));

        Arrays.sort(fractions, (o1, o2) -> -Integer.compare(o1.getA()*o2.getB(), o2.getA()*o1.getB()));

        System.out.println(Arrays.toString(fractions));

        System.out.println(Fraction.maxFunction(fractions));*/


       /* System.out.println(fraction1.additions(fraction2));*/



        /*System.out.println(Fraction.nod(-5, -25));*/



      /*  try {
            System.out.println(new Fraction(3, 0));
        } catch (Exception e) {
            System.out.println("Denominator cannot be 0");;
        }*/


    }
}
