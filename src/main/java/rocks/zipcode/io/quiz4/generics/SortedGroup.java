package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T extends Comparable> extends Group<T>  {

    @Override
    public void insert(T value) {

        super.insert(value);
        Collections.sort(listOfObjects);
        }


    @Override
    public void delete(T value) {
        super.delete(value);
    }

    public Integer indexOf(T value) {
        return listOfObjects.indexOf(value);
    }
}
