public class Project_8_AreaCalculator {
    public static void main(String[] args) {
        area(-12);
        area(4,1);
    }

    public static double area (double radius){

        double areaOfCircle = radius * radius * Math.PI;
        if(radius < 0){
            System.out.println("Invalid input.");
            return -1.0;
        }else
            System.out.println("The area of the circle is: " + areaOfCircle);
            return areaOfCircle;
    }

    public static double area (double x, double y){
        double areaOfRectangle = x * y;

        if((x < 0) || (y < 0)){
            System.out.println("Invalid input.");
            return -1;
        } else
            System.out.println("The area of the rectangle is: " + areaOfRectangle);

        return areaOfRectangle;
    }
}
