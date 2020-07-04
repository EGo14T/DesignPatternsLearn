package Strategy;

import java.util.Arrays;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2020/7/2
 * Description:
 */
public class Sorted<T> {

    public void sort(T[] arr, Comparetor<T> comparetor){
        for (int i = 0; i < arr.length-1; i++) {
            int minpos = i;

            for (int j = i+1; j <arr.length ; j++) {
                minpos = comparetor.compare(arr[j],arr[minpos]) == -1 ? j : minpos;
            }

            swap(arr,i,minpos);
        }
    };

    public void swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Dog[] dogs = {new Dog(4),new Dog(3),new Dog(1),new Dog(5)};
        Sorted<Dog> sorted = new Sorted<>();
        sorted.sort(dogs, new Comparetor<Dog>(){
            @Override
            public int compare(Dog o1, Dog o2) {
                if (o1.getWeight()<o2.getWeight())return -1;
                else if (o1.getWeight()>o2.getWeight())return 1;
                else return 0;
            }
        });
        System.out.println(Arrays.toString(dogs));
    }
}
