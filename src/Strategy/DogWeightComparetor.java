package Strategy;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2020/7/2
 * Description:
 */
public class DogWeightComparetor implements Comparetor<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getWeight()<o2.getWeight())return -1;
        else if (o1.getWeight()>o2.getWeight())return 1;
        else return 0;
    }

    public static void main(String[] args) {
        DogWeightComparetor dogWeightComparetor = new DogWeightComparetor();
    }
}
