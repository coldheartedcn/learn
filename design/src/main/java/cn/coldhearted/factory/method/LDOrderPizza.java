package cn.coldhearted.factory.method;

import cn.coldhearted.factory.pizza.LDCheesePizza;
import cn.coldhearted.factory.pizza.LDPepperPizza;
import cn.coldhearted.factory.pizza.Pizza;

/**
 * Created by wengxinkan on 16/8/25.
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
