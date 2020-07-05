package Factory.factoryMethod;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2020/7/5
 * Description: 工厂模式
 * 简单工厂
 * 可扩展性不好
 */
public class SimpleFactory {

    public static Moveable create(String type) {
        Moveable moveable = null;
        switch (type) {
            case "car":
                moveable = new Car();
                break;
            case "plane":
                moveable = new Plane();
                break;
        }
        return moveable;
    }

}
