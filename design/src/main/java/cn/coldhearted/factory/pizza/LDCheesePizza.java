package cn.coldhearted.factory.pizza;

/**
 * Created by wengxinkan on 16/8/25.
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("LDCheesePizza");

        System.out.println(name + " preparing;");
    }
}
