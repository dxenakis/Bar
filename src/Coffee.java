public class Coffee extends Drink {
    public Coffee(String name, double price, double weight ) {
        super(name, price, weight);
    }

    @Override
    public String getServerInfo(){
        return "Cold or Hot";
    }



}
