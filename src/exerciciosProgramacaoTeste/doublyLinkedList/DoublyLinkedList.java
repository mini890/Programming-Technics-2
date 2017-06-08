package exerciciosProgramacaoTeste.doublyLinkedList;

class Node {
 public int data; // data in Node.
 public Node next; // points to next Node in list.
 public Node previous; // points to previous Node in list.

 /**
  * Constructor
  */
 public Node(int data){
        this.data = data;
 }

 /**
  * Display NoLinkedListEmptyExceptionde's data
  */
 public void displayNode() {
        System.out.print( data + " ");
 }
}


/**
* Sorted Doubly LinkedList class
*/
class DoublyLinkedList {
 private Node first; // ref to first link on LinkedList
 private Node last; // ref to last link on LinkedList

 /**
  * LinkedList constructor
  */
 public DoublyLinkedList(){
        first = null;
 }

 /**
  * Insert New Node at first position
  */
 
 public void insertFirst(int data){ // insert at front of list
        Node newNode = new Node(data); // creation of new node.
        if (first == null) // means LinkedList is empty.
               last = newNode; //  newNode <--- last
        else
               first.previous = newNode; // newNode <-- old first
        newNode.next = first; // newNode --> old first
        first = newNode; // first --> newNode
 }

 /**
  * Delete first node.
  */
 public Node deleteFirst() { // (assumes non-empty list)
        Node tempNode = first;
        if (first.next == null) // if only one item
               last = null; // null <-- last
        else
               first.next.previous = null; // null <-- old next
        first = first.next; // first --> old next
        return tempNode;
 }

 
 /**
  *Insert Node in Sorted DoublyLinkedList (in between of other Nodes).
  *Note:- Sorted DoublyLinkedList is arranged in ascending order.
  */
 public void insertSorted(int newKey){
        
        Node newNode=new Node(newKey);
        
        //Case1: when there is no element in LinkedList
        if(first==null){ //means LinkedList is empty, make first point to new Node.
               first=last=newNode;
               System.out.println("Node with data="+newNode.data+" inserted at first.");
               return;
        }
        
        //Case2: when newNode should be placed at first.
        Node current=first;
        if(current.data>=newNode.data){
               newNode.next=first;
               first.previous=newNode;
               first=newNode;    //first ---> newNode
               System.out.println("Node with data="+newNode.data+" inserted at first Node, beacuse newNode is smallest of existing Nodes.");
               return;
        }
        
        //Case3: when newNode should be at some position other than first.
        while(true){
               if(newNode.data>current.data){ //entering inside if means we haven't find position for inserting node.
                     if(current.next==null){ //means current is the last node, insert node.
                            last.next=newNode;
                            newNode.previous=last;
                            last=newNode;
                            System.out.println("Node with data="+newNode.data+" inserted successfully at last of LinkedList.");
                            return;
                     }
                     current=current.next;   //move to next node.
               }
               else{  //we have find position for inserting node.
                     current=current.previous;  //make current point to previous node.
                     newNode.next=current.next; //make current's next point to newNode's next.
                     current.next.previous=newNode; //make previous of current's next node point to newNode.
                     newNode.previous=current;  //make newNode's previous point to current.
                     current.next=newNode;          //make current's next point to newNode.
                     System.out.println("Node with data="+newNode.data+" inserted successfully in middle of LinkedList.");
                     return;
               }
        }
 }
 
 /**
  * Method deletes specific Node from DoublyLinkedList.
  */
 public void deleteSpecificNode(int deleteKey){
        
        //Case1: when there is no element in LinkedList
        if(first==null){  //means LinkedList in empty, throw exception.              
               System.out.println("LinkedList is empty");
        }
                     
        //Case2: when there are elements in LinkedList
        Node current=first;
        while(current.data!=deleteKey){
               if(current.next==null){
                     System.out.println("Node with data="+deleteKey+" wasn't found for deletion.");
                     return;
               }
               current=current.next;   //move to next node.
        }
        
        if(current==first){
               System.out.println("Node with data="+current.data+" was found on first and has been deleted.");
               first=first.next;
               first.previous=null;
        }
        else if(current==last){
               System.out.println("Node with data="+current.data+" was found on last has been deleted.");
               last=last.previous;
               last.next=null;
        }
        else{
               current.previous.next=current.next;
               current.next.previous=current.previous;
               System.out.println("Node with data="+current.data+" has been deleted.");
        }
 }


 /*
  * Display LinkedList in forward direction
  */
 public void displayFrwd() {
        System.out.print("Displaying in forward direction [first--->last] : ");
        Node tempDisplay = first; // start at the beginning of linkedList
        while (tempDisplay != null){ // Executes until we don't find end of list.
               tempDisplay.displayNode();
               tempDisplay = tempDisplay.next; // move to next Node
        }
        System.out.println("");
 }


 /*
  * Display LinkedList in backward direction
  */
 public void displayBckwrd() {
        System.out.print("Displaying in backward direction [last-->first] : ");
        Node tempDisplay = last; // start at the end of linkedList
        while (tempDisplay != null) {// Executes until we don't find start of list.    
               tempDisplay.displayNode();
               tempDisplay = tempDisplay.previous; // move to previous Node
        }
        System.out.println("");
 }
 

}