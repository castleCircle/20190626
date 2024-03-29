package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
public class SampleControllerTest {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void deleteEvent() throws Exception{
		mockMvc.perform(get("/events/1;name=sungwon")).andDo(print()).andExpect(status().isOk()).andExpect(jsonPath("id").value(1));
	}
	
	@Test
	public void postEvent() throws Exception{
		//mockMvc.perform(post("/events1?name=sungwon")).andDo(print()).andExpect(status().isOk()).andExpect(jsonPath("name").value("sungwon"));
		//mockMvc.perform(post("/events1").param("name", "sungwon")).andDo(print()).andExpect(status().isOk()).andExpect(jsonPath("name").value("sungwon"));
		mockMvc.perform(post("/events2").param("name", "sungwon")).andDo(print()).andExpect(status().isOk()).andExpect(jsonPath("name").value("sungwon"));
	}
	
}
