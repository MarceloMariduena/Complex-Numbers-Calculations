// @autor: Marcelo Mariduena

// implements Cloneable: makes it legal to create field-for-field copy of instances of methods
public class Complex implements Cloneable {
  private double x, y;
  
  // Default constructor sets a and b to 0
  public Complex(){
    x = 0;
    y = 0;
  }
  
  // Constructor with two arguments: x is real and y is imaginary
  public Complex(double x, double y){
    this.x = x;
    this.y = y;
  }
  
  /* Getters */
  public double getReal(){return x;} //lol
  public double getImaginary(){return y;}
  
  // Adding onto the complex number
  public Complex add(Complex complex){return new Complex(x + complex.x, y + complex.y);}
  
  // Subtract from the complex number
  public Complex subtract(Complex complex){return new Complex(x - complex.x, y - complex.y);}
  
  // Multiply the complex numbers
  public Complex multiply(Complex complex){
    return new Complex(x * complex.x - y * complex.y, y * complex.x + x * complex.y);
  }
  
  // Divide from the current complex number
  public Complex divide(Complex complex){
    double denum = (complex.x * complex.x) + (complex.y * complex.y);
    return new Complex(
                       (x * complex.x + y * complex.y) / denum,
                       (y * complex.x - x * complex.y) / denum
  );}
  
  // Return the absolute value between the two complex numbers
  public double abs(){return Math.sqrt((x * x) + (y * y));}
  
  @Override
  public String toString(){
    return y == 0 ? x + "" : "(" + x + " + " + y + "i)";
  }
  
}