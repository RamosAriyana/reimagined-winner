package org.howard.edu.lsp.exam.question42;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * This class contains the methods to add song titles and genres to a Map, retrieve all the songs for a genre
 * and return the genre for a specific song.
 * @author Ariyana Ramos
 */
public class SongsDatabase {
	
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();
	
	/*
	 * This methods stores a song genre and title as a key/value pair in the song database Map.
	 * @param genre - Genre of the song; stored as key
	 * @param songTitle - Title of the song; stored as vale
	 */
	public void addSong(String genre, String songTitle) {
		 if (!map.containsKey(genre)) {
			 map.put(genre, new HashSet<String>());
	     }
		 map.get(genre).add(songTitle);
	}
		
	/*
	 * This method returns the Set that contains all the songs in the genre
	 * @param genre - Genre of the song; stored as key
	 * @return genre
	 */
	public Set<String> getSongs(String genre) {
		return map.get(genre);
	}
			
	/*
	 * This method returns the genre of the specified song title
	 * @param songTitle - Title of the song; stored as vale
	 * @return genre - If key found, return the genre 
	 * @return "Song not Found" if key not found
	 */
	public String getGenreOfSong(String songTitle) {
		for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(songTitle)) {
                return entry.getKey();
            }  
        }
        return "Song not Found";
	}
	
	/*
	 * This method returns the string representation of the Set from the getSongs method.
	 * @return map
	 */
	public String toString() {
		//return ((Entry<String, Set<String>>) map).getValue();
		return map.values().toString();
	}
}
