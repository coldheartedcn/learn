package cn.coldhearted.factory.pizza;

/**
 * Created by wengxinkan on 16/8/25.
 */
public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("PepperPizza");

        System.out.println(name + " preparing;");
    }

}
