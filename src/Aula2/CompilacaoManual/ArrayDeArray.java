package Aula2.CompilacaoManual;

class ArrayDeArray {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int[][] matrix = {{1, 2}, {10, 20, 30}, {11, 21, 31, 41, 51}};
		for (int i = 0; i <= matrix.length - 1; i++) {
			for (int j = 0; j <= matrix[i].length - 1; j++) {
				System.out.println(matrix[i][j]);
			}
		}
	}
}