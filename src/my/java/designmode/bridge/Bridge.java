package my.java.designmode.bridge;

import my.java.designmode.bridge.intf.GameIntf;

/**
 * @author chenshuai
 * @date 2018/3/26 13:36
 */

public class Bridge {
    private GameIntf gameIntf;

    public void playGame(){
        gameIntf.playGame();
    }

    public GameIntf getGameIntf(){
        return gameIntf;
    }

    public void setGameIntf(GameIntf gameIntf){
        this.gameIntf = gameIntf;
    }
}
