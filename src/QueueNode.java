public class QueueNode <T, E> {
    private QueueNode parentNode;

    private T value;
    private E eValue;

    public QueueNode() {//Empty Consructor
        parentNode = null;
        eValue = null;

    }
    public QueueNode(E data){ // 1 input Constructor
        eValue = data;
        parentNode = null;

    }

    public QueueNode(E data, QueueNode node1) { // 2 inputConstructor
        parentNode = node1;
        eValue = data;
    }


    //Accessors
    public QueueNode getParentNode() {
        return parentNode;
    }

    public E getValue() {
        return eValue;
    }

    //Mutators
    public void setParentNode(QueueNode newNode){
        parentNode = (newNode);
    }
    public void setValue(E newValue){
        eValue = (newValue);
    }

    //toString method
    public String toString() {
        return "Node:" + eValue;
    }

    //boolean method
    public boolean booleanEquals(QueueNode a) {
        if (eValue.equals(a.getValue())){
            return true;
        } else{
            return false;
        }

    }
}
