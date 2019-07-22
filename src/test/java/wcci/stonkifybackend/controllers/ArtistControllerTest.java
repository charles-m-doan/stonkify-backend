package wcci.stonkifybackend.controllers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import wcci.stonkifybackend.entities.Artist;
import wcci.stonkifybackend.repositories.ArtistRepository;

public class ArtistControllerTest {

	@InjectMocks
	private ArtistController underTest;
	@Mock
	private ArtistRepository artistRepo;
	@Mock
	private Artist mockArtist;

	@Before
	public void setup()
		{
		MockitoAnnotations.initMocks(this);
		}

	@Test
	public void shouldReturnListOfArtists()
		{
		when(artistRepo.findAll()).thenReturn(Collections.singletonList(mockArtist));
		assertThat(underTest.sendArtists(), contains(mockArtist));
		}

	@Test
	public void shouldReturnAnArtist()
		{
		when(artistRepo.findById(1L)).thenReturn(Optional.of(mockArtist));
		assertThat(underTest.sendArtist(1L), is(mockArtist));
		}

}
