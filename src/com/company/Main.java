package com.company;

import java.util.*;

public class Main {
	
	public static void main (final String[] args) {
		final SocialNetwork social=new SocialNetwork();
		
		final Post laMadonna=new Post("15", "Filippo", "Sucami un Pruno");
		final Post Prova=new Post("36", "Caio", "like 15");
		
		final ArrayList<Post> lista= new ArrayList();
		lista.add(laMadonna);
		lista.add(Prova);
		
		try {
			social.guessFollowers(lista);
		}
		catch (final NullPointerException e) {
			
		}
	}
	

}
