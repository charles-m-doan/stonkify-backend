package wcci.stonkifybackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wcci.stonkifybackend.entities.Song;
import wcci.stonkifybackend.repositories.SongRepository;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class SongController {

	@Autowired
	SongRepository songRepo;

	@GetMapping("/songs")
	public Iterable<Song> sendSongs()
		{
		return songRepo.findAll();
		}

	@GetMapping("/songs/{id}")
	public Song sendSong(@PathVariable Long id)
		{
		return songRepo.findById(id).get();
		}

}
