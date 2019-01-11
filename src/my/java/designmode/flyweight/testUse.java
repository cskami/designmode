package my.java.designmode.flyweight;

/**
 * @author chenshuai
 * @date 2018/4/12 12:29
 */

public class testUse {
    public static void main(String[] args) {
        GameAb game1 = GameFactory.getGame("热血英豪");
        GameAb game2 = GameFactory.getGame("泡泡堂");
        GameAb game3 = GameFactory.getGame("泡泡堂");
        GameAb game4 = GameFactory.getGame("QQ堂");
        GameAb game5 = GameFactory.getGame("泡泡堂");
        GameAb game6 = GameFactory.getGame("泡泡堂");
        game1.installGame();
        game2.installGame();
        game3.installGame();
        game4.installGame();
        game5.installGame();
        game6.installGame();
        GameFactory.showGameLength();
    }
}
