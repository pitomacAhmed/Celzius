import java.util.Scanner;

public class Celzius {

	public static void main(String[] args) {
	Scanner tastatura = new Scanner(System.in);
	System.out.println("Vnesete Celziusovi stepeni:");
	int c = tastatura.nextInt();
	int f = 9*c/5+32;
	System.out.println(c+"stepeni Celziusovi =");
	System.out.println(f + "Fahrenhajtovi stepeni");

	}

}
