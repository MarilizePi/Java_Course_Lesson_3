public class Wall {

    private double width;
    private double height;

    //Default constructor
    public Wall() {
        this(0, 0);
    }

    //Constructor with two parameters
    public Wall(double width, double height) {
        this.width = width;
        this.height = height;

        if (width < 0) {
            this.width = 0;
        }
        if (height < 0) {
            this.height = 0;
        }
    }


    public void setHeight(double height) {
        this.height = height;
        if (this.height < 0) {
            this.height = 0;
        }
    }

    public void setWidth(double width) {
        this.width = width;
        if (this.width < 0) {
            this.width = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        double area = (this.width * this.height);
        return area;
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("Area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("Width = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        System.out.println("Area = " + wall.getArea());
    }

}
