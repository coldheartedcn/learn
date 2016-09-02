package cn.coldhearted.factory.pizza;

/**
 * Created by wengxinkan on 16/8/25.
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("LDPepperPizza");

        System.out.println(name + " preparing;");
    }
}
