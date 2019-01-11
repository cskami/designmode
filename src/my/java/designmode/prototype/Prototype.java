package my.java.designmode.prototype;

import java.io.*;
import java.util.List;

/**
 * @author chenshuai
 * @date 2018/3/26 12:17
 */

public class Prototype implements Cloneable,Serializable {

    private static final long serialVersionUID = 1L;

    private String value;

    private List<String> listValue;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<String> getListValue() {
        return listValue;
    }

    public void setListValue(List<String> listValue) {
        this.listValue = listValue;
    }

    /**
     *  浅复制
     *  */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype)super.clone();
        return proto;
    }

    /**
     *  深复制
     *  */
    public Object deepClone() throws IOException, ClassNotFoundException {
        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }


}
