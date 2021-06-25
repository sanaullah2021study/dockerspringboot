package com.sana.dockerspringboot;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.annotation.PathVariable;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@WebMvcTest()
@Log4j2
class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    @DisplayName("Hello Test")
    public void helloTest() throws Exception {
        final String uri = "/Palash";

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(uri);

        MvcResult mvcResult = mvc.perform(requestBuilder).andExpect(status().isOk()).andReturn();

        log.info("=========================================================");
        log.info(mvcResult.getResponse().getContentAsString());
        log.info("=========================================================");
        assertEquals("Hello Palash", mvcResult.getResponse().getContentAsString());

    }
}