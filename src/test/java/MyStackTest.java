import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void givenThreeNoWhenPushedTopShouldBeLastAddedNode() {
        MyNode<Integer> MyFirstNode = new MyNode<>(70);
        MyNode<Integer> MySecondNode = new MyNode<>(30);
        MyNode<Integer> MyThirdNode = new MyNode<>(56);

        MyStack myStack = new MyStack();

        myStack.push(MyFirstNode);
        myStack.printMyStack();
        myStack.push(MySecondNode);
        myStack.printMyStack();
        myStack.push(MyThirdNode);
        myStack.printMyStack();
        INode peak = myStack.top();
        Assert.assertEquals(MyThirdNode,peak);
        

    }
    @Test
    public void givenThreeNoWhenPoppedShouldMatchThirdNode() {
        MyNode<Integer> MyFirstNode = new MyNode<>(70);
        MyNode<Integer> MySecondNode = new MyNode<>(30);
        MyNode<Integer> MyThirdNode = new MyNode<>(56);

        MyStack myStack = new MyStack();

        myStack.push(MyFirstNode);
        myStack.printMyStack();
        myStack.push(MySecondNode);
        myStack.printMyStack();
        myStack.push(MyThirdNode);
        myStack.printMyStack();
        INode pop = myStack.pop();
        myStack.printMyStack();

        Assert.assertEquals(MyThirdNode,pop);
    }
}
