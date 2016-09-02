package cn.coldhearted.factory.pizza;

/**
 * Created by wengxinkan on 16/8/25.
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("GreekPizza");

        System.out.println(name + " preparing;");
    }

}
