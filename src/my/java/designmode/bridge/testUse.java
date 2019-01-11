package my.java.designmode.bridge;

import my.java.designmode.bridge.impl.FpsGameImpl;
import my.java.designmode.bridge.impl.MmorpgGameImpl;
import my.java.designmode.bridge.intf.GameIntf;

/**
 * @author chenshuai
 * @date 2018/3/26 13:38
 */

public class testUse {
    public static void main(String[] args) {
        Bridge bridge = new Bridge();

        GameIntf fpsGame = new FpsGameImpl();
        bridge.setGameIntf(fpsGame);
        bridge.playGame();

        GameIntf mmorpgGame = new MmorpgGameImpl();
        bridge.setGameIntf(mmorpgGame);
        bridge.playGame();

    }
}
