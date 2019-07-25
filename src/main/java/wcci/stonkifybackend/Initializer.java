package wcci.stonkifybackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import wcci.stonkifybackend.entities.Album;
import wcci.stonkifybackend.entities.Artist;
import wcci.stonkifybackend.entities.Song;
import wcci.stonkifybackend.repositories.AlbumRepository;
import wcci.stonkifybackend.repositories.ArtistRepository;
import wcci.stonkifybackend.repositories.SongRepository;
import wcci.stonkifybackend.util.NameHandler;
import wcci.stonkifybackend.util.RandomEntityFactory;

@Component
public class Initializer implements CommandLineRunner {

	@Autowired
	AlbumRepository albumRepo;

	@Autowired
	ArtistRepository artistRepo;

	@Autowired
	SongRepository songRepo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("RUNNING INITIALIZER");

		populateKaisEntities();
		populateIsaacsEntities();
	}

	private void populateKaisEntities() {
		Artist frank = new Artist("Frank Zappa",
				"https://www.biography.com/.image/ar_1:1%2Cc_fill%2Ccs_srgb%2Cg_face%2Cq_auto:good%2Cw_300/MTE1ODA0OTcxODMyODA0ODc3/frank-zappa-9540382-1-402.jpg");
		artistRepo.save(frank);
		Album sheik = new Album("Sheik Yerbouti",
				"https://upload.wikimedia.org/wikipedia/en/thumb/3/3a/Sheik_Yerbouti.jpeg/220px-Sheik_Yerbouti.jpeg",
				frank, 1979);
		albumRepo.save(sheik);
		Song sheik1 = new Song("I Have Been In You", "https://www.youtube.com/embed/2NOFTbbJ3vA", "3:33", sheik);
		songRepo.save(sheik1);
		Song sheik2 = new Song("Flakes", "https://www.youtube.com/embed/AgyeUHH_V0g", "6:48", sheik);
		songRepo.save(sheik2);
		Song sheik3 = new Song("Broken hearts are for ARSEHOLES", "https://www.youtube.com/embed/xE5iI0QM6qY", "3:43",
				sheik);
		songRepo.save(sheik3);
		Song sheik4 = new Song("I'm So Cute", "https://www.youtube.com/embed/D9sIKDt7Fso", "4:24", sheik);
		songRepo.save(sheik4);
		Song sheik5 = new Song("Jones Crusher", "https://www.youtube.com/embed/CCzkug4sJGQ", "2:59", sheik);
		songRepo.save(sheik5);
		Song sheik6 = new Song("What Ever Happened To All The Fun In The World",
				"https://www.youtube.com/embed/BuVz4f94uBg", "0:35", sheik);
		songRepo.save(sheik6);
		Song sheik7 = new Song("Rat Tomago", "https://www.youtube.com/embed/kKi0-SKA92g", "5:18", sheik);
		songRepo.save(sheik7);
		Song sheik8 = new Song("Wait A Minute", "https://www.youtube.com/embed/0Dzmntk8SHI", "0:32", sheik);
		songRepo.save(sheik8);
		Song sheik9 = new Song("Bobby Brown", "https://www.youtube.com/embed/VyeMNCWgDHA", "2:40", sheik);
		songRepo.save(sheik9);
		Song sheik10 = new Song("Rubber Shirt", "https://www.youtube.com/embed/uuvrgyIQWJw", "2:44", sheik);
		songRepo.save(sheik10);
		Song sheik11 = new Song("Sheik Yerbouti Tango", "https://www.youtube.com/embed/XYNB0mKm3QI", "4:01", sheik);
		songRepo.save(sheik11);
		Song sheik12 = new Song("Baby Snakes", "https://www.youtube.com/embed/cepV5f2-MaU", "1:54", sheik);
		songRepo.save(sheik12);
		Song sheik13 = new Song("Tryin to Grow a Chin", "https://www.youtube.com/embed/1Ffaymi4NIE", "3:32", sheik);
		songRepo.save(sheik13);
		Song sheik14 = new Song("City of tiny Lights", "https://www.youtube.com/embed/8ZRNPUmwAOY", "5:35", sheik);
		songRepo.save(sheik14);
		Song sheik15 = new Song("Dancin' Fool", "https://www.youtube.com/embed/PSdkPMc7aEo", "3:44", sheik);
		songRepo.save(sheik15);
		Song sheik16 = new Song("Wild Love", "https://www.youtube.com/embed/v0gkFD5k1sY", "4:10", sheik);
		songRepo.save(sheik16);
		Song sheik17 = new Song("Yo Mama", "https://www.youtube.com/embed/sXy6FYNwHrI", "12:43", sheik);
		songRepo.save(sheik17);
		Album rats = new Album("Hot Rats",
				"https://upload.wikimedia.org/wikipedia/en/9/9b/Hot_Rats_%28Frank_Zappa_album_-_cover_art%29.jpg",
				frank, 1969);
		albumRepo.save(rats);
		Song rats1 = new Song("Peaches en Regalia", "https://www.youtube.com/embed/BSb_YW3p8CY", "3:36", rats);
		songRepo.save(rats1);
		Song rats2 = new Song("Willie the Pimp", "https://www.youtube.com/embed/Xr256gta2Qw", "9:17", rats);
		songRepo.save(rats2);
		Song rats3 = new Song("Son of Mr Green Genes", "https://www.youtube.com/embed/8i_r7P39wH8", "8:31", rats);
		songRepo.save(rats3);
		Song rats4 = new Song("Little Umbrellas", "https://www.youtube.com/embed/0W0fzsJMzAM", "3:07", rats);
		songRepo.save(rats4);
		Song rats5 = new Song("The Gumbo Variations", "https://www.youtube.com/embed/isa0GlhRZYY", "12:43", rats);
		songRepo.save(rats5);
		Song rats6 = new Song("It Must Be A Camel", "https://www.youtube.com/embed/VlM1JQN6_yc", "5:18", rats);
		songRepo.save(rats6);

		Artist king = new Artist("King Crimson",
				"http://www.progarchives.com/progressive_rock_discography_band/191.JPG");
		artistRepo.save(king);
		Album court = new Album("In the Court of the Crimson King",
				"https://upload.wikimedia.org/wikipedia/en/8/84/In_the_Court_of_the_Crimson_King_-_40th_Anniversary_Box_Set_-_Front_cover.jpeg",
				king, 1969);
		albumRepo.save(court);
		Song court1 = new Song("21st Century Schizoid Man", "https://www.youtube.com/embed/3028oDEKZo4", "10:57",
				court);
		songRepo.save(court1);
		Song court2 = new Song("I Talk To The Wind", "https://www.youtube.com/embed/no8L51U_KlM", "5:21", court);
		songRepo.save(court2);
		Song court3 = new Song("Epitaph", "https://www.youtube.com/embed/QFsqacN1ZCY", "8:14", court);
		songRepo.save(court3);
		Song court4 = new Song("Moonchild", "https://www.youtube.com/embed/-NjdfOoPK9c", "2:30", court);
		songRepo.save(court4);
		Song court5 = new Song("The Court of the Crimson Kink", "https://www.youtube.com/embed/gvCmtHDDuu0", "7:15",
				court);
		songRepo.save(court5);
		Album red = new Album("Red", "https://upload.wikimedia.org/wikipedia/en/6/6c/Red%2C_King_Crimson.jpg", king,
				1974);
		albumRepo.save(red);
		Song red1 = new Song("Red", "https://www.youtube.com/embed/X_pDwv3tpug", "6:31", red);
		songRepo.save(red1);
		Song red2 = new Song("Fallen Angel", "https://www.youtube.com/embed/3aopA4E3OHY", "5:47", red);
		songRepo.save(red2);
		Song red3 = new Song("One More Red Nightmare", "https://www.youtube.com/embed/llMFiJYFm9M", "2:06", red);
		songRepo.save(red3);
		Song red4 = new Song("Providence", "https://www.youtube.com/embed/9M9oroO6FRk", "8:17", red);
		songRepo.save(red4);
		Song red5 = new Song("Starless", "https://www.youtube.com/embed/OfR6_V91fG8", "12:30", red);
		songRepo.save(red5);

		Artist miles = new Artist("Miles Davis",
				"https://img.discogs.com/saz25T9xJgOthJLeH0-lQg7jk34=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/A-23755-1394387343-4500.jpeg.jpg");
		artistRepo.save(miles);
		Album blue = new Album("Kind of Blue",
				"https://upload.wikimedia.org/wikipedia/en/9/9c/MilesDavisKindofBlue.jpg", miles, 1959);
		albumRepo.save(blue);
		Song blue1 = new Song("So What", "https://www.youtube.com/embed/ylXk1LBvIqU", "9:23", blue);
		songRepo.save(blue1);
		Song blue2 = new Song("Freddie Freeloader", "https://www.youtube.com/embed/ZZcuSBouhVA", "9:48", blue);
		songRepo.save(blue2);
		Song blue3 = new Song("Blue In Green", "https://www.youtube.com/embed/TLDflhhdPCg", "5:39", blue);
		songRepo.save(blue3);
		Song blue4 = new Song("All Blues", "https://www.youtube.com/embed/-488UORrfJ0", "11:34", blue);
		songRepo.save(blue4);
		Song blue5 = new Song("Flamenco Sketches", "https://www.youtube.com/embed/nTwp1sgUJrM", "9:27", blue);
		songRepo.save(blue5);
		Album brew = new Album("Bitches Brew", "https://upload.wikimedia.org/wikipedia/en/7/72/Bitches_brew.jpg", miles,
				1970);
		albumRepo.save(brew);
		Song brew1 = new Song("Pharaoh's Dance", "https://www.youtube.com/embed/ycSAGSO1AI0", "20:06", brew);
		songRepo.save(brew1);
		Song brew2 = new Song("Bitches Brew", "https://www.youtube.com/embed/Q26k14yBAnM", "27:00", brew);
		songRepo.save(brew2);
		Song brew3 = new Song("Spanish Key", "https://www.youtube.com/embed/ibanLlREjTk", "17:34", brew);
		songRepo.save(brew3);
		Song brew4 = new Song("John McLaughlin", "https://www.youtube.com/embed/EIqSbvktrYo", "4:26", brew);
		songRepo.save(brew4);
		Song brew5 = new Song("Miles Runs the Voodoo Down", "https://www.youtube.com/embed/4QCOJo9YH9M", "14:04", brew);
		songRepo.save(brew5);
		Song brew6 = new Song("Sanctuary", "https://www.youtube.com/embed/eV4FiRb19ZY", "10:53", brew);
		songRepo.save(brew6);

		Artist rush = new Artist("Rush", "https://mm.aiircdn.com/5/57dbcb4465170.jpg");
		artistRepo.save(rush);
		Album pictures = new Album("Moving Pictures", "https://upload.wikimedia.org/wikipedia/en/4/4a/Moving_Pictures.jpg", rush, 1981);
		albumRepo.save(pictures);
		Song pictures1 = new Song("Tom Sawyer", "https://www.youtube.com/embed/ScaPlYMgwTU", "4:25", pictures);
		songRepo.save(pictures1);
		Song pictures2 = new Song("Red Barchetta", "https://www.youtube.com/embed/mejBHBexVH4", "6:10", pictures);
		songRepo.save(pictures2);
		Song pictures3 = new Song("YYZ", "https://www.youtube.com/embed/ScaPlYMgwTU", "4:25", pictures);
		songRepo.save(pictures3);
		Song pictures4 = new Song("Limelight", "https://www.youtube.com/embed/tgj2br-teu4", "4:19", pictures);
		songRepo.save(pictures4);
		Song pictures5 = new Song("The Camera Eye", "https://www.youtube.com/embed/fjrHJhMHyIM", "11:00", pictures);
		songRepo.save(pictures5);
		Song pictures6 = new Song("Witch Hunt", "https://www.youtube.com/embed/q7V-AkPi540", "4:45", pictures);
		songRepo.save(pictures6);
		Song pictures7 = new Song("Vital Signs", "https://www.youtube.com/embed/nnLJoBU9cLw", "4:46", pictures);
		songRepo.save(pictures7);
		Album twentyOneTwelve = new Album("2112", "https://upload.wikimedia.org/wikipedia/en/c/c9/Rush_2112.jpg", rush, 1976);
		albumRepo.save(twentyOneTwelve);
		Song twentyOneTwelve1 = new Song("2112", "https://www.youtube.com/embed/AZm1_jtY1SQ", "20:39", twentyOneTwelve);
		songRepo.save(twentyOneTwelve1);
		Song twentyOneTwelve2 = new Song("A Passage To Bangkok", "https://www.youtube.com/embed/zaC041pQl4I", "3:34", twentyOneTwelve);
		songRepo.save(twentyOneTwelve2);
		Song twentyOneTwelve3 = new Song("The Twilight Zone", "https://www.youtube.com/embed/F7Gz8_xshlQ", "3:19", twentyOneTwelve);
		songRepo.save(twentyOneTwelve3);
		Song twentyOneTwelve4 = new Song("Lessons", "https://www.youtube.com/embed/uZ7naZL9Hkg", "3:52", twentyOneTwelve);
		songRepo.save(twentyOneTwelve4);
		Song twentyOneTwelve5 = new Song("Tears", "https://www.youtube.com/embed/iRDFuD-3B48", "3:34", twentyOneTwelve);
		songRepo.save(twentyOneTwelve5);
		Song twentyOneTwelve6 = new Song("Something For Nothing", "https://www.youtube.com/embed/D-k8zBWLQFM", "3:57", twentyOneTwelve);
		songRepo.save(twentyOneTwelve6);
		
		Artist herbie = new Artist("Herbie Hancock", "https://www.abc.net.au/news/image/11050610-3x2-940x627.jpg");
		artistRepo.save(herbie);
		Album headHunters = new Album("Head Hunters", "https://upload.wikimedia.org/wikipedia/en/a/aa/Head_Hunters_Album.jpg", herbie, 1973);
		albumRepo.save(headHunters);
		Song headHunters1 = new Song("Chameleon", "https://www.youtube.com/embed/UbkqE4fpvdI", "15:44", headHunters);
		songRepo.save(headHunters1);
		Song headHunters2 = new Song("Watermelon Man", "https://www.youtube.com/embed/4bjPlBC4h_8", "6:31", headHunters);
		songRepo.save(headHunters2);
		Song headHunters3 = new Song("Sly", "https://www.youtube.com/embed/hNlm-W3m1qc", "10:14", headHunters);
		songRepo.save(headHunters3);
		Song headHunters4 = new Song("Vein Melter", "https://www.youtube.com/embed/mZy7v_-ss74", "9:10", headHunters);
		songRepo.save(headHunters4);
		Album maiden = new Album("Maiden Voyage", "https://upload.wikimedia.org/wikipedia/en/7/7a/Maiden_Voyage_%28Hancock%29.jpg", herbie, 1965);
		albumRepo.save(maiden);		
		Song maiden1 = new Song("Maiden Voyage", "https://www.youtube.com/embed/hwmRQ0PBtXU", "7:57", maiden);
		songRepo.save(maiden1);
		Song maiden2 = new Song("The Eye of the Hurricane", "https://www.youtube.com/embed/oQ9V22hnYyQ", "6:01", maiden);
		songRepo.save(maiden2);
		Song maiden3 = new Song("Little One", "https://www.youtube.com/embed/1Kl4QgMuoBU", "8:47", maiden);
		songRepo.save(maiden3);
		Song maiden4 = new Song("Survival of the Fittest", "https://www.youtube.com/embed/VUnE_P6n1gU", "10:03", maiden);
		songRepo.save(maiden4);
		Song maiden5 = new Song("Dolphin Dance", "https://www.youtube.com/embed/iB2Z2DY17yQ", "9:16", maiden);
		songRepo.save(maiden5);

	}

	private void populateIsaacsEntities() {

	}
}
