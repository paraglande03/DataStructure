import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
    MyQueue myQueue=new MyQueue();
    @Test
    public void givenThreeNoWhenAddedToQueueShouldReturnTrue() {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        myQueue.queue(myFirstNode);
        myQueue.printQueue();
        myQueue.queue(mySecondNode);
        myQueue.printQueue();
        myQueue.queue(myThirdNode);
        myQueue.printQueue();
        INode peak=myQueue.peak();
        Assert.assertEquals(peak, myThirdNode);
    }
    @Test
    public void givenThreeNoWhenDeletePeakValueOfQueueShouldReturnTrue() {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        myQueue.queue(myFirstNode);
        myQueue.printQueue();
        myQueue.queue(mySecondNode);
        myQueue.printQueue();
        myQueue.queue(myThirdNode);
        myQueue.printQueue();
        INode peak=myQueue.dequeue();
        myQueue.printQueue();
        Assert.assertEquals(peak, myThirdNode);
    }
}
