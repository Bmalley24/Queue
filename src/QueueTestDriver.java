public class QueueTestDriver {

    public static void main(String[] args) {

        Queue testQueue = new Queue();//creates a new stack

        System.out.println(java.util.Optional.ofNullable(testQueue.peek()));//tests peek method when there is nothing inside
        // (output: null)

        testQueue.enqueue(88);//tests push method if it can correctly add on a new value

        System.out.println(java.util.Optional.ofNullable(testQueue.peek()));//tests peek again to see if we have a new top value
        // (output: 88)

        testQueue.enqueue(27);//pushes on a new value to test if the stack can have more than 1 value

        System.out.println(java.util.Optional.ofNullable(testQueue.peek()));//checks the new top value
        // (output: 88)

        System.out.println(testQueue.size());//checks if size method works
        // (output: 2)

        System.out.println(java.util.Optional.ofNullable(testQueue.dequeue()));// checks if pop method returns removed value
        // (output: 88)

        System.out.println(java.util.Optional.ofNullable(testQueue.peek()));//checks if the pop method properly removed the old top value
        // (output: 27)

        System.out.println(testQueue.isEmpty());//checking if the isEmpty method works
        // (output: false)

        System.out.println(java.util.Optional.ofNullable((testQueue.dequeue())));//removing the next top value to then check the isEmpty method a second time
        // (output: 27)

        System.out.println(testQueue.isEmpty());//checking if the isEmpty method works
        // (output: true)
    }
}
