import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		SocialNetwork social=new SocialNetwork();
		
		Post laMadonna=new Post("15", "Filippo", "Sucami un Pruno");
		Post Prova=new Post("36", "Caio", "like 15");
		
		ArrayList<Post> lista= new ArrayList();
		lista.add(laMadonna);
		lista.add(Prova);
		
		try {
			social.guessFollowers(lista);
		}
		catch (NullPointerException e) {
			
		}
	}
	

}
