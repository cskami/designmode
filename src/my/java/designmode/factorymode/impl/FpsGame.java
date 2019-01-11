package my.java.designmode.factorymode.impl;

import my.java.designmode.factorymode.intf.Game;

/**
 * @author chenshuai
 * @date 2018/3/26 9:57
 */

public class FpsGame implements Game{
    @Override
    public void play(){
        System.out.println("Fire in the hole");
    }
}
