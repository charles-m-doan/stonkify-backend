package wcci.stonkifybackend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import wcci.stonkifybackend.entities.Album;

@Repository
public interface AlbumRepository extends CrudRepository<Album, Long>{

	Album findByTitle(String albumTitle);

	boolean existsByTitle(String albumTitle);

}
