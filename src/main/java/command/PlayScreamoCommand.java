package command;

import model.CD;
import model.CD.Genre;

public class PlayScreamoCommand implements Command {

	@Override
	public void execute(CD cd) {
		if (cd.getGenre().equals(Genre.SCREAMO))
			cd.play();
		else
			System.out.println(cd.getName() + " is not screamo; Cannot be played");
	}

}
