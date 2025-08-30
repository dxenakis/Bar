public class Tea extends Drink{

    public Tea(String name, double price, double weight ) {
        super(name, price, weight);

    }

    @Override
    public String getServerInfo(){
        return "Cold or Hot";
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                ", weight=" + this.getWeight() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
