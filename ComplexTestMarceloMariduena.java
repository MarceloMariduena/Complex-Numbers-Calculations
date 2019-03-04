// @autor: Marcelo Mariduena

import java.util.Scanner;

public class ComplexTestMarceloMariduena {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter two complex numbers
    System.out.print("Enter the first complex number: ");
    double firstDoublePartOne = input.nextDouble();
    double secondDoublePartOne = input.nextDouble();
    Complex complex1 = new Complex(firstDoublePartOne, secondDoublePartOne);
      
    System.out.print("Enter the second complex number: ");
    double firstDoublePartTwo = input.nextDouble();
    double secondDoublePartTwo = input.nextDouble();
    Complex complex2 = new Complex(firstDoublePartTwo, secondDoublePartTwo);
    
    /* Outputs */
    System.out.print(complex1 + " + " + complex2 + " = ");
    print(complex1.add(complex2));
    
    System.out.print(complex1 + " - " + complex2 + " = "); 
    print(complex1.subtract(complex2));
    
    System.out.print(complex1 + " * " + complex2 + " = "); 
    print(complex1.multiply(complex2));
    
    System.out.print(complex1 + " / " + complex2 + " = "); 
    print(complex1.divide(complex2));
    
    System.out.printf("| (%s) | = %.4f \n", complex1, complex1.abs());
    
    input.close();
  }
  
  // Displays the result
  public static void print(Complex n) {
    if (n.getImaginary() == 0) {System.out.println(n.getReal());}
    else {System.out.println(n.getReal() + " + " + n.getImaginary() + "i");}
  }
}