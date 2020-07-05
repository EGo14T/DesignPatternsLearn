package Factory.factoryMethod;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2020/7/5
 * Description:  工厂方法
 */
public class Main {
    public static void main(String[] args) {

        //1. 简单工厂模式
        Moveable simple = SimpleFactory.create("plane");
        simple.go();

        //2. 工厂方法
        Moveable m = new CarFactory().create();
        m.go();
    }
}
