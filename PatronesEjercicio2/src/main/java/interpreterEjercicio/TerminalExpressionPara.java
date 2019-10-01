package interpreterEjercicio;

public class TerminalExpressionPara extends AbstractExpresion {

	public TerminalExpressionPara() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interpreter(Context context) {
		if(context.input.startsWith("Para")) {
			context.output = context.output + "Then";
			context.input = context.input.substring(4);
		}

	}

}
