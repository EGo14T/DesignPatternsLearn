package Strategy;

import java.util.Comparator;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2020/7/2
 * Description:
 */

@FunctionalInterface
public interface Comparetor<T> {
    int compare(T o1, T o2);
}
