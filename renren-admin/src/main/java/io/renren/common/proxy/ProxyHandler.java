package io.renren.common.proxy;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

    private Object object ;

    public ProxyHandler(Object object){
        this.object = object ;

    }
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        System.out.println("1111111" + method.getName());

        method.invoke(object,objects);

        System.out.println("22222222"+ method.getName());
        return null;
    }

    public static void main(String[] args) {
        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        ByeInterface hello = new Bye();

        InvocationHandler handler = new ProxyHandler(hello);

        ByeInterface proxyHello = (ByeInterface) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), handler);

        proxyHello.sayBye();

    }

}
