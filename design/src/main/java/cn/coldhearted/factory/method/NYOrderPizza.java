package cn.coldhearted.factory.method;

import cn.coldhearted.factory.pizza.NYCheesePizza;
import cn.coldhearted.factory.pizza.NYPepperPizza;
import cn.coldhearted.factory.pizza.Pizza;

/**
 * Created by wengxinkan on 16/8/25.
 */
public class NYOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new NYPepperPizza();
        }

        return pizza;
    }
}
