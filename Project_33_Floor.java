public class PProject_33_Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;

        if (width < 0) {
            this.width = 0;
        }
        if (length < 0) {
            this.length = 0;
        }
    }

    public double getArea() {
        return (width * length);
    }
}

class Carpet {

    private double cost;

    public Carpet(double cost) {
        this.cost = cost;

        if (cost < 0) {
            this.cost = 0;
        }
    }

    public double getCost() {
        return cost;
    }
}


class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }

    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("Total = " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("Total = " + calculator.getTotalCost());
    }
}
