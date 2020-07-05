package Factory.factoryMethod;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2020/7/5
 * Description: 工厂方法
 */
public class CarFactory {

    public Moveable create() {
        System.out.println("制造了一个小汽车");
        return new Car();
    }
}
