package cn.coldhearted.strategy;

/**
 * Created by wengxinkan on 16/2/11.
 */
public class main {

    public  static void main(String[] args) {
        PersonContext jack = new BusinessMan();

        jack.travel();

        jack.setTravel(new TrainStrategy());

        jack.travel();
    }

}
