package my.java.designmode.proxy;

import my.java.designmode.proxy.impl.GameImpl;
import my.java.designmode.proxy.intf.GameIntf;

/**
 * @author chenshuai
 * @date 2018/3/26 13:26
 */

public class testUse {
    public static void main(String[] args) {
//        GameIntf gameIntf = new Proxy();
//        gameIntf.playGame();
        GameIntf gameIntf = (GameIntf) new GameProxy().getInstance(new GameImpl());
        gameIntf.playGame();
    }
}
