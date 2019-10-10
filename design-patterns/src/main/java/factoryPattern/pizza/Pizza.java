package factoryPattern.pizza;


import factoryPattern.factory.ingredient.cheese.Cheese;
import factoryPattern.factory.ingredient.clams.Clams;
import factoryPattern.factory.ingredient.dough.Dough;
import factoryPattern.factory.ingredient.pepperoni.Pepperoni;
import factoryPattern.factory.ingredient.sauce.Sauce;
import factoryPattern.factory.ingredient.veggies.Veggies;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    ArrayList toppings = new ArrayList();


    public abstract void prepare();    //使用工厂生产的原料来重新做
//    public void prepare(){
//        System.out.println("Preparing " + name);
//        System.out.println("擀面团...");
//        System.out.println("添加调料...");
//        for (int i = 0; i < toppings.size(); i++) {
//            System.out.println("    " + toppings.get(i));
//
//        }
//    }

    public void bake() {
        System.out.println("在350°下烘焙25分钟 ");
    }

    public void cut() {
        System.out.println("将披萨切块;");
    }

    public void box() {
        System.out.println("将披萨打包");
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
