package cn.coldhearted.factory.method;

import cn.coldhearted.factory.pizza.Pizza;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by wengxinkan on 16/8/25.
 */
public abstract class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;

        do {
            orderType = getType();
            pizza = createPizza(orderType);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (StringUtils.isNotEmpty(orderType));
    }

    abstract Pizza createPizza(String orderType);

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
