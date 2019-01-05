package interpreter;

import mediator.CDPlayer;
import model.CD;
import model.CD.Genre;

public class ExpressionEvaluator {
	
	private CDPlayer player = new CDPlayer();

	public void evaluate(String context) {
		// LOAD
		if (new LoadExpression().interpret(context)) {
			if (new AlbumDetailsExpression().interpret(context)) {
				String[] albumInformation = context.split(" ");
				player.registerCD(new CD(albumInformation[1], Genre.valueOf(albumInformation[2])));
			}
		}
		// PLAY
		if (new PlayExpression().interpret(context)) {
			player.getCDByName(context.split(" ")[1]).play();
		}
	}

}
