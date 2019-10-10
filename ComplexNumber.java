public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }

    public void add(ComplexNumber complexNumber) {
        this.add(complexNumber.getReal(), complexNumber.getImaginary());
    }

    public void subtract(double real, double imaginary) {
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }

    public void subtract(ComplexNumber complexNumber) {
        this.subtract(complexNumber.getReal(), complexNumber.getImaginary());
    }

    public static void main(String[] args) {
        ComplexNumber firstNumber = new ComplexNumber(1.0, 1.0);
        ComplexNumber secondNumber = new ComplexNumber(2.5, -1.5);
        firstNumber.add(1, 1);
        System.out.println("FirstNumber.realPart = " + firstNumber.getReal());
        System.out.println("FirstNumber.imaginaryPart = " + firstNumber.getImaginary());
        firstNumber.subtract(secondNumber);
        System.out.println("FirstNumber.realPart = " + firstNumber.getReal());
        System.out.println("FirstNumber.imaginaryPart = " + firstNumber.getImaginary());
        secondNumber.subtract(firstNumber);
        System.out.println("SecondNumber.realPart = " + secondNumber.getReal());
        System.out.println("SecondNumber.imaginaryPart = " + secondNumber.getImaginary());
        firstNumber.add(secondNumber);
        System.out.println("FirstNumber.realPart = " + firstNumber.getReal());
        System.out.println("FirstNumber.imaginaryPart = " + firstNumber.getImaginary());
    }
}
