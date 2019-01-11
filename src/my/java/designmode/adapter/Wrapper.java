package my.java.designmode.adapter;

import my.java.designmode.adapter.intf.TargetAble;

/**
 * @author chenshuai
 * @date 2018/3/26 12:43
 */

public class Wrapper implements TargetAble {
    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }

    @Override
    public void method2(){
        System.out.println(" Wrapper.method2 ");
    }

    @Override
    public void method1(){
        source.method1();
    }
}
