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
        return "Tea{ name , price, weight}"+this.getName()+","+ this.getPrice()+","+ this.getWeight()  ;
    }
}
