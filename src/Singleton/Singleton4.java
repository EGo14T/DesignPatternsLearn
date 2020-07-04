package Singleton;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2020/7/2
 * Description:
 *
 * 单例---静态内部类写法
 */
public class Singleton4 {

    private Singleton4() {}

    private static class SingletonHolder {
        private static final Singleton4 SINGLETON_4 = new Singleton4();
    }

    public static Singleton4 getInstance(){
        return SingletonHolder.SINGLETON_4;
    }
}
