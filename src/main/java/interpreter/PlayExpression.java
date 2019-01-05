package interpreter;

public class PlayExpression implements Expression {

	// PLAY <cd_name>
	@Override
	public boolean interpret(String context) {
		return context.startsWith("PLAY") && context.split(" ").length == 2;
	}

}
