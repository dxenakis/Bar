public abstract class Drink {
    private final String name;
    private final double price;
    private final double weight;


    public Drink(String name, double price, double weight ) {
        this.name = name;
        if (price < 0 ){
//            throw new IllegalArgumentException();
            System.out.println("Δεν επιτρέπεται αρνητική τιμή, θα αρχικοποιηθεί με 0");
            this.price = 0;
        }else {
            this.price = price;
        }
        this.weight = weight;
    }

    /*Bad Practice for changes Values.
    public void changePrice(double price){
        this.price = price;
    }
    */
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getServerInfo() {
        return null;
    }


}

