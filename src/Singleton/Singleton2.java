package Singleton;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2020/7/2
 * Description:单例模式
 *
 * 懒汉模式
 * 在调用getInstance()方法时才初始化对象，达到了延迟加载的目的。
 *
 * 但是会遇到线程不安全的问题
 * 当两个线程同时判断 SINGLETON_2 == null 时，程序中就会出现两个Singleton2实例；
 */
public class Singleton2 {

    private static Singleton2 SINGLETON_2;

    private Singleton2() {}

    public static Singleton2 getInstance(){
        if (SINGLETON_2 == null){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            SINGLETON_2 = new Singleton2();
        }
        return SINGLETON_2;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                Singleton2 singleton2 = Singleton2.getInstance();
                System.out.println(singleton2.hashCode());
            }).start();
        }
    }
}
