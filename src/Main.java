import com.demo.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Press 1 for farmhouse");
            System.out.println("Press 2 for veg");
            System.out.println("Press 3 for non veg");
            int pizzaType= scanner.nextInt();
            BasePizza pizza;
            if(pizzaType==1){
                pizza= new Farmhouse();
            }
            else if (pizzaType==2){
                pizza= new Veg();
            }
            else if (pizzaType==3){
                pizza= new NonVeg();
            }
            else {
                System.out.println("Please choose a valid pizza type");
                continue;
            }

            System.out.println("Press 1 for extra cheese");
            boolean cheese= scanner.nextBoolean();
            if(cheese== true){
                pizza= new ExtraCheese(pizza);
            }
            System.out.println("Press 1 for extra veggies");
            boolean veggies= scanner.nextBoolean();
            if(veggies==true){
                pizza= new ExtraVeggies(pizza);
            }
            System.out.println("So your bill is: " + pizza.cost());
        }
    }
}