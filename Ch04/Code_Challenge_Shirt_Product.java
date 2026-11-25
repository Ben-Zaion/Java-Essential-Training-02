// Java code​​​​​‌​​​​‌​‌​‌‌‌​‌​‌‌‌‌​‌‌‌‌​‌ below

/** ***************************************************
 * Write your answer here, and then test your code.
 * Update Shirt class to implement the Product interface.
 ***************************************************** */
class Answer {

    public static void main(String[] args) {
        String name = "Golf Shirt";
        double price = 49.95;
        String color = "White";
        String size = "Medium";
        Shirt shirt = Answer.buyShirt(name, price, size, color);
        System.out.println("Shirt name: " + shirt.getName());
        System.out.println("Shirt price: " + shirt.getPrice());
        System.out.println("Shirt size: " + shirt.getSize());
        System.out.println("Shirt color: " + shirt.getColor());
    }

    /**
     * *************************************************
     * Change these boolean values to control whether you see the expected
     * result and/or hints.
    ***************************************************
     */
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Do not change this method
    static Shirt buyShirt(String name, double price, String size, String color) {
        return new Shirt(name, price, size, color);
    }
}

// Do not change this interface
interface Product {

    String getName();

    void setName(String name);

    double getPrice();

    void setPrice(double price);
}

/**
 * ********************************************************
 * TODO: Update this class to implement the Product interface.
**********************************************************
 */
class Shirt implements Product {

    private String size;
    private String color;

    private String name;
    private double price;

    public Shirt(String name, double price, String size, String color) {
        setName(name);
        setPrice(price);
        setSize(size);
        setColor(color);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
