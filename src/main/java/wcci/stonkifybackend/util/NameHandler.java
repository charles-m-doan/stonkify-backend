package wcci.stonkifybackend.util;

import wcci.stonkifybackend.entities.Album;
import wcci.stonkifybackend.entities.Artist;
import wcci.stonkifybackend.repositories.AlbumRepository;
import wcci.stonkifybackend.repositories.ArtistRepository;
import wcci.stonkifybackend.repositories.SongRepository;

public class NameHandler {

	ArtistRepository artistRepo;

	AlbumRepository albumRepo;

	SongRepository songRepo;

	public NameHandler(ArtistRepository artistRepo, AlbumRepository albumRepo, SongRepository songRepo) {
		this.artistRepo = artistRepo;
		this.albumRepo = albumRepo;
		this.songRepo = songRepo;
	}

	public Artist getArtistOfName(String artistName) {
		if (artistRepo.existsByName(artistName)) {
			return artistRepo.findByName(artistName);
		}
		Artist newArtist = new Artist(artistName);
		artistRepo.save(newArtist);
		return newArtist;
	}

	public Album getAlbumOfName(String albumTitle) {
		if (albumRepo.existsByTitle(albumTitle)) {
			return albumRepo.findByTitle(albumTitle);
		}
		Album newAlbum = new Album(albumTitle, this.getArtistOfName("unknown"));
		albumRepo.save(newAlbum);
		return newAlbum;
	}

	public Album getAlbumAndArtistOfNames(String albumTitle, String artistName) {
		if (albumRepo.existsByTitle(albumTitle)) {
			return albumRepo.findByTitle(albumTitle);
		}
		Album newAlbum = new Album(albumTitle, this.getArtistOfName(artistName));
		albumRepo.save(newAlbum);
		return newAlbum;
	}
}
