package command;

import model.CD;

public class PlayCommand implements Command {

	@Override
	public void execute(CD cd) {
		cd.play();
	}

}
