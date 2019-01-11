package my.java.designmode.decorator;

import my.java.designmode.decorator.intf.GameIntf;

/**
 * @author chenshuai
 * @date 2018/3/26 13:06
 */

public class Decorator implements GameIntf {
    private GameIntf gameIntf;

    public Decorator(GameIntf gameIntf){
        super();
        this.gameIntf = gameIntf;
    }

    @Override
    public void playGame(){
        System.out.println(" before playgame");
        gameIntf.playGame();
        System.out.println(" after playgame");
    }
}
