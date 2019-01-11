package my.java.designmode.adapter;

import my.java.designmode.adapter.intf.AbTargetAble;

/**
 * @author chenshuai
 * @date 2018/3/26 12:54
 */

public class AdapterAb extends AbTargetAble {

    @Override
    public void method1() {
        System.out.println("AdapterAb.method1");
    }
}
