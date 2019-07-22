package wcci.stonkifybackend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import wcci.stonkifybackend.entities.Artist;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Long>{

	Artist findByName(String artistName);

	boolean existsByName(String artistName);

}
