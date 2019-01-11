package my.java.designmode.bridge.impl;

import my.java.designmode.bridge.intf.GameIntf;

/**
 * @author chenshuai
 * @date 2018/3/26 13:08
 */

public class FpsGameImpl implements GameIntf {

    @Override
    public void playGame(){
        System.out.println(" press 'F' to pick gun ");
    }
}
