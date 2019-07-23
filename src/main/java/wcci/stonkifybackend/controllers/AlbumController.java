package wcci.stonkifybackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wcci.stonkifybackend.entities.Album;
import wcci.stonkifybackend.repositories.AlbumRepository;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class AlbumController {

	@Autowired
	AlbumRepository albumRepo;

	@GetMapping("/albums")
	public Iterable<Album> sendAlbums()
		{
		return albumRepo.findAll();
		}

	@GetMapping("/albums/{id}")
	public Album sendAlbum(@PathVariable Long id)
		{
		return albumRepo.findById(id).get();
		}

}
