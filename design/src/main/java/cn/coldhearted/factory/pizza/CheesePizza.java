package cn.coldhearted.factory.pizza;

/**
 * Created by wengxinkan on 16/8/25.
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("CheesePizza");

        System.out.println(name + " preparing;");
    }

}
