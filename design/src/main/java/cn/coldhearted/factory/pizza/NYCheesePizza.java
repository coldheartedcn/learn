package cn.coldhearted.factory.pizza;

/**
 * Created by wengxinkan on 16/8/25.
 */
public class NYCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("NYCheesePizza");

        System.out.println(name + " preparing;");
    }
}
