public class QueueNode <T, E> {
    private QueueNode parentNode;

    private T value;
    private E eValue;

    public QueueNode() {//Empty Consructor
        parentNode = null;
        value = null;

    }
    public QueueNode(T data){ // 1 input Constructor
        value = data;
        parentNode = null;

    }

    public QueueNode(T data, QueueNode node1) { // 2 inputConstructor
        parentNode = node1;
        value = data;
    }


    //Accessors
    public QueueNode getParentNode() {
        return parentNode;
    }

    public T getValue() {
        return value;
    }

    //Mutators
    public void setParentNode(QueueNode newNode){
        parentNode = (newNode);
    }
    public void setValue(T newValue){
        value = (newValue);
    }

    //toString method
    public String toString() {
        return "Node:" + value;
    }

    //boolean method
    public boolean booleanEquals(QueueNode a) {
        if (value.equals(a.getValue())){
            return true;
        } else{
            return false;
        }

    }
}
