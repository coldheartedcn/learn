package cn.fly.learn.spring.chapter01;

/**
 * Created by fly on 2016/6/2.
 */
public class Person {

    private IHelloMessage helloMessage;

    public IHelloMessage  getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(IHelloMessage helloMessage) {
        this.helloMessage = helloMessage;
    }

    public String sayHello() {
        return this.helloMessage.sayHello();
    }

}
