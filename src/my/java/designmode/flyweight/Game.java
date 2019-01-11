package my.java.designmode.flyweight;

/**
 * @author chenshuai
 * @date 2018/4/12 12:27
 */

public class Game extends GameAb {
    private String gameName;

    public String getGameName() {
        return gameName;
    }

    @Override
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
    @Override
    public void installGame(){
        System.out.println(" game card: " + this.gameName);
    }
}
