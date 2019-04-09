package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * @author leon on 11/12/2018.
 */
 public class MyStack<SomeType> implements  Iterable{

    private ArrayList<SomeType> elements;

    public MyStack() {

        elements = new ArrayList<>();

        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Boolean isEmpty() {

        return elements.isEmpty();
    }

    public void push(SomeType i) throws  IndexOutOfBoundsException{

        elements.add(i);
    }

    public SomeType peek() {

        return elements.get(elements.size()-1);
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public SomeType pop() throws EmptyStackException{

        Integer len = elements.size();

        SomeType temp = elements.get(len - 1);
        elements.remove(len - 1);
        return temp;
    }

    @Override
    public Iterator iterator() {

        Iterator<SomeType> iterator = elements.iterator();
        return iterator;
    }


}
