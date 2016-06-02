package cn.fly.learn.spring.chapter02.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by fly on 2016/6/2.
 */
public class ReflectTest {

    public static Car initByDefaultConst() throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("cn.fly.learn.spring.chapter02.reflect.Car");

        Constructor cons = clazz.getDeclaredConstructor((Class[]) null);
        Car car = (Car) cons.newInstance();

        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, "奔驰");
        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, "黑色");
        Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 200);
        return car;
    }

    public static Car initByParamConst() throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("cn.fly.learn.spring.chapter02.reflect.Car");

        Constructor cons = clazz.getDeclaredConstructor(new Class[]{String.class, String.class, int.class});

        Car car = (Car) cons.newInstance(new Object[]{"宝马", "红色", 180});
        return car;
    }

}
