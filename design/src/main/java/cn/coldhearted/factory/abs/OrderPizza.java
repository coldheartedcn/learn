package cn.coldhearted.factory.abs;

import cn.coldhearted.factory.pizza.Pizza;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by wengxinkan on 16/8/25.
 */
public class OrderPizza {
    AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    public void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType;

        this.factory = factory;

        do {
            orderType = getType();
            pizza = factory.createPizze(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (StringUtils.isNotEmpty(orderType));
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
