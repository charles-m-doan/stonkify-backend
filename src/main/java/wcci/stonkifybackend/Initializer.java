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

		Artist artist01 = RandomEntityFactory.generateRandomArtist();
		artistRepo.save(artist01);

		Album album01 = RandomEntityFactory.generateRandomAlbum(artist01);
		albumRepo.save(album01);

		Song song01 = RandomEntityFactory.generateRandomSong(album01);
		songRepo.save(song01);
		Song song02 = RandomEntityFactory.generateRandomSong(album01);
		songRepo.save(song02);
		Song song03 = RandomEntityFactory.generateRandomSong(album01);
		songRepo.save(song03);
		Song song04 = RandomEntityFactory.generateRandomSong(album01);
		songRepo.save(song04);

		Album album02 = RandomEntityFactory.generateRandomAlbum(artist01);
		albumRepo.save(album02);

		Song song05 = RandomEntityFactory.generateRandomSong(album02);
		songRepo.save(song05);
		Song song06 = RandomEntityFactory.generateRandomSong(album02);
		songRepo.save(song06);
		Song song07 = RandomEntityFactory.generateRandomSong(album02);
		songRepo.save(song07);
		Song song08 = RandomEntityFactory.generateRandomSong(album02);
		songRepo.save(song08);

		Artist artist02 = RandomEntityFactory.generateRandomArtist();
		artistRepo.save(artist02);

		Album album03 = RandomEntityFactory.generateRandomAlbum(artist02);
		albumRepo.save(album03);

		Song song09 = RandomEntityFactory.generateRandomSong(album03);
		songRepo.save(song09);
		Song song10 = RandomEntityFactory.generateRandomSong(album03);
		songRepo.save(song10);
		Song song11 = RandomEntityFactory.generateRandomSong(album03);
		songRepo.save(song11);
		Song song12 = RandomEntityFactory.generateRandomSong(album03);
		songRepo.save(song12);

		populateKaisEntities();
		populateIsaacsEntities();
	}

	private void populateKaisEntities() {

	}

	private void populateIsaacsEntities() {
		
		Artist modestMouse = new Artist("Modest Mouse","https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Modest_Mouse_UPT.jpg/267px-Modest_Mouse_UPT.jpg");
		artistRepo.save(modestMouse);
		Artist arcadeFire = new Artist("Arcade Fire", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Arcade_Fire_Live_in_Concert_%2819804231713%29.jpg/300px-Arcade_Fire_Live_in_Concert_%2819804231713%29.jpg");
		artistRepo.save(arcadeFire);
		Artist theAntlers = new Artist("The Antlers", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/The_Antlers_at_Neumos.jpg/220px-The_Antlers_at_Neumos.jpg");
		artistRepo.save(theAntlers);
		Artist beachHouse = new Artist("Beach House", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Beach_House_at_House_of_Blues_San_Diego_on_July_1_2012.jpg/300px-Beach_House_at_House_of_Blues_San_Diego_on_July_1_2012.jpg");
		artistRepo.save(beachHouse);
		Artist theNational = new Artist("The National","https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/The_National_at_Brooklyn_Academy_of_Music.jpg/220px-The_National_at_Brooklyn_Academy_of_Music.jpg");
		artistRepo.save(theNational);
		
		Album highViolet = new Album("High Violet", "https://upload.wikimedia.org/wikipedia/en/thumb/0/08/Highviolet.jpg/220px-Highviolet.jpg", theNational, 2010);
		albumRepo.save(highViolet);
		Album boxer = new Album("Boxer", "https://upload.wikimedia.org/wikipedia/en/thumb/0/0a/TheNational-Boxer.jpg/220px-TheNational-Boxer.jpg", theNational, 2007);
		albumRepo.save(boxer);
		Album funeral = new Album("Funeral", "https://upload.wikimedia.org/wikipedia/en/thumb/2/25/ArcadeFireFuneralCover.jpg/220px-ArcadeFireFuneralCover.jpg", arcadeFire, 2004);
		albumRepo.save(funeral);
		Album noOnesFirst = new Album("No One's First and You're Next", "https://upload.wikimedia.org/wikipedia/en/thumb/a/a2/Modest_Mouse_-_No_One%27s_First%2C_And_You%27re_Next.jpg/220px-Modest_Mouse_-_No_One%27s_First%2C_And_You%27re_Next.jpg", modestMouse, 2009);
		albumRepo.save(noOnesFirst);
		Album hospice = new Album("Hospice", "https://upload.wikimedia.org/wikipedia/en/thumb/b/bd/Hospicecover.jpg/220px-Hospicecover.jpg", theAntlers, 2009);
		albumRepo.save(hospice);
		Album devotion = new Album("Devotion", "https://upload.wikimedia.org/wikipedia/en/thumb/1/1c/BeachHouseDevotion.jpg/220px-BeachHouseDevotion.jpg", beachHouse, 2008);
		albumRepo.save(devotion);
		

		theNational.addAlbum(boxer);
		theNational.addAlbum(highViolet);
		arcadeFire.addAlbum(funeral);
		theAntlers.addAlbum(hospice);
		modestMouse.addAlbum(noOnesFirst);
		beachHouse.addAlbum(devotion);
		
		Song fakeEmpire= new Song("Fake Empire", "https://www.youtube.com/watch?v=YKYvAJBsoqY&list=PLhAkn8Z8cAtiKeYHgAG44h8uDp3TmsJs5&index=1", "3:25", boxer);
		songRepo.save(fakeEmpire);
		boxer.addSong(fakeEmpire);
		
		Song mistakenForSTrangers= new Song("Mistaken For Strangers", "https://www.youtube.com/watch?v=EIoUl3Kj7cw&list=PLhAkn8Z8cAtiKeYHgAG44h8uDp3TmsJs5&index=2", "3:30", boxer);
		songRepo.save(mistakenForSTrangers);
		boxer.addSong(mistakenForSTrangers);
		
		Song brainy = new Song("Brainy", "https://www.youtube.com/watch?v=CNXDAf_OgsE&list=PLhAkn8Z8cAtiKeYHgAG44h8uDp3TmsJs5&index=3", "3:18", boxer);
		songRepo.save(brainy);
		boxer.addSong(brainy);
		
		Song squalorVictoria = new Song("Squalor, Victoria", "https://www.youtube.com/watch?v=L_sn90wEEIY&list=PLhAkn8Z8cAtiKeYHgAG44h8uDp3TmsJs5&index=4", "2:59", boxer);
		songRepo.save(squalorVictoria);
		boxer.addSong(squalorVictoria);
		
		Song greenGloves = new Song("Green Gloves", "https://www.youtube.com/watch?v=eCeBxmMb-uw&list=PLhAkn8Z8cAtiKeYHgAG44h8uDp3TmsJs5&index=5", "3:39", boxer);
		songRepo.save(greenGloves);
		boxer.addSong(greenGloves);
		
		Song slowShow= new Song("Slow Show", "https://www.youtube.com/watch?v=Aol6RMtEB8Y&list=PLhAkn8Z8cAtiKeYHgAG44h8uDp3TmsJs5&index=6", "4:08", boxer);
		songRepo.save(slowShow);
		boxer.addSong(slowShow);
		
		Song apartmentStory = new Song("Apartment Story", "https://www.youtube.com/watch?v=UgBSKolU2BA&list=PLhAkn8Z8cAtiKeYHgAG44h8uDp3TmsJs5&index=7", "3:32", boxer);
		songRepo.save(apartmentStory);
		boxer.addSong(apartmentStory);
		
		Song startAWar= new Song("Start A War", "https://www.youtube.com/watch?v=Q0eEbxpj0dc&list=PLhAkn8Z8cAtiKeYHgAG44h8uDp3TmsJs5&index=8", "3:16", boxer);
		songRepo.save(startAWar);
		boxer.addSong(startAWar);
		
		Song guestRoom= new Song("Guest Room", "https://www.youtube.com/watch?v=pqtdZBxTHjY&list=PLhAkn8Z8cAtiKeYHgAG44h8uDp3TmsJs5&index=9", "3:18", boxer);
		songRepo.save(guestRoom);
		boxer.addSong(guestRoom);
		
		Song racingLikeAPro= new Song("Racing Like A Pro", "https://www.youtube.com/watch?v=gH1zpbJUPj0&list=PLhAkn8Z8cAtiKeYHgAG44h8uDp3TmsJs5&index=10", "3:23", boxer);
		songRepo.save(racingLikeAPro);
		boxer.addSong(racingLikeAPro);
		
		Song ada = new Song("Ada", "https://www.youtube.com/watch?v=-0oqiAgHziI&list=PLhAkn8Z8cAtiKeYHgAG44h8uDp3TmsJs5&index=11", "4:03", boxer);
		songRepo.save(ada);
		boxer.addSong(ada);
		
		Song gospel = new Song("Gospel", "https://www.youtube.com/watch?v=iwFX1FEi-v0&list=PLhAkn8Z8cAtiKeYHgAG44h8uDp3TmsJs5&index=12", "4:29", boxer);
		songRepo.save(gospel);
		boxer.addSong(gospel);
		
		Song terribleLove= new Song("Terrible Love", "https://youtu.be/tHUmXL2EHx0", "3:25", highViolet);
		songRepo.save(terribleLove);
		highViolet.addSong(terribleLove);
		
		Song sorrow= new Song("Sorrow", "https://youtu.be/fxWh5ivlBS0", "3:30", highViolet);
		songRepo.save(sorrow);
		highViolet.addSong(sorrow);
		
		Song anyonesGhost = new Song("Anyones Ghost", "https://youtu.be/MSYAg6vbAqg", "3:18", highViolet);
		songRepo.save(anyonesGhost);
		highViolet.addSong(anyonesGhost);
		
		Song littleFaith = new Song("Little Faith", "https://youtu.be/dMcVCylxSnk", "2:59", highViolet);
		songRepo.save(littleFaith);
		highViolet.addSong(littleFaith);
		
		Song afraidOfEveryone = new Song("Afraid Of Everyone", "https://youtu.be/MBu-JKV4PF8", "3:39", highViolet);
		songRepo.save(afraidOfEveryone);
		highViolet.addSong(afraidOfEveryone);
		
		Song bloodbuzzOhio = new Song("Bloodbuzz Ohio", "https://youtu.be/MBu-JKV4PF8", "4:08", highViolet);
		songRepo.save(bloodbuzzOhio);
		highViolet.addSong(bloodbuzzOhio);
		
		Song lemonworld = new Song("Lemonworld", "https://youtu.be/5Vzw1VKWzlg", "3:32", highViolet);
		songRepo.save(lemonworld);
		highViolet.addSong(lemonworld);
		
		Song runaway = new Song("Runaway", "https://youtu.be/zN-VmYRyB6A", "3:16", highViolet);
		songRepo.save(runaway);
		highViolet.addSong(runaway);
		
		Song conversation16 = new Song("Converstion 16", "https://youtu.be/SnbXLCRIBe8", "3:18", highViolet);
		songRepo.save(conversation16);
		highViolet.addSong(conversation16);
		
		Song england = new Song("England", "https://youtu.be/xcEwEYrWo6Q", "3:23", highViolet);
		songRepo.save(england);
		highViolet.addSong(england);
		
		Song vanderlyleCrybabyGeeks = new Song("Vanderlyle Crybaby Geeks", "https://youtu.be/IgY3z5VSDBg", "4:03", highViolet);
		songRepo.save(vanderlyleCrybabyGeeks);
		highViolet.addSong(vanderlyleCrybabyGeeks);
		
		Song neighborhood1 = new Song("Neighborhood #1 (Tunnels)", "https://youtu.be/0b_IHjWXbuM", "3:25", funeral);
		songRepo.save(neighborhood1);
		funeral.addSong(neighborhood1);
		
		Song neighborhood2 = new Song("Neighborhood #2 (Laïka)", "https://youtu.be/OlRfZABWgK4", "3:30", funeral);
		songRepo.save(neighborhood2);
		funeral.addSong(neighborhood2);
		
		Song frenchSong = new Song("Une année sans lumière", "https://youtu.be/wHsvgIDn8Kg", "3:18", funeral);
		songRepo.save(frenchSong);
		funeral.addSong(frenchSong);
		
		Song neighborhood3 = new Song("Neighborhood #3 (Power Out)", "https://youtu.be/TA68f56yh80", "2:59", funeral);
		songRepo.save(neighborhood3);
		funeral.addSong(neighborhood3);
		
		Song neighborhood4 = new Song("Neighborhood #4 (7 Kettles)", "https://youtu.be/kBhlRY5LpZw", "3:39", funeral);
		songRepo.save(neighborhood4);
		funeral.addSong(neighborhood4);
		
		Song crownOfLove= new Song("Crown of Love", "https://youtu.be/kxkK06HlgqA", "4:08", funeral);
		songRepo.save(crownOfLove);
		funeral.addSong(crownOfLove);
		
		Song wakeUp = new Song("Wake Up", "https://youtu.be/yIE9UAZGry0", "3:32", funeral);
		songRepo.save(wakeUp);
		funeral.addSong(wakeUp);
		
		Song haiti= new Song("Haiti", "https://youtu.be/xwcaDvr8f1o", "3:16", funeral);
		songRepo.save(haiti);
		funeral.addSong(haiti);
		
		Song rebellion= new Song("Rebellion (lies)", "https://youtu.be/CICIfCbw1nU", "3:18", funeral);
		songRepo.save(rebellion);
		funeral.addSong(rebellion);

		Song backseat= new Song("In the Backseat", "https://youtu.be/SsmEMk2QOnM", "3:18", funeral);
		songRepo.save(backseat);
		funeral.addSong(backseat);
		
		Song satellite = new Song("Satellite Skin", "https://youtu.be/z66_AKHYaAA", "3:59", noOnesFirst);
		songRepo.save(satellite);
		noOnesFirst.addSong(satellite);
		
		Song guilty = new Song("Guilty Cocker Spaniel", "https://youtu.be/igXIB2ArH8c", "3:24", noOnesFirst);
		songRepo.save(guilty);
		noOnesFirst.addSong(guilty);
		
		Song autumn = new Song("Autumn Beds", "https://youtu.be/3g_WWoIePns", "3:59", noOnesFirst);
		songRepo.save(autumn);
		noOnesFirst.addSong(autumn);
		
		Song whale = new Song("The Whale Song", "https://youtu.be/8aQ8D9Iawo8", "3:59", noOnesFirst);
		songRepo.save(whale);
		noOnesFirst.addSong(whale);
		
		Song perpetual = new Song("Perpetual Motion Machine", "https://youtu.be/ctOBuaDnqJI", "3:15", noOnesFirst);
		songRepo.save(perpetual);
		noOnesFirst.addSong(perpetual);
		
		Song history = new Song("History Sticks to Your Feet", "https://youtu.be/1Pt572F7lZA", "3:55", noOnesFirst);
		songRepo.save(history);
		noOnesFirst.addSong(history);
		
		Song rat = new Song("King Rat", "https://youtu.be/WYDiLJPJ24g", "5:31", noOnesFirst);
		songRepo.save(rat);
		noOnesFirst.addSong(rat);
		
		Song iveGot = new Song("I've Got it All", "https://youtu.be/1hvOpUoE_CY", "3:11", noOnesFirst);
		songRepo.save(iveGot);
		noOnesFirst.addSong(iveGot);
		
		Song wedding = new Song("Wedding Bell", "https://youtu.be/udVTZsn1EqA", "3:55", devotion);
		songRepo.save(wedding);
		devotion.addSong(wedding);
		
		Song youCameToMe = new Song("You came to Me", "https://youtu.be/m8n5YXzeoyU", "4:06", devotion);
		songRepo.save(youCameToMe);
		devotion.addSong(youCameToMe);
		
		Song gila = new Song("Gila", "https://youtu.be/96pKsDnDgOw", "3:59", devotion);
		songRepo.save(gila);
		devotion.addSong(gila);
		
		Song turtle = new Song("Turtle Island", "https://youtu.be/opFxXgZzuIk", "3:59", devotion);
		songRepo.save(turtle);
		devotion.addSong(turtle);
		
		Song holy = new Song("Holy Dances", "https://youtu.be/XZLNxr1CbaI", "3:15", devotion);
		songRepo.save(holy);
		devotion.addSong(holy);
		
		Song years = new Song("All the Years", "https://youtu.be/gysrIvVLwhE", "3:55", devotion);
		songRepo.save(years);
		devotion.addSong(years);
		
		Song heart = new Song("Heart of Chambers", "https://youtu.be/KzF8n5kKKGE", "5:31", devotion);
		songRepo.save(heart);
		devotion.addSong(heart);
		
		Song astronaut = new Song("Astronaut", "https://youtu.be/cFvI29B8VFY", "3:11", devotion);
		songRepo.save(astronaut);
		devotion.addSong(astronaut);
		
		Song prologue = new Song("Prologue", "https://youtu.be/rXmNfqIR4z0", "2:36", hospice);
		songRepo.save(prologue);
		hospice.addSong(prologue);
		
		Song kettering = new Song("Kettering", "https://youtu.be/8We0FVflGaU", "5:14", hospice);
		songRepo.save(kettering);
		hospice.addSong(kettering);
		
		Song sylvia = new Song("Sylvia", "https://youtu.be/egsSN31uAFk", "5:30", hospice);
		songRepo.save(sylvia);
		hospice.addSong(sylvia);
		
		Song atrophy = new Song("Atrophy", "https://youtu.be/8goKJebNlGk", "7:38", hospice);
		songRepo.save(atrophy);
		hospice.addSong(atrophy);
		
		Song bear = new Song("Bear", "https://youtu.be/N_ox_QcxP7E", "3:10", hospice);
		songRepo.save(bear);
		hospice.addSong(bear);
		
		Song thirteen = new Song("Thirteen", "https://youtu.be/HQ1G4VPEL5k", "6:04", hospice);
		songRepo.save(thirteen);
		hospice.addSong(thirteen);
		
		Song two = new Song("Two", "https://youtu.be/i-BFLjyIb04", "3:48", hospice);
		songRepo.save(two);
		hospice.addSong(two);
		
		Song shiva = new Song("Shiva", "https://youtu.be/mF2Y-BnqGys", "8:38", hospice);
		songRepo.save(shiva);
		hospice.addSong(shiva);
		
		Song wake = new Song("Wake", "https://youtu.be/7fpI2PPRAM4", "5:12", hospice);
		songRepo.save(wake);
		hospice.addSong(wake);
		
		Song epilogue = new Song("Epilogue", "https://youtu.be/bQwkbRVqqxU", "1:12", hospice);
		songRepo.save(epilogue);
		hospice.addSong(epilogue);
			
	}
}
