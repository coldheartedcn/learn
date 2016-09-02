package cn.coldhearted.factory.abs;

/**
 * Created by wengxinkan on 16/8/25.
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new LDFactory());
    }
}
