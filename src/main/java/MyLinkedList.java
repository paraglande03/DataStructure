public class MyLinkedList <K>{
    public static INode tail;
    public static INode head;
    public static int count;

    public static int getCount() {
        return count;
    }

    public MyLinkedList() {
        this.head=null;
        this.tail=null;
    }
    public  void add(INode newNode){
        if(this.tail==null){
            this.tail=newNode;
        }
        if(this.head==null){
            this.head=newNode;
        }
        else {
            INode tempNode=this.head;
            this.head=newNode;
            this.head.setNext(tempNode);
        }
    }
    public void append(INode myNode){
        if(this.head==null){
            this.head=myNode;
        }
        if(this.tail==null){
            this.tail=myNode;
        }
        else {
            this.tail.setNext(myNode);
            this.tail=myNode;
        }
    }

    public void insert(INode myNode, INode newNode){
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);

    }
    public INode pop(){
        INode tempNode= this.head;
        this.head=head.getNext();
        return tempNode; 
    }

    public INode popLast(){
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)){
            tempNode=tempNode.getNext();
        }
        this.tail=tempNode;
        tempNode=tempNode.getNext();
        return tempNode;
    }

    public static void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("my Nodes: ");
        INode tempNode=head;
        while (tempNode.getNext()!= null){
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail))myNodes.append("->");
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
    public boolean search(INode key) {
        INode tempNode = head;
        while(tempNode !=null && tempNode.getNext()!=null) {

            if (tempNode.getKey()==key.getKey()) {
                return true;
            }
            tempNode = tempNode.getNext();
        }
        return false;
    }
    public INode insertingBySearching(INode newNode, INode insertNode) {
        INode tempNode = this.head;
        while (!tempNode.getKey().equals(insertNode.getKey())) {
            tempNode = tempNode.getNext();
        }
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);
        return tempNode;
    }

    public INode deleteAtIndex(INode element) {
        count--;

        if (head.equals(element)) {
            INode del = head;
            head = head.getNext();
            return del;
        }
        INode tempDeleteNode= head;
        while (!tempDeleteNode.getNext().equals(element)) {
            tempDeleteNode = tempDeleteNode.getNext();
        }
        INode tempNode = tempDeleteNode.getNext();
        tempDeleteNode.setNext(tempDeleteNode.getNext().getNext());
        return tempNode;
    }
    public INode<K> search(K key) {
        INode<K> tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }
    public static void sorted(INode newNode) {
        count++;
        INode currentNode = head;
        INode prevNode = null;
        while (currentNode != null && (int) newNode.getKey() > (int) currentNode.getKey()) {
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if (prevNode == null) {
            head = newNode;
        } else {
            prevNode.setNext(newNode);
        }
        newNode.setNext(currentNode);
    }



}
