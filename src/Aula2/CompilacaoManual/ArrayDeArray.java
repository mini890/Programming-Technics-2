package Aula2.CompilacaoManual;

class ArrayDeArray {
	public static void main(String[] args) {
		int[][] matrix = {{1, 2}, {10, 20, 30}, {11, 21, 31, 41, 51}};
		
		System.out.println("Array Normal");
		for (int i = 0; i <= matrix.length - 1; i++) {
			for (int j = 0; j <= matrix[i].length - 1; j++) {
				System.out.println(matrix[i][j]);
			}
		}
		
		System.out.println("\nArray Invertido no primeiro bloco");
		for (int i = 0; i <= matrix.length - 1; i++) {
			for (int j = matrix[i].length - 1; j >= 0; j--) {
				System.out.println(matrix[i][j]);
			}
		}
		
		System.out.println("\nArray Invertido");
		for (int i = matrix.length - 1; i >= 0; i--) {
			for (int j = 0; j <= matrix[i].length - 1; j++) {
				System.out.println(matrix[i][j]);
			}
		}
		
		System.out.println("\nArray Invertido");
		for (int i = matrix.length - 1; i >= 0; i--) {
			for (int j = matrix[i].length - 1; j >= 0; j--) {
				System.out.println(matrix[i][j]);
			}
		}
		
	}
}