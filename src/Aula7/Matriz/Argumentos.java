package Aula7.Matriz;

public class Argumentos {

	public static void main(String[] args) {
		System.out.println(args.length);

		//INICIALIZAÇÃO: int i = 0;
		
		//COMPARAÇÃO: i<args.length
		
		//INCREMENTAÇÃO: i++ // i+=1 // i=i+1
		
		//BODY: System.out.println(args[i]);
		
		int i;
		for (i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("---------" + i);
		i=0;
		while(i<args.length){
			System.out.println(args[i]);
			i++;
		}
		System.out.println("---------" + i);
		i=9;
		while(i>=0){
			System.out.println(args[i]);
			i--;
		}
		
//		if (args.length>1)
//			System.out.println(args[1]);
//		if (args.length>2)
//			System.out.println(args[2]);
//		if (args.length>3)
//			System.out.println(args[3]);
//		if (args.length>4)
//			System.out.println(args[4]);
//		if (args.length>5)
//			System.out.println(args[5]);
//		if (args.length>6)
//			System.out.println(args[6]);
//		if (args.length>7)
//			System.out.println(args[7]);
	}

}
