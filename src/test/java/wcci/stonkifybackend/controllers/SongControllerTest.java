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

import wcci.stonkifybackend.entities.Song;
import wcci.stonkifybackend.repositories.SongRepository;

public class SongControllerTest {

	@InjectMocks
	private SongController underTest;
	@Mock
	private SongRepository songRepo;
	@Mock
	private Song mockSong;

	@Before
	public void setup()
		{
		MockitoAnnotations.initMocks(this);
		}

	@Test
	public void shouldReturnListOfSongs()
		{
		when(songRepo.findAll()).thenReturn(Collections.singletonList(mockSong));
		assertThat(underTest.sendSongs(), contains(mockSong));
		}

	@Test
	public void shouldReturnAnSong()
		{
		when(songRepo.findById(1L)).thenReturn(Optional.of(mockSong));
		assertThat(underTest.sendSong(1L), is(mockSong));
		}

}
