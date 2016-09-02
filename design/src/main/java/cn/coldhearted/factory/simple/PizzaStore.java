package cn.coldhearted.factory.simple;

import org.junit.Test;

/**
 * Created by wengxinkan on 16/8/25.
 */
public class PizzaStore {

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory;
        OrderPizza orderPizza = new OrderPizza(new SimplePizzaFactory());
    }

}
