import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      //  Drink d = new Drink();
        Beer beer = new Beer("Alpha Beer",-2,2,10.0);
        Beer beer1 = new Beer("Alpha Beer",-2,2,10.0);
        System.out.println("Beer Name is:"+beer.getName()+" Price is :"+beer.getPrice());
        Tea tea = new Tea("Green Tea",1.0,2.0);
        System.out.println(beer1 == beer);
        System.out.println(beer1.equals(beer));
        List<Drink> drinkList = new ArrayList<Drink>();
        drinkList.add(beer);
        drinkList.add(new Tea("Tea",10.0,10.0));
        drinkList.add(new Coffee("Coffee",10.0,100.0));
        drinkList.forEach(drink -> System.out.println(drink));

    }
}