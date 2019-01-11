package my.java.designmode.adapter;

import my.java.designmode.adapter.intf.TargetAble;

/**
 * @author chenshuai
 * @date 2018/3/26 12:39
 */

public class Adapter extends Source implements TargetAble {

//    @Override
//    public void method1(){
//        System.out.println(" Adapter.method1 ");
//    }

    @Override
    public void method2(){
        System.out.println(" Adapter.method2 ");
    }

}
