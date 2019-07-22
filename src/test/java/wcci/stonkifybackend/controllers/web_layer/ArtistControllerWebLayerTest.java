package wcci.stonkifybackend.controllers.web_layer;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collections;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import wcci.stonkifybackend.controllers.ArtistController;
import wcci.stonkifybackend.entities.Artist;
import wcci.stonkifybackend.repositories.ArtistRepository;
import wcci.stonkifybackend.util.RandomEntityFactory;

@WebMvcTest(ArtistController.class)
@RunWith(SpringRunner.class)
public class ArtistControllerWebLayerTest {
	@Autowired
	MockMvc mockMvc;
	@MockBean
	ArtistRepository artistRepo;
	Artist testArtist = RandomEntityFactory.generateRandomArtist();

	@Test
	public void shouldReturnAllArtists() throws Exception
		{
		when(artistRepo.findAll()).thenReturn(Collections.singletonList(testArtist));
		mockMvc.perform(get("/api/artists")).andDo(print()).andExpect(status().isOk()).andExpect(content().contentType("application/json;charset=UTF-8")).andExpect(jsonPath("$", hasSize(1))).andExpect(jsonPath("$[0].name", is(testArtist.getName())));
		}

	@Test
	public void shouldReturnAnArtist() throws Exception
		{
		when(artistRepo.findById(1L)).thenReturn(Optional.of(testArtist));
		mockMvc.perform(get("/api/artists/1")).andExpect(status().isOk()).andExpect(content().contentType("application/json;charset=UTF-8")).andExpect(content().json("{}")).andExpect(jsonPath("$.name", is(testArtist.getName())));
		}
}
