package interpreterEjercicio;



public class Client {

	public static void main(String[] args) {
		String toInterpretate = "Como [como] Quiero [quiero] Para [para]";
		System.out.println("Evaluate: " + toInterpretate + " \n Interpretate: " + new Parser(toInterpretate).evaluate());

	}
}
