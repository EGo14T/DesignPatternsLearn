package Singleton;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2020/7/2
 * Description: 单例模式
 * 1.单例类只能有一个实例。
 * 2.单例类必须自己创建自己的唯一实例。
 * 3.单例类必须给所有其他对象提供这一实例。
 */

/**
 * 饿汉式
 * 类加载在内存中就实例化一个单例，保证线程安全
 * 不管用到与否，类装载时就完成实例化
 */
public class Singleton1 {

    //单例类只能有一个实例。
    private static final Singleton1 SINGLETON_1 = new Singleton1();

    //单例类必须自己创建自己的唯一实例。
    private Singleton1() {}

    //单例类必须给所有其他对象提供这一实例。
    public static Singleton1 getInstance(){
        return SINGLETON_1;
    }

    public void test(){
        System.out.println("饿汉式");
    }

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton1==singleton2);

    }

}
