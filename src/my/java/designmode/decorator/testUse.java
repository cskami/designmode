package my.java.designmode.decorator;

import my.java.designmode.decorator.impl.GameImpl;
import my.java.designmode.decorator.intf.GameIntf;

/**
 * @author chenshuai
 * @date 2018/3/26 13:11
 */

public class testUse {
    public static void main(String[] args) {
        GameIntf gameIntf = new GameImpl();
        Decorator decorator = new Decorator(gameIntf);
        decorator.playGame();

    }
}
