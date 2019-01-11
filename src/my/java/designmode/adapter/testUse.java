package my.java.designmode.adapter;

import my.java.designmode.adapter.intf.TargetAble;

import java.sql.DriverManager;

/**
 * @author chenshuai
 * @date 2018/3/26 12:40
 */

public class testUse {

    public static void main(String[] args) {
        TargetAble targetAble = new Adapter();
        targetAble.method1();
        targetAble.method2();

        TargetAble targetAble1 = new Wrapper(new Source());
        targetAble1.method1();
        targetAble1.method2();

        TargetAble targetAble2 = new Wrapper(new SourceChild());
        targetAble2.method1();
        targetAble2.method2();

    }
}
