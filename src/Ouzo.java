public class Ouzo extends Drink implements Alcohol{
    private double alcohol;

    public Ouzo(String name, int price, int weight, double alcohol) {
        super(name, price, weight);
        this.alcohol = alcohol;
    }

    @Override
    public double getAlcohol() {
        return alcohol;
    }

    @Override
    public String getServerInfo(){
        return "Room Temperature";
    }
}
