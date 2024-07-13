package test;

abstract class Engine {

    public abstract void engineType();

}

class Vehicle {

    public void transport(Engine e) {
        e.engineType();
    }

}


class Duck extends Vehicle {

    public Duck() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private String color;
    private int height;
    private int length;

    public void setData(int length, int theHeight) {
        length =  length; // Backwards -- not good!
        height = theHeight; // Fine, because a different name
        this.color = "white"; // Fine, but this. reference not necessary
    }


    public static void main(String[] args) {
        Duck b = new Duck();
        b.setData(1, 2);
        System.out.print(b.length + " " + b.height + " " + b.color);
    }


}


class Tester {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.transport(new Engine() {
            @Override
            public void engineType() {
                System.out.println("Turbo engine");
            }
        });

        Duck b = new Duck();
        b.setData(1, 2);
        System.out.print(b.getLength() + " " + b.getHeight() + " " + b.getColor());
    }
}
