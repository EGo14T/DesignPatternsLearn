package Singleton;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2020/7/2
 * Description: 双检查--解决懒汉式线程不安全的问题
 */
public class Singleton3 {

    //加上volatile 防止语句重排
    private volatile static Singleton3 SINGLETON_3;

    public Singleton3() {}

    public static Singleton3 getInstance(){
        if (SINGLETON_3 == null){{
            synchronized (Singleton3.class){
                if (SINGLETON_3 == null){
                    SINGLETON_3 = new Singleton3();
                }
            }
        }}
        return SINGLETON_3;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                Singleton3 singleton3 = Singleton3.getInstance();
                System.out.println(singleton3.hashCode());
            }).start();
        }
    }
}
