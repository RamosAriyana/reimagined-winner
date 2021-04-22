package org.howard.edu.lsp.exam.question42;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SongsDatabaseTest {

	@Test
	@DisplayName("Test case for addSong")
	void testAddSong() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		//db.getSongs("Rap");
		String expectedValue = "[Savage, Gin and Juice]";
	    assertEquals(expectedValue, db.toString());
	    assertEquals(expectedValue, db.getSongs("Rap"));
	}
	
	@Test
	@DisplayName("Test case for addSong with songs of the same name, but different genres")
	void testAddSong1() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		db.addSong("Rock", "Changes");
		db.addSong("Pop", "Blinding Lights");
		db.addSong("Rap", "Changes");
		//db.getSongs("Rap");
		String expectedValue = "[Savage, Gin and Juice, Changes]";
	    assertEquals(expectedValue, db.toString());
	    assertEquals(expectedValue, db.getSongs("Rap"));
	}
	
	@Test
	@DisplayName("Test case for addSong with duplicates")
	void testAddSong2() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		db.addSong("Rock", "Someday");
		db.addSong("Pop", "Blinding Lights");
		db.addSong("Rock", "Someday");
		//db.getSongs("Rap");
		String expectedValue = "[Someday]";
	    assertEquals(expectedValue, db.toString());
	    assertEquals(expectedValue, db.getSongs("Rap"));
	}
	
	@Test
	@DisplayName("Test case for addSong with empty string for the song title")
	void testAddSong3() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		db.addSong("Rock", "Someday");
		db.addSong("Pop", "Blinding Lights");
		db.addSong("Country", "");
		//db.getSongs("Rap");
		String expectedValue = "[]";
	    assertEquals(expectedValue, db.toString());
	    assertEquals(expectedValue, db.getSongs("Rap"));
	}
	
	@Test
	@DisplayName("Test case for addSong with empty string for genre")
	void testAddSong4() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		db.addSong("Rock", "Someday");
		db.addSong("Pop", "Blinding Lights");
		db.addSong("", "Old Town Road");
		//db.getSongs("Rap");
		String expectedValue = "[]";
	    assertEquals(expectedValue, db.toString());
	    assertEquals(expectedValue, db.getSongs("Rap"));
	}
	
	@Test
	@DisplayName("Test case for addSong with empty strings for genre and song title")
	void testAddSong5() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		db.addSong("Rock", "Someday");
		db.addSong("Pop", "Blinding Lights");
		db.addSong("", "");
		//db.getSongs("Rap");
		String expectedValue = "[]";
	    assertEquals(expectedValue, db.toString());
	    assertEquals(expectedValue, db.getSongs("Rap"));
	}
	
	@Test
	@DisplayName("Test case for addSong with duplicate song titles")
	void testAddSong6() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		db.addSong("Rock", "Someday");
		db.addSong("Pop", "Blinding Lights");
		db.addSong("Rap", "Savage");
		//db.getSongs("Rap");
		String expectedValue = "[]";
	    assertEquals(expectedValue, db.toString());
	    assertEquals(expectedValue, db.getSongs("Rap"));
	}

	@Test
	@DisplayName("Test case for getSongs with genre not in map")
	void testGetSongs() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		db.getSongs("Pop");
		String expectedValue = "[]";
	    assertEquals(expectedValue, db.toString());
	}
	
	@Test
	@DisplayName("Test case for getSongs with duplicate keys(genres)")
	void testGetSongs1() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		db.addSong("Rock", "Someday");
		db.addSong("Pop", "Blinding Lights");
		db.addSong("Rock", "Someday");
		db.getSongs("Rock");
		String expectedValue = "[Someday]";
	    assertEquals(expectedValue, db.toString());
	}
	
	@Test
	@DisplayName("Test case for getSongs with empty map")
	void testGetSongs2() {
		SongsDatabase db = new SongsDatabase();
		db.getSongs("Pop");
		String expectedValue = "[Savage, Gin and Juice]";
	    assertEquals(expectedValue, db.toString());
	}

	@Test
	@DisplayName("Test case for getGenreOfSong")
	void testGetGenreOfSong() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		String expectedValue = "Jazz";
	    assertEquals(expectedValue, db.getGenreOfSong("Always There"));
	}
	
	@Test
	@DisplayName("Test case for getGenreOfSong with song title not in map")
	void testGetGenreOfSong1() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		String expectedValue = "Song not Found";
		assertEquals(expectedValue, db.getGenreOfSong("Purple Rain"));
	}
	
	@Test
	@DisplayName("Test case for getGenreOfSong with a song with the same name, but different genre")
	void testGetGenreOfSong2() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Rock", "Changes");
		db.addSong("Pop", "Blinding Lights");
		db.addSong("Rap", "Changes");
		String expectedValue = "Rap";
		assertEquals(expectedValue, db.getGenreOfSong("Changes"));
	}
	
	@DisplayName("Test case for getGenreOfSong with empty map")
	void testGetGenreOfSong3() {
		SongsDatabase db = new SongsDatabase();
		String expectedValue = "";
		assertEquals(expectedValue, db.getGenreOfSong(""));
	}

}
