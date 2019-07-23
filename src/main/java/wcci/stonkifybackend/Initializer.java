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
	}
}
