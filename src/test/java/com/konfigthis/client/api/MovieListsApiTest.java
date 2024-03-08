/*
 * Rotten Tomatoes
 * Test our API services using I/O Docs.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: mike.ralphson@gmail.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MovieListsApi
 */
@Disabled
public class MovieListsApiTest {

    private static MovieListsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new MovieListsApi(apiClient);
    }

    /**
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBoxOfficeJsonTest() throws ApiException {
        String limit = null;
        String country = null;
        api.getBoxOfficeJson()
                .limit(limit)
                .country(country)
                .execute();
        // TODO: test validations
    }

    /**
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getIntheaterMoviesTest() throws ApiException {
        String pageLimit = null;
        String page = null;
        String country = null;
        api.getIntheaterMovies()
                .pageLimit(pageLimit)
                .page(page)
                .country(country)
                .execute();
        // TODO: test validations
    }

    /**
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOpeningMoviesTest() throws ApiException {
        String limit = null;
        String country = null;
        api.getOpeningMovies()
                .limit(limit)
                .country(country)
                .execute();
        // TODO: test validations
    }

    /**
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUpcomingMoviesTest() throws ApiException {
        String pageLimit = null;
        String page = null;
        String country = null;
        api.getUpcomingMovies()
                .pageLimit(pageLimit)
                .page(page)
                .country(country)
                .execute();
        // TODO: test validations
    }

}