package org.example.Collections;

import java.util.LinkedList;
import java.util.Vector;

public class Topic1Collections {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        LinkedList<Integer> list=new LinkedList<>();
        /*
The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion,
 manipulation, and deletion.
Java Collection means a single unit of objects. Java Collection framework provides many interfaces
(Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet,
TreeSet).

Collection Methods:

1   public boolean add(E e)	It is used to insert an element in this collection.
2	public boolean addAll(Collection<? extends E> c)
        It is used to insert the specified collection elements in the invoking collection.
3	public boolean remove(Object element)	It is used to delete an element from the collection.
4	public boolean removeAll(Collection<?> c)
        It is used to delete all the elements of the specified collection from the invoking collection.
7	public int size()	It returns the total number of elements in the collection.
8	public void clear()	It removes the total number of elements from the collection.
9	public boolean contains(Object element)	It is used to search an element.
10	public boolean containsAll(Collection<?> c)	It is used to search the specified collection in the collection.
11	public Iterator iterator()	It returns an iterator.
12	public Object[] toArray()	It converts collection into array.
14	public boolean isEmpty()	It checks if collection is empty.
18	public boolean equals(Object element)	It matches two collections.
19	public int hashCode()	It returns the hash code number of the collection.
         */

        /*
****Iterable Interface:

The Iterable interface is the root interface for all the collection classes.
The Collection interface extends the Iterable interface and therefore all the subclasses of Collection interface
also implement the Iterable interface. It contains only one abstract method. i.e.,
     Iterator<T> iterator()
     It returns the iterator over the elements of type T.
         */

    }
}
