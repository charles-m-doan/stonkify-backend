package wcci.stonkifybackend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import wcci.stonkifybackend.entities.Song;

@Repository
public interface SongRepository extends CrudRepository<Song, Long> {

	Song findByTitle(String songTitle);

}
