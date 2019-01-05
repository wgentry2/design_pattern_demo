package interpreter;

public class InterpreterDemo {

	// LOAD, PLAY
	public static void main(String[] args) {
		ExpressionEvaluator evaluator = new ExpressionEvaluator();
		evaluator.evaluate("LOAD LedZeppelin ROCK");
		evaluator.evaluate("PLAY TheStrokes");
	}
}
