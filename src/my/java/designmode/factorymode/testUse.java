package my.java.designmode.factorymode;

import my.java.designmode.factorymode.factory.GameFactory;
import my.java.designmode.factorymode.intf.Game;

/**
 * @author chenshuai
 * @date 2018/3/26 9:59
 */

public class testUse {

    public static void main(String[] args) {
        Game newgame = GameFactory.createGame("mmorpg");
        newgame.play();
    }
}
