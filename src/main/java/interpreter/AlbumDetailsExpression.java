package interpreter;

public class AlbumDetailsExpression implements Expression {

	// LOAD LedZeppelin rock
	@Override
	public boolean interpret(String context) {
		return context.split(" ").length == 3;
	}

}
