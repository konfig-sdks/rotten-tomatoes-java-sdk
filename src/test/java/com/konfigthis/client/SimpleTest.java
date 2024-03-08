package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
        
        configuration.key  = "YOUR API KEY";
        RottenTomatoes client = new RottenTomatoes(configuration);
        assertNotNull(client);
    }
}
