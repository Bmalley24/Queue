/**
 * Queue
 * Author: Brandon Malley
 * Collaborator:
 * Date: 11/14/2023
 **/
public class Queue {

    //Instance data
    private QueueNode bottomValue;
    private int size;

    //Empty Constructor
    public Queue() {
        bottomValue = new QueueNode();
        size = 0;
    }

    //Methods

    //add an element
    public <E> void enqueue(E element) {
        QueueNode newValue = new QueueNode(element);
        if (size == 0) {
            bottomValue = newValue;
            size ++;
        } else {
            bottomValue.setParentNode(newValue);
            size++;
        }

    }

    //remove and return the least recent element
    public <E> E dequeue()  {
        QueueNode newValue = new QueueNode(bottomValue.getValue());

            bottomValue = bottomValue.getParentNode();
            size = size -1;
            return (E) newValue.getValue();
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public int size() {
        return size;
    }

    //look at the least recent element without removing
    public <E> E peek() {
        return (E) bottomValue.getValue();
    }
}
