import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {


    @Test
    public void givenThreeNoWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myThirdNode)&&
                        myLinkedList.head.getNext().equals(mySecondNode)&&
                        myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenThreeNoWhenAppendedShouldBeAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode= new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);

        boolean result = myLinkedList.head.equals(myFirstNode)&&
                        myLinkedList.head.getNext().equals(mySecondNode)&&
                        myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenThreeNumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode)&&
                        myLinkedList.head.getNext().equals(mySecondNode)&&
                        myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void givenThreeNumbersWhenLinkedListShouldBeAbleToDeleteFirstElement() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);

        myLinkedList.printMyNodes();
        myLinkedList.pop();

        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(mySecondNode) &&
                myLinkedList.head.getNext().equals(myThirdNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void GivenThreeNumbersShouldBeAbleToSearch() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.printMyNodes();
        Assert.assertEquals(true,myLinkedList.search(secondNode));

    }
}
