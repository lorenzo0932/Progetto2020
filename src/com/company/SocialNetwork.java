import java.util.*;


public class SocialNetwork {
	
	private Map<String, Set<String>> reteSociale;
	
	//costruttore
	public SocialNetwork () {
		reteSociale=new HashMap <String, Set<String>>();
	}
	
	//cerca l'utente corrispondente all'id del post
	private String searchUser (String id, List<Post> ps) {
		String user= null;
		for (Post p:ps) {
			if(p.id==id) {
				user=p.author;
			}
		}
		return user;
		
	}
	
	public Map<String,Set<String>> guessFollowers (List<Post> ps) throws NullPointerException{
		if (ps==null) throw new NullPointerException();
		for (Post p : ps) {
			if (p.text.contains("like")) {
				
				String id=p.text.substring(5); //prendo la sotto stringa dal carattere 5 alla fine
				String user=searchUser(id, ps); //cerca l'utente corrispondente all'id del post
				reteSociale.put(p.author, new HashSet<String>());
				reteSociale.get(p.author).add(user);
				System.out.println(reteSociale.get(p.author).contains(user));
			}		
		}
		return reteSociale;
	}
	
	
	
}
