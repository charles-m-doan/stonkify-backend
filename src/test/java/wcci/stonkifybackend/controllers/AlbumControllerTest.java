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

import wcci.stonkifybackend.entities.Album;
import wcci.stonkifybackend.repositories.AlbumRepository;

public class AlbumControllerTest {

	@InjectMocks
	private AlbumController underTest;
	@Mock
	private AlbumRepository albumRepo;
	@Mock
	private Album mockAlbum;

	@Before
	public void setup()
		{
		MockitoAnnotations.initMocks(this);
		}

	@Test
	public void shouldReturnListOfAlbums()
		{
		when(albumRepo.findAll()).thenReturn(Collections.singletonList(mockAlbum));
		assertThat(underTest.sendAlbums(), contains(mockAlbum));
		}

	@Test
	public void shouldReturnAnAlbum()
		{
		when(albumRepo.findById(1L)).thenReturn(Optional.of(mockAlbum));
		assertThat(underTest.sendAlbum(1L), is(mockAlbum));
		}

}
