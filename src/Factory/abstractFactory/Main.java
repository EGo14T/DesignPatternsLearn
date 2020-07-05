package Factory.abstractFactory;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2020/7/5
 * Description: 抽象工厂
 */
public class Main {
    public static void main(String[] args) {

        AbstractFactory f1 = new ModernFactory();
        Vehicle v1 = f1.createVehicle();
        v1.go();

        AbstractFactory f2 = new AncientFactory();
        Vehicle v2 = f2.createVehicle();
        v2.go();

    }
}
