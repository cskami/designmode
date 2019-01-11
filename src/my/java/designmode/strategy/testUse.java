package my.java.designmode.strategy;

/**
 * @author chenshuai
 * @date 2018/4/12 13:20
 */

public class testUse {
    public static void main(String[] args) {
        System.out.println(Calculator.fromTypeName("+").exec(1,2));
        System.out.println(Calculator.ADD.exec(1,2));
    }
}
