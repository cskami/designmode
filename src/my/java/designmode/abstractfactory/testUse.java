package my.java.designmode.abstractfactory;

import my.java.designmode.abstractfactory.factory.FpsFactory;
import my.java.designmode.abstractfactory.intf.Game;

/**
 * @author chenshuai
 * @date 2018/3/26 9:59
 */

public class testUse {

    public static void main(String[] args) {
        FpsFactory fpsFactory = new FpsFactory();
        Game newgame = fpsFactory.createNewProduct();
        newgame.play();
    }
}
