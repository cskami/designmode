package my.java.designmode.abstractfactory.impl;

import my.java.designmode.abstractfactory.intf.Game;

/**
 * @author chenshuai
 * @date 2018/3/26 9:57
 */

public class MmorpgGame implements Game {
    @Override
    public void play(){
        System.out.println("Are you my master?");
    }

}
