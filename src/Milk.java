public class Milk extends Drink {
    public Milk(String name, int price, int weight ) {
        super(name, price, weight);

    }

    @Override
    public String getServerInfo(){
        return "Cold or Hot";
    }
}
