package model;

import java.util.Objects;

public class Fraction implements Comparable<Fraction> {
    private int a;
    private int b = 1;
    private static int c = 0;

    public Fraction() {
        c+=1;
    }

    public Fraction(Fraction fraction) {
        this.a = fraction.a;
        this.b = fraction.b;
        c+=1;
    }

    public Fraction(int a) {
        this.a = a;
        c+=1;
    }

    public Fraction(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Denominator cannot be 0");
        this.b = b;
        this.a = a;
        this.reduce();
        c+=1;
    }
// сделать ещё с пробелом
    public Fraction(String string) {
        String[] strings = string.split("/| ");
        if (strings.length > 0)
            this.a = Integer.parseInt(strings[0]);
        if (string.length()>1){
            if (Integer.parseInt(strings[1]) == 0)
                throw new ArithmeticException("Denominator cannot be 0");
            this.b = Integer.parseInt(strings[1]);
        }
        c+=1;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        if (this.b != 1)
            reduce();
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
        if (b != 1)
            reduce();
    }

    private void reduce() {
        int c = nod(this.a, this.b);
        this.a /= c;
        this.b /= c;
        if (this.b < 0) {
            this.b *= -1;
            this.a *= -1;
        }
    }

    public Fraction addition(Fraction fraction) {
        return new Fraction(this.a*fraction.b + this.b*fraction.a, this.b*fraction.b);
    }

    public Fraction addition(int i) {
        return new Fraction(this.a + this.b * i, this.b);
    }

    public double addition(double d) {
        double c = (double) this.a / this.b;
        return c + d;
    }

    public Fraction subtraction(Fraction fraction) {
        return new Fraction(this.addition(fraction.multiplication(-1)));
    }

    public Fraction subtraction(int i) {
        return new Fraction(this.a - this.b * i, this.b);
    }

    public double subtraction(double d) {
        double c = (double) this.a / this.b;
        return c - d;
    }

    public Fraction multiplication(Fraction fraction) {
        return new Fraction(this.a * fraction.a, this.b * fraction.b);
    }

    public Fraction multiplication(int i) {
        return new Fraction(this.a * i, this.b);
    }

    public double multiplication(double d) {
        double c = (double) this.a / this.b;
        return c*d;
    }

    public Fraction reverse(){
        return new Fraction(this.b, this.a);
    }

    public Fraction division(Fraction fraction){
        return this.multiplication(fraction.reverse());
    }

    public Fraction division(int i){
        return new Fraction(this.a, this.b*i);
    }

    public double division(double d){
        double c = (double) this.a / this.b;
        return c/d;
    }

    public Fraction additions(Fraction fraction){
        Fraction fraction1 = this.addition(fraction);
        this.a = fraction1.a;
        this.b = fraction1.b;
        return this;
    }

    public Fraction subtractions(Fraction fraction){
        Fraction fraction1 = this.addition(fraction);
        this.a = fraction1.a;
        this.b = fraction1.b;
        return this;
    }

    public Fraction multiplications(Fraction fraction){
        Fraction fraction1 = this.multiplication(fraction);
        this.a = fraction1.a;
        this.b = fraction1.b;
        return this;
    }

    public Fraction divisions(Fraction fraction){
        Fraction fraction1 = this.division(fraction);
        this.a = fraction1.a;
        this.b = fraction1.b;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return a == fraction.a &&
                b == fraction.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }


    @Override
    public int compareTo(Fraction o) {
        return Integer.compare(this.a*o.b, o.a*this.b);
    }

    public int compareTo(int i) {
        return  Integer.compare(this.a, i*this.b);
    }

    public int compareTo(double d){
        return Double.compare((double) this.a/this.b, d);
    }

    @Override
    public String toString() {
        if (this.a != 0){
            if (this.b == 1)
                return this.a + "";
            return this.a + "/" + this.b;
        }
        return "0";
    }

    public static int getC() {
        return c;
    }

    public static int nod (int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        for (int i = a; i >= 2; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }


    public static Fraction sum(Fraction[] fractions){
        Fraction a = new Fraction();
        for (Fraction fraction : fractions) {
            a.additions(fraction);
        }
        a.reduce();
        return a;
    }

    public static Fraction maxFunction(Fraction[] fractions){
        Fraction fraction = new Fraction(Integer.MIN_VALUE);
        for (Fraction value : fractions) {
            if (value.compareTo(fraction) > 0)
                fraction = value;
        }
        return fraction;
    }
}
