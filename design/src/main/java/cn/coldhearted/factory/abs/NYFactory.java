package cn.coldhearted.factory.abs;

import cn.coldhearted.factory.pizza.NYCheesePizza;
import cn.coldhearted.factory.pizza.NYPepperPizza;
import cn.coldhearted.factory.pizza.Pizza;

/**
 * Created by wengxinkan on 16/8/25.
 */
public class NYFactory implements AbsFactory {
    public Pizza createPizze(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new NYPepperPizza();
        }

        return pizza;
    }
}
