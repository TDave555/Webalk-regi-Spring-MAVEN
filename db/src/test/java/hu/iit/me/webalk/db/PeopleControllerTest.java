package hu.iit.me.webalk.db;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import hu.iit.me.webalk.db.repository.PeopleRepository;
import hu.iit.me.webalk.db.repository.PeopleModel;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest
@AutoConfigureMockMvc
//@Transactional
class PeopleControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private PeopleRepository peopleRepository;
	
	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/"))
			.andDo(print())
			.andExpect(status().is4xxClientError());
	}

	@Test
	public void shouldReturnProples() throws Exception {
		// GIVEN
		PeopleModel people = new PeopleModel(1L, 12, "1");
		
		Iterable<PeopleModel> all = peopleRepository.findAll();
		peopleRepository.save(people);
		
		// WHEN THEN
		this.mockMvc.perform(get("/people"))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.[0].name", is("1")))
			.andExpect(jsonPath("$.[0].age", is(12)))
			.andExpect(jsonPath("$.[0].id", is(1)));
	}
	
	@Test
	public void shouldReturnProples2() throws Exception {
		// GIVEN
		PeopleModel people = new PeopleModel(2L, 22, "2");
		
		Iterable<PeopleModel> all = peopleRepository.findAll();
		peopleRepository.save(people);
		
		// WHEN THEN
		this.mockMvc.perform(get("/people"))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.[1].name", is("2")))
			.andExpect(jsonPath("$.[1].age", is(22)))
			.andExpect(jsonPath("$.[1].id", is(2)));
	}
	
}
