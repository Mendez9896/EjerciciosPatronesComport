package interpreterEjercicio;



public class TerminalExp extends AbstractExpresion {

	public TerminalExp() {
		
	}

	@Override
	public void interpreter(Context context) {
		if(context.input.startsWith(context.input)) {
			int i =0;
			String text ="";
			while (context.input.charAt(i) != ']') {
				
				text += context.input.charAt(i) ;
				i++;
			}
			text += "]";
			context.output += text;
			context.input = context.input.substring(text.length());
		}

	}

}
