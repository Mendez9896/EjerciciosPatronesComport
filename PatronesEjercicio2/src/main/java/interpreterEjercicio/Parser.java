package interpreterEjercicio;

import java.util.ArrayList;

public class Parser {

	private ArrayList<AbstractExpresion> parseTree = new ArrayList<>();
	private Context context;

	public Parser(String s) {
		
		context = new Context(s.replace(" ", ""));
		for (String token : s.split(" ")) {
			switch (token) {
			case "Como":
				parseTree.add(new TerminalExpressionComo());
				break;
			case "Quiero":
				parseTree.add(new TerminalExpressionQuiero());
				break;
			case "Para":
				parseTree.add(new TerminalExpressionPara());
				break;

			default:
				parseTree.add(new TerminalExp());
				break;
			}
		}
	}

	public String evaluate() {
		for (AbstractExpresion e : parseTree) {
			
			e.interpreter(context);
		}

		return context.output;
	}

}
