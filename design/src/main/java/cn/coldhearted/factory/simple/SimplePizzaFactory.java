package cn.coldhearted.factory.simple;

import cn.coldhearted.factory.pizza.CheesePizza;
import cn.coldhearted.factory.pizza.GreekPizza;
import cn.coldhearted.factory.pizza.PepperPizza;
import cn.coldhearted.factory.pizza.Pizza;

/**
 * Created by wengxinkan on 16/8/25.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new GreekPizza();
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
        }

        return pizza;
    }

}
