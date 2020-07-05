package Factory.abstractFactory;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2020/7/5
 * Description: 现代工厂 制造汽车
 */
public class ModernFactory extends AbstractFactory {

    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
