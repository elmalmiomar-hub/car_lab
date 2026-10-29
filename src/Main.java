class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;


    public Car(String model, String brand, int year,
               double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }


    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public String delivery() {
        if (quantity > 0) {
            quantity--;
            return "Car delivered successfully.";
        } else {
            return "No cars available for delivery.";
        }
    }

    public String sell() {
        if (quantity > 0) {
            quantity--;
            return "Car sold successfully.";
        } else {
            return "No cars available for sale.";
        }
    }

    @Override
    public String toString() {
        return "Model: " + model
                + ", Brand: " + brand
                + ", Year: " + year
                + ", Price: " + price
                + ", Color: " + color
                + ", Quantity: " + quantity;
    }
}

public class Main {
    public static void main(String[] args) {


        Car car = new Car(
                "Corolla", "Toyota", 2022,
                25000, "White", 5
        );


        System.out.println("Initial information:");
        System.out.println(car.toString());


        System.out.println("\nSell method:");
        System.out.println(car.sell());

        System.out.println("\nDelivery method:");
        System.out.println(car.delivery());


        System.out.println("\nAll fields using getters:");
        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());


        car.setModel("Prius");
        car.setBrand("Toyota");
        car.setYear(2023);
        car.setPrice(22000);
        car.setColor("Black");
        car.setQuantity(3);

        System.out.println("\nAfter changes:");
        System.out.println(car.toString());
    }
}
