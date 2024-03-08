package pl.vistula.exercise3;

import java.io.BufferedReader;
import java.io.IOException;

public class BasicCalculator {
    public static void main(string[] args) throws IOException{
        float firstNumberMatusiak,secondNumberMatusiak,sum,substraction,production,product,quotient;
        BufferedReader br=new BufferedReader(new inputStreamReader(System.in));
        System.out.println("The program calculates sum, difference, product and quotient for two numbers.");
        System.out.println("Enter the first number(and press Enter): ");
        firstNumberMatusiak = Float.parseFloat(br.readLine());
        System.out.println("enter the second number(and press enter)");
        secondNumberMatusiak = float.parseFloat(br.readLine());

        sum=firstNumberMatusiak+secondNumberMatusiak;
        substraction=firstNumberMatusiak-secondNumberMatusiak;
        product=firstNumberMatusiak*secondNumberMatusiak;
        quotient=firstNumberMatusiak/secondNumberMatusiak;
        System.out.printf("you entered two numbers, the first is  "+"%2.2%",firstNumberMatusiak);
    }
}


