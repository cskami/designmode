package my.java.designmode.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenshuai
 * @date 2018/4/12 12:29
 */

public class GameFactory {

    private static Map<String,GameAb> gameMap = new HashMap<>(16);

    public static void showGameLength(){
        System.out.println(" game length:" + gameMap.size());
    }

    public static GameAb getGame(String gameName){
        GameAb game = gameMap.get(gameName);
        if(game == null){
            game = new Game();
            game.setGameName(gameName);
            gameMap.put(gameName,game);
        }
        return game;
    }
}
