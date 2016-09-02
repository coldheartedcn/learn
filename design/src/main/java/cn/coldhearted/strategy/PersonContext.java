package cn.coldhearted.strategy;

/**
 * Created by wengxinkan on 16/2/11.
 */
public abstract class PersonContext {

    private TravelStrategy travel;

    public PersonContext() {
    }

    public PersonContext(TravelStrategy travel) {
        this.travel = travel;
    }

    public void setTravel(TravelStrategy travel) {
        this.travel = travel;
    }

    public void travel() {
        this.travel.travelAlgorithm();
    }
}
