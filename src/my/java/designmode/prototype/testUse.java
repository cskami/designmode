package my.java.designmode.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenshuai
 * @date 2018/3/26 12:24
 */

public class testUse {
    public static void main(String[] args) {
        String value = "first";
        String value2 = "first";
        System.out.println(value == value2);
        Prototype prototype_1 = new Prototype();
        prototype_1.setValue(value);
        List<String> list = new ArrayList<>();
        list.add("1");
        prototype_1.setListValue(list);

        try{
            Prototype prototype_2 = (Prototype)prototype_1.clone();
            System.out.println(prototype_2.getValue());
            System.out.println(prototype_2.getListValue().get(0));

            Prototype prototype_3 = (Prototype)prototype_1.deepClone();
            System.out.println(prototype_3.getValue());
            System.out.println(prototype_3.getListValue().get(0));
            value = value2;
            prototype_1.setValue(value);
            list.set(0,"2");
            System.out.println(prototype_1.getValue() == prototype_2.getValue());
            System.out.println("----------------------分割线 -----------------------");

            System.out.println(prototype_2.getValue());
            System.out.println(prototype_2.getListValue().get(0));

            System.out.println(prototype_3.getValue());
            System.out.println(prototype_3.getListValue().get(0));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
