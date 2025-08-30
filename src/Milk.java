public class Milk extends Drink {
    public Milk(String name, double price, double weight ) {
        super(name, price, weight);

    }

    @Override
    public String getServerInfo(){
        return "Cold or Hot";
    }
}
