package cn.coldhearted.factory.pizza;

/**
 * Created by wengxinkan on 16/8/25.
 */
public class NYPepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("NYPepperPizza");

        System.out.println(name + " preparing;");
    }
}
