package my.java.designmode.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenshuai
 * @date 2018/4/12 10:53
 */

public class GameCompsiet {

    public abstract class GameAb{
        String gameName;

        public abstract void addGame(GameAb game);

        public abstract boolean existGame();

        public abstract void removeGame(GameAb game);

        public abstract void eachChild();
    }

    public class Game extends GameAb{
        List<GameAb> list = new ArrayList<>();
        @Override
        public void addGame(GameAb game){
            list.add(game);
        }
        @Override
        public boolean existGame(){
            return list.size() > 0 ;
        }
        @Override
        public void removeGame(GameAb game){
            list.remove(game);
        }
        @Override
        public void eachChild(){
            for(GameAb game : list){
                System.out.println(game.gameName);
                if(game.existGame()){
                    game.eachChild();
                }
            }
        }
    }
}
