package com.example.demo;

import command.PlayCommand;
import command.PlayScreamoCommand;
import mediator.CDPlayer;
import model.CD;
import model.CD.Genre;

public class DemoApplication {

	public static void main(String[] args) {
		CD cd = new CD("Led Zeppelin IV", Genre.ROCK);
		CD cd4 = new CD("Led Zeppelin VI", Genre.ROCK);
		CD cd3 = new CD("CD 3", Genre.FOLK);
		CD cd2 = new CD("Some screamo", Genre.SCREAMO);
		CDPlayer player = new CDPlayer();
		
		player.registerCD(cd);
		player.registerCD(cd2);
		player.registerCD(cd3);
		player.registerCD(cd4);
		
		// First, we just 'We want music!"
		player.acceptCommand(new PlayCommand());
		
		// Next, we picky, we want screamo
		player.acceptCommand(new PlayScreamoCommand());
	}

}

