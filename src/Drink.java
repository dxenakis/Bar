import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return Double.compare(price, drink.price) == 0 && Double.compare(weight, drink.weight) == 0 && Objects.equals(name, drink.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}

