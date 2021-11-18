package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class JenkinsDemoApplicationTests {
	
	@Autowired
	private MockMvc mvc;

	@Test
	void add() throws Exception {
		
		mvc.perform(get("/add")).andExpect(status().isOk());
		
	}
	@Test
	void sub() throws Exception {
		
		mvc.perform(get("/sub")).andExpect(status().isOk());
		
	}
	@Test
	void mul() throws Exception {
		
		mvc.perform(get("/mul")).andExpect(status().isOk());
		
	}
	@Test
	void div() throws Exception {
		
		mvc.perform(get("/div")).andExpect(status().isOk());
		
	}
	
	
}
