package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
 public class Group<T> implements Iterable<T>, GroupInterface<T> {

    protected List<T> listOfObjects;

    public Group() {
        //throw new UnsupportedOperationException("Method not yet implemented");

        listOfObjects = new ArrayList<>();
    }

    public Integer count() {

        return listOfObjects.size();
    }


    public Boolean has(T valueToInsert) {
        return listOfObjects.contains(valueToInsert);
    }

    public void insert(T string) {

        listOfObjects.add(string);
    }

    public T fetch(int indexOfValue) {

        return listOfObjects.get(indexOfValue);
    }


    public void delete(T value) {
    listOfObjects.remove(value);
    }

    public void clear() {

    listOfObjects.clear();
    }

    public Iterator<T> iterator() {

        Iterator<T> iterator = listOfObjects.iterator();
        return iterator;
    }

    @Override
    public String toString() {
        return  listOfObjects.toString();
    }
}

