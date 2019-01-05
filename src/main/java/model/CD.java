package model;

public class CD {
	
	public enum Genre {
		
		ROCK, FOLK, SCREAMO;
	}

	//Model class is here to hold data
	private String name;
	private Genre genre;
	
	
	
	public CD(String name, Genre genre) {
		this.name = name;
		this.genre = genre;
	}
	
	public String getName() {
		return name;
	}
	
	public Genre getGenre() {
		return genre;
	}
	
	public void play() {
		System.out.println("Playing CD " + name);
	}
}
