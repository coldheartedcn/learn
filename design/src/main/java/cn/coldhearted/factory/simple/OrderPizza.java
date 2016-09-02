package cn.coldhearted.factory.simple;

import cn.coldhearted.factory.pizza.Pizza;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by wengxinkan on 16/8/25.
 */
public class OrderPizza {

    SimplePizzaFactory simplePizzaFactory;

    public OrderPizza(SimplePizzaFactory simplePizzaFactory) {
        setFactory(simplePizzaFactory);
    }

    public void setFactory(SimplePizzaFactory simplePizzaFactory) {
        Pizza pizza = null;
        String orderType;

        this.simplePizzaFactory = simplePizzaFactory;

        do {
            orderType = getType();
            pizza = simplePizzaFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while(StringUtils.isNoneEmpty(orderType));

    }

    private String getType() {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String type = input.readLine();

            return type;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
