import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void givenThreeNoWhenPushedTopShouldBeLastAddedNode() {
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(56);

        MyStack myStack = new MyStack();

        myStack.push(firstNode);
        myStack.printMyStack();
        myStack.push(secondNode);
        myStack.printMyStack();
        myStack.push(thirdNode);
        myStack.printMyStack();
        INode peak = myStack.top();
        Assert.assertEquals(thirdNode,peak);
        

    }
}
