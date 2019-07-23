package wcci.stonkifybackend.util;

import java.util.Random;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;

import wcci.stonkifybackend.entities.Album;
import wcci.stonkifybackend.entities.Artist;
import wcci.stonkifybackend.entities.Song;

public class RandomEntityFactory {

	private static final Random RANDOM = new Random(System.nanoTime());
	private static final Lorem LOREM = LoremIpsum.getInstance();
	
	private static final String ARTIST_IMG_URL = "https://www.biography.com/.image/ar_1:1%2Cc_fill%2Ccs_srgb%2Cg_face%2Cq_auto:good%2Cw_300/MTE1ODA0OTcxODMyODA0ODc3/frank-zappa-9540382-1-402.jpg";

	private static final String ALBUM_IMG_URL = "https://upload.wikimedia.org/wikipedia/en/thumb/3/3a/Sheik_Yerbouti.jpeg/220px-Sheik_Yerbouti.jpeg";
	
	private RandomEntityFactory()
		{
		}

	public static Artist generateRandomArtist()
		{
		String name = LOREM.getName();
//		String imgUrl = LOREM.getUrl();
		String imgUrl = ARTIST_IMG_URL;
		Artist artist = new Artist(name, imgUrl);
		return artist;
		}

	public static Song generateRandomSong(Album album)
		{
		String title = LOREM.getTitle(1 + RANDOM.nextInt(4));
		String linkUrl = LOREM.getUrl();
		String duration = generateRandomDuration();
		Song song = new Song(title, linkUrl, duration, album);
		return song;
		}

	public static Album generateRandomAlbum(Artist artist)
		{
		String title = LOREM.getTitle(1 + RANDOM.nextInt(6));
//		String imgUrl = LOREM.getUrl();
		String imgUrl = ALBUM_IMG_URL;
		Album album = new Album(title, imgUrl, artist);
		return album;
		}

	private static String generateRandomDuration()
		{
		int minutes = RANDOM.nextInt(10);
		int seconds = RANDOM.nextInt(60);
		if (minutes == 0 && seconds == 0)
			{
			minutes = 1;
			seconds = 5;
			}
		String duration;
		if (seconds < 10)
			{
			duration = minutes + ":0" + seconds;
			}
		else
			{
			duration = minutes + ":" + seconds;
			}

		return duration;
		}
}
