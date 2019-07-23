package wcci.stonkifybackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wcci.stonkifybackend.entities.Artist;
import wcci.stonkifybackend.repositories.ArtistRepository;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ArtistController {

	@Autowired
	ArtistRepository artistRepo;

	@GetMapping("/artists")
	public Iterable<Artist> sendArtists()
		{
		return artistRepo.findAll();
		}

	@GetMapping("/artists/{id}")
	public Artist sendArtist(@PathVariable Long id)
		{
		return artistRepo.findById(id).get();
		}

}
