package my.java.designmode.abstractfactory.factory;

import my.java.designmode.abstractfactory.intf.Product;
import my.java.designmode.abstractfactory.impl.FpsGame;
import my.java.designmode.abstractfactory.intf.Game;

/**
 * @author chenshuai
 * @date 2018/3/26 10:22
 */

public class FpsFactory implements Product {

    public Game createNewProduct(){
        return new FpsGame();
    }

}
