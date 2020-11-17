package com.company;
import java.text.SimpleDateFormat;
import java.util.*;

public class Post {
	
	//identificatore univoco del post
	protected String id;
	
	//utente della rete sociale che ha scritto il post
	protected String author;
	
	//:	testo	(massimo 140	caratteri)	del	post
	protected String text;
	
	//data e ora di invio del post
	protected String timestamp;
	
	//lista degli utenti della rete sociale che hanno messo like al post
	protected Vector <String> likes;
	
	//costruttore
	public Post(String id, String author, String text) {
		this.likes= new Vector<String>();
		this.id=id;
		this.author=author;
		this.text=text;
		this.timestamp= new SimpleDateFormat("HH.mm.ss.dd.MM.yyyy").format(new Date());
	}
	
	public String getId () {
		return id;
	}
	
	public String getAuthor () {
		return author;
	}
	
	public String getText() {
		return text;
	}
	
	public String getTimestamp () {
		return timestamp;
		
	}
	
	public Vector<String> getLikes(){
        return likes;
    }
	
	//Aggiunge il nome dell'autore che ha messo il like al post
	public boolean addLikes(String username, Post ps) {
		
		if(ps.likes.contains(username)) {
			return false;
		}
		else {
			ps.likes.add(username);
		}
		return true;
	}
	
	public String toString() {
		return "\nId del Post: " + id + "\n" +
				"Autore del Post: " + author + "\n" +
				"Testo del post:\n " + text + "\n" +
				"Ora e data di pubblicazione: " + timestamp +"\n"+
				"Persone che hanno messo like al Post: ";
					
	}
	
	//stampa i nomi delle persone che hanno messo like al post
	public void stampaLikes () {
		for(int i=0; i<likes.size(); i++)
			System.out.println(likes.get(i) + ", ");
	}
	
	public void Display() {
		System.out.println(toString());
		stampaLikes();
		System.out.println("\n");
		
	}
	
	
	
		
	}
	
	
	
	
	



