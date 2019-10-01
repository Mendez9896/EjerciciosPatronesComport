package interpreterEjercicio;

public class TerminalExpressionQuiero extends AbstractExpresion {

	public TerminalExpressionQuiero() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interpreter(Context context) {
		if(context.input.startsWith("Quiero")) {
			context.output = context.output + "When";
			context.input = context.input.substring(6);
		}

	}

}
