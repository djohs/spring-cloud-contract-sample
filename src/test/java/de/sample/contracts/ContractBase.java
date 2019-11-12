package de.sample.contracts;

import de.sample.SampleApplication;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest(classes = SampleApplication.class)
@ActiveProfiles("local")
@RunWith(SpringRunner.class)
public class ContractBase {

    @Autowired
    private WebApplicationContext context;

    @Before
    public void setUp() {
        RestAssuredMockMvc.webAppContextSetup(context);

    }

}
