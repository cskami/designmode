package my.java.designmode.composite;

/**
 * @author chenshuai
 * @date 2018/4/12 11:01
 */

public class testUse {
    public static void main(String[] args) {
        GameCompsiet compsiet = new GameCompsiet();
        GameCompsiet.GameAb root = compsiet.new Game();
        GameCompsiet.GameAb parent1 = compsiet.new Game();
        parent1.gameName = "parent1";
        GameCompsiet.GameAb parent2 = compsiet.new Game();
        parent2.gameName = "parent2";
        GameCompsiet.GameAb leaf = compsiet.new Game();
        leaf.gameName = "leftLeaf";
        GameCompsiet.GameAb leaf2 = compsiet.new Game();
        leaf2.gameName = "leftLeaf2";
        parent1.addGame(leaf);
        parent1.addGame(leaf2);
        root.addGame(parent1);
        root.eachChild();
    }
}
