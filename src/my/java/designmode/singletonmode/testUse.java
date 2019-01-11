package my.java.designmode.singletonmode;

/**
 * @author chenshuai
 * @date 2018/3/26 11:01
 */

public class testUse {
    public static void main(String[] args) {
        SingleManager instance = SingleManager.getInstance();
        System.out.println(instance.getValue(0));
        instance.updateProperties(0,"2");
        System.out.println(instance.getValue(0));
    }
}
