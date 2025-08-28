public class Beer extends Drink implements Alcohol {
    public double alcohol;

    public Beer(String name, double price, double weight, double alcohol) {
       // super(name, price, weight);
        super(name,price,weight);
        this.alcohol = alcohol;

    }


    @Override
    public double getAlcohol() {
        return alcohol;
    }

    @Override
    public String getServerInfo(){
        return "Cold";
    }


}