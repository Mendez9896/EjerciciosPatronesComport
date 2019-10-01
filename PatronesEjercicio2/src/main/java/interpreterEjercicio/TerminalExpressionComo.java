package interpreterEjercicio;

public class TerminalExpressionComo extends AbstractExpresion {

	public TerminalExpressionComo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interpreter(Context context) {
		if(context.input.startsWith("Como")) {
			context.output = context.output + "Given";
			context.input = context.input.substring(4);
		}

	}

}
