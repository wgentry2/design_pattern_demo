package mediator;

import java.util.ArrayList;
import java.util.List;

import command.Command;
import model.CD;

// Mediator
public class CDPlayer {

	private List<CD> cds = new ArrayList<>();
	
	public void registerCD(CD cd) {
		this.cds.add(cd);
	}
	
	public CD getCDByName(String name) {
		for (CD cd : cds) {
			if (cd.getName().equals(name))
				return cd;
		}
		throw new RuntimeException("CDPLayer does not have [" + name + "] to play");
	}
	
	public List<CD> getAllCDs() {
		return new ArrayList<>(cds);
	}
	
	public void acceptCommand(Command command) {
		for (CD cd : this.cds) {
			command.execute(cd);
		}
	}
}
