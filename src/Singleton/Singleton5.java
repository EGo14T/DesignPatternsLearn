package Singleton;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2020/7/2
 * Description:
 *
 * 单例---枚举写法
 * 线程安全、防止反序列化
 */
public enum  Singleton5 {
    SINGLETON_5;

    private void test(){

    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton5.SINGLETON_5.hashCode());
            }).start();
        }
    }
}
