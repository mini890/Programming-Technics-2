package exerciciosProgramacaoTeste.hashTable;

public class hashTableTest {

	public static void main(String[] args) {
		HashTable<Integer, Integer> HashTable = new HashTable<Integer, Integer>();
		HashTable.put(21, 12);
		HashTable.put(25, 121);
		HashTable.put(30, 151);
		HashTable.put(33, 15);
		HashTable.put(35, 89);

		System.out.println("value corresponding to key 21=" + HashTable.get(21));
		System.out.println("value corresponding to key 51=" + HashTable.get(51));

		System.out.print("Displaying : ");
		HashTable.display();

		System.out.println("\n\nvalue corresponding to key 21 removed: " + HashTable.remove(21));
		System.out.println("value corresponding to key 51 removed: " + HashTable.remove(51));

		System.out.print("Displaying : ");
		HashTable.display();
	}

}