import java.util.ArrayList;

public class TVShows {

	public static void main(String[] args) {
		
		ArrayList<String> shows = new ArrayList<String>();
		
		shows.add("All American");
		shows.add("Power");
		shows.add("Bel Air");
		shows.add("Snowfall");
		shows.add("You");
		//Print all elements of arraylist
		
		System.out.println(shows);
		//check if arraylist has the show power in it
		System.out.println(shows.contains("Power"));
		//getting the first element of the arraylist
		System.out.println(shows.get(0));
		//printing the last element of the arraylist
		System.out.println(shows.get(shows.size()-1));
		//replacing 3rd index with new show
		shows.set(2, "Sportscenter");
		//print all shows with new input sportscenter
		System.out.println(shows);
		//Added new show the crown at the beginnin of arraylist
		shows.add(0, "The Crown");
		//print all elements of the arraylist with new show
		System.out.println(shows);
		//check if arraylist shows is empty
		System.out.println(shows.isEmpty());
		//clearing the arraylist to make it empty
		shows.clear();
		//printing arraylist and its size
		System.out.println(shows.size());
	}

}
