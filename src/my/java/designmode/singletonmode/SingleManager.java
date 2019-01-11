package my.java.designmode.singletonmode;

import java.util.Vector;

/**
 * @author chenshuai
 * @date 2018/3/26 10:53
 */

public class SingleManager {
    private static SingleManager instance = null;
    private Vector properties = null;
    private SingleManager(){
        properties = new Vector();
        properties.add(0,"instance");
    }

    private static synchronized void Init(){
        if(instance == null){
            instance= new SingleManager();
        }
    }

    public static SingleManager getInstance(){
        if(instance == null){
            Init();
        }
        return instance;
    }

    public void setProperties(int num,String chars){
        properties.set(num,chars);
    }

    public String getValue(int num){
        return String.valueOf(properties.get(num));
    }


    public Vector getProperties(){
        return properties;
    }

    public void updateProperties(int num,String chars){
        SingleManager newinstance = new SingleManager();
        newinstance.setProperties(num,chars);
        properties = newinstance.getProperties();
    }
}
