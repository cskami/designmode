package my.java.designmode.decorator.impl;

import my.java.designmode.decorator.intf.GameIntf;

/**
 * @author chenshuai
 * @date 2018/3/26 13:08
 */

public class GameImpl implements GameIntf{

    @Override
    public void playGame(){
        System.out.println(" press 'A' to continue ");
    }
}
