package cn.fly.learn.spring.chapter01;

/**
 * Created by fly on 2016/6/2.
 */
public class HelloWorld implements IHelloMessage {

    @Override
    public String sayHello() {
        return "Hello World!";
    }
}
