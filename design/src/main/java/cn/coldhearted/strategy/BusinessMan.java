package cn.coldhearted.strategy;

/**
 * Created by wengxinkan on 16/2/11.
 */
public class BusinessMan extends PersonContext {

    public BusinessMan() {
        this.setTravel(new AirPlanelStrategy());
    }

}
