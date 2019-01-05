package interpreter;

public class LoadExpression implements Expression {

	// Based on some string, read it and create a new entry of a cd for our cd player
	@Override
	public boolean interpret(String context) {
		return context.startsWith("LOAD");
	}

	
}
