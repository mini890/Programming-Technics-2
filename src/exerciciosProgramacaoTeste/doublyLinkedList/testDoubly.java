package exerciciosProgramacaoTeste.doublyLinkedList;

public class testDoubly {

	public static void main(String[] args) {
		DoublyLinkedList linkedList = new DoublyLinkedList(); // creation of
																// Linked List

		linkedList.insertSorted(11);
		linkedList.insertSorted(21);
		linkedList.insertSorted(59);
		linkedList.insertSorted(14);
		linkedList.insertSorted(39);
		linkedList.insertSorted(66);
		linkedList.insertSorted(33);

		linkedList.displayFrwd(); // display DoublyLinkedList
		linkedList.displayBckwrd();

		System.out.println();// sysout used to format output
		linkedList.deleteSpecificNode(11); // delete Node
		linkedList.deleteSpecificNode(21); // delete Node
		linkedList.deleteSpecificNode(29); // delete Node
		linkedList.deleteSpecificNode(59); // delete Node

		linkedList.displayFrwd(); // display DoublyLinkedList
		linkedList.displayBckwrd();
	}

}