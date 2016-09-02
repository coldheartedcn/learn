package cn.coldhearted.factory.abs;

import cn.coldhearted.factory.pizza.Pizza;

/**
 * Created by wengxinkan on 16/8/25.
 */
public interface AbsFactory {
    public Pizza createPizze(String orderType);
}
