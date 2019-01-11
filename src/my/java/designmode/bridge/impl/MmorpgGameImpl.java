package my.java.designmode.bridge.impl;

import my.java.designmode.bridge.intf.GameIntf;

/**
 * @author chenshuai
 * @date 2018/3/26 13:34
 */

public class MmorpgGameImpl implements GameIntf {

    @Override
    public void playGame(){
        System.out.println(" Welcome to Summoner's Rift ");
    }
}
