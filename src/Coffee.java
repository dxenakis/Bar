public class Coffee extends Drink {
    public Coffee(String name, int price, int weight ) {
        super(name, price, weight);
    }

    @Override
    public String getServerInfo(){
        return "Cold or Hot";
    }
}
