package my.java.designmode.factorymode.factory;

import my.java.designmode.factorymode.impl.FpsGame;
import my.java.designmode.factorymode.impl.MmorpgGame;
import my.java.designmode.factorymode.intf.Game;
import my.java.designmode.util.ErrorMsgUtil;

/**
 * @author chenshuai
 * @date 2018/3/26 10:00
 */

public class GameFactory {

    protected static String GAMETYPE_FPS = "fps";

    protected static String GAMETYPE_MMORPG = "mmorpg";

    public static Game createGame(String type){
        if(GAMETYPE_FPS.equals(type)){
            return new FpsGame();
        } else if(GAMETYPE_MMORPG.equals(type)){
            return new MmorpgGame();
        }
        else {
            throw new RuntimeException(ErrorMsgUtil.MSG_NULL
                    + "\n error in " + Thread.currentThread().getStackTrace()[1].getClassName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName()
                    + "\n line:" + Thread.currentThread().getStackTrace()[1].getLineNumber());
        }
    }

    public static Game createGameSingle_Fps(String type){
            return new FpsGame();
    }
    public static Game createGameSingle_Mmorpg(String type){
        return new MmorpgGame();
    }
}
