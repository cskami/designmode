package my.java.designmode.proxy;

import my.java.designmode.proxy.impl.GameImpl;
import my.java.designmode.proxy.intf.GameIntf;

/**
 * @author chenshuai
 * @date 2018/3/26 13:22
 */

public class Proxy implements GameIntf {
    private GameImpl gameimpl;

    public Proxy(){
        super();
        this.gameimpl = new GameImpl();
    }

    @Override
    public void playGame(){
        before();
        gameimpl.playGame();
        after();
    }

    public void before(){
        System.out.println(" before ");
    }

    public void after(){
        System.out.println(" after ");
    }
}
