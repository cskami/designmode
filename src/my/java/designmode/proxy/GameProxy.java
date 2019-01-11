package my.java.designmode.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chenshuai
 * @date 2018/4/12 10:34
 */

public class GameProxy implements InvocationHandler {
    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class clazz = target.getClass();
        Object obj = Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
        return obj;
    }

    @Override
    public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("欢迎欢迎");
        //第一个参数是target,也就是被代理类的对象；第二个参数是方法中的参数
        method.invoke(target, args);
        System.out.println("结束了88");
        return null;
    }
}
