package cn.fly.learn.spring.chapter01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Created by fly on 2016/6/2.
 */
public class Main {

    public static void main(String[] args) {

        Resource rs = new FileSystemResource("spring/src/main/resources/helloMessage.xml");
        BeanFactory factory = new XmlBeanFactory(rs);
        Person person = (Person) factory.getBean("person");
        System.out.print("The person say:" + person.sayHello());

    }

}
