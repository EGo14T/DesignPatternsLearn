package Factory.abstractFactory;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2020/7/5
 * Description: 古代工厂 制造马车
 */
public class AncientFactory extends AbstractFactory {
    @Override
    Vehicle createVehicle() {
        return new Coach();
    }
}
