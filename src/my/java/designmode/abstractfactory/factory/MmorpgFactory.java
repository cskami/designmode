package my.java.designmode.abstractfactory.factory;

import my.java.designmode.abstractfactory.impl.MmorpgGame;
import my.java.designmode.abstractfactory.intf.Game;
import my.java.designmode.abstractfactory.intf.Product;

/**
 * @author chenshuai
 * @date 2018/3/26 10:23
 */

public class MmorpgFactory implements Product {
    @Override
    public Game createNewProduct(){
        return new MmorpgGame();
    }
}
