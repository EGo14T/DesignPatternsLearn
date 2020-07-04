package Strategy;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2020/7/2
 * Description:
 */
public class Dog {
    private int weight;
    private int height;

    public Dog(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
