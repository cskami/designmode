package my.java.designmode.strategy;

/**
 * @author chenshuai
 * @date 2018/4/12 13:18
 */

public enum Calculator {
    //加法运算
    ADD("+"){
        @Override
        public int exec(int a,int b){
            return a+b;
        }
    },
    //减法运算
    SUB("-"){
        @Override
        public int exec(int a,int b){
            return a - b;
        }
    };
    String value = "";
    //定义成员值类型
    Calculator(String _value){
        this.value = _value;
    }
    //获得枚举成员的值
    public String getValue(){
        return this.value;
    }

    /**
     * 根据类型的名称，返回类型的枚举实例。
     *
     * @param typeName 类型名称
     */
    public static Calculator fromTypeName(String typeName) {
        for (Calculator type : Calculator.values()) {
            if (type.getValue().equals(typeName)) {
                return type;
            }
        }
        return null;
    }
    //声明一个抽象函数
    public abstract int exec(int a,int b);
}
