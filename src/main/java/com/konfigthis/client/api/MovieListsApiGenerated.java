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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class MovieListsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MovieListsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public MovieListsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getKey() == null) {
            throw new IllegalArgumentException("\"apikey\" is required but no API key was provided. Please set \"apikey\" with ApiClient#setKey(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getBoxOfficeJsonCall(String limit, String country, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/lists/movies/box_office.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (country != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("country", country));
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBoxOfficeJsonValidateBeforeCall(String limit, String country, final ApiCallback _callback) throws ApiException {
        return getBoxOfficeJsonCall(limit, country, _callback);

    }


    private ApiResponse<Void> getBoxOfficeJsonWithHttpInfo(String limit, String country) throws ApiException {
        okhttp3.Call localVarCall = getBoxOfficeJsonValidateBeforeCall(limit, country, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call getBoxOfficeJsonAsync(String limit, String country, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBoxOfficeJsonValidateBeforeCall(limit, country, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class GetBoxOfficeJsonRequestBuilder {
        private String limit;
        private String country;

        private GetBoxOfficeJsonRequestBuilder() {
        }

        /**
         * Set limit
         * @param limit Limits the number of movies returned (optional, default to 16)
         * @return GetBoxOfficeJsonRequestBuilder
         */
        public GetBoxOfficeJsonRequestBuilder limit(String limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set country
         * @param country Provides localized data for the selected country (ISO 3166-1 alpha-2) if available. Otherwise, returns US data. (optional, default to us)
         * @return GetBoxOfficeJsonRequestBuilder
         */
        public GetBoxOfficeJsonRequestBuilder country(String country) {
            this.country = country;
            return this;
        }
        
        /**
         * Build call for getBoxOfficeJson
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getBoxOfficeJsonCall(limit, country, _callback);
        }


        /**
         * Execute getBoxOfficeJson request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            getBoxOfficeJsonWithHttpInfo(limit, country);
        }

        /**
         * Execute getBoxOfficeJson request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return getBoxOfficeJsonWithHttpInfo(limit, country);
        }

        /**
         * Execute getBoxOfficeJson request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return getBoxOfficeJsonAsync(limit, country, _callback);
        }
    }

    /**
     * 
     * 
     * @return GetBoxOfficeJsonRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public GetBoxOfficeJsonRequestBuilder getBoxOfficeJson() throws IllegalArgumentException {
        return new GetBoxOfficeJsonRequestBuilder();
    }
    private okhttp3.Call getIntheaterMoviesCall(String pageLimit, String page, String country, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/lists/movies/in_theaters.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pageLimit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_limit", pageLimit));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (country != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("country", country));
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getIntheaterMoviesValidateBeforeCall(String pageLimit, String page, String country, final ApiCallback _callback) throws ApiException {
        return getIntheaterMoviesCall(pageLimit, page, country, _callback);

    }


    private ApiResponse<Void> getIntheaterMoviesWithHttpInfo(String pageLimit, String page, String country) throws ApiException {
        okhttp3.Call localVarCall = getIntheaterMoviesValidateBeforeCall(pageLimit, page, country, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call getIntheaterMoviesAsync(String pageLimit, String page, String country, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIntheaterMoviesValidateBeforeCall(pageLimit, page, country, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class GetIntheaterMoviesRequestBuilder {
        private String pageLimit;
        private String page;
        private String country;

        private GetIntheaterMoviesRequestBuilder() {
        }

        /**
         * Set pageLimit
         * @param pageLimit The amount of movies in theaters to show per page (optional, default to 16)
         * @return GetIntheaterMoviesRequestBuilder
         */
        public GetIntheaterMoviesRequestBuilder pageLimit(String pageLimit) {
            this.pageLimit = pageLimit;
            return this;
        }
        
        /**
         * Set page
         * @param page The selected page of in theaters movies (optional, default to 1)
         * @return GetIntheaterMoviesRequestBuilder
         */
        public GetIntheaterMoviesRequestBuilder page(String page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set country
         * @param country Provides localized data for the selected country (ISO 3166-1 alpha-2) if available. Otherwise, returns US data. (optional, default to us)
         * @return GetIntheaterMoviesRequestBuilder
         */
        public GetIntheaterMoviesRequestBuilder country(String country) {
            this.country = country;
            return this;
        }
        
        /**
         * Build call for getIntheaterMovies
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getIntheaterMoviesCall(pageLimit, page, country, _callback);
        }


        /**
         * Execute getIntheaterMovies request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            getIntheaterMoviesWithHttpInfo(pageLimit, page, country);
        }

        /**
         * Execute getIntheaterMovies request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return getIntheaterMoviesWithHttpInfo(pageLimit, page, country);
        }

        /**
         * Execute getIntheaterMovies request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return getIntheaterMoviesAsync(pageLimit, page, country, _callback);
        }
    }

    /**
     * 
     * 
     * @return GetIntheaterMoviesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public GetIntheaterMoviesRequestBuilder getIntheaterMovies() throws IllegalArgumentException {
        return new GetIntheaterMoviesRequestBuilder();
    }
    private okhttp3.Call getOpeningMoviesCall(String limit, String country, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/lists/movies/opening.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (country != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("country", country));
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getOpeningMoviesValidateBeforeCall(String limit, String country, final ApiCallback _callback) throws ApiException {
        return getOpeningMoviesCall(limit, country, _callback);

    }


    private ApiResponse<Void> getOpeningMoviesWithHttpInfo(String limit, String country) throws ApiException {
        okhttp3.Call localVarCall = getOpeningMoviesValidateBeforeCall(limit, country, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call getOpeningMoviesAsync(String limit, String country, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getOpeningMoviesValidateBeforeCall(limit, country, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class GetOpeningMoviesRequestBuilder {
        private String limit;
        private String country;

        private GetOpeningMoviesRequestBuilder() {
        }

        /**
         * Set limit
         * @param limit Limits the number of opening movies returned (optional, default to 16)
         * @return GetOpeningMoviesRequestBuilder
         */
        public GetOpeningMoviesRequestBuilder limit(String limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set country
         * @param country Provides localized data for the selected country (ISO 3166-1 alpha-2) if available. Otherwise, returns US data. (optional, default to us)
         * @return GetOpeningMoviesRequestBuilder
         */
        public GetOpeningMoviesRequestBuilder country(String country) {
            this.country = country;
            return this;
        }
        
        /**
         * Build call for getOpeningMovies
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getOpeningMoviesCall(limit, country, _callback);
        }


        /**
         * Execute getOpeningMovies request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            getOpeningMoviesWithHttpInfo(limit, country);
        }

        /**
         * Execute getOpeningMovies request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return getOpeningMoviesWithHttpInfo(limit, country);
        }

        /**
         * Execute getOpeningMovies request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return getOpeningMoviesAsync(limit, country, _callback);
        }
    }

    /**
     * 
     * 
     * @return GetOpeningMoviesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public GetOpeningMoviesRequestBuilder getOpeningMovies() throws IllegalArgumentException {
        return new GetOpeningMoviesRequestBuilder();
    }
    private okhttp3.Call getUpcomingMoviesCall(String pageLimit, String page, String country, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/lists/movies/upcoming.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pageLimit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_limit", pageLimit));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (country != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("country", country));
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUpcomingMoviesValidateBeforeCall(String pageLimit, String page, String country, final ApiCallback _callback) throws ApiException {
        return getUpcomingMoviesCall(pageLimit, page, country, _callback);

    }


    private ApiResponse<Void> getUpcomingMoviesWithHttpInfo(String pageLimit, String page, String country) throws ApiException {
        okhttp3.Call localVarCall = getUpcomingMoviesValidateBeforeCall(pageLimit, page, country, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call getUpcomingMoviesAsync(String pageLimit, String page, String country, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUpcomingMoviesValidateBeforeCall(pageLimit, page, country, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class GetUpcomingMoviesRequestBuilder {
        private String pageLimit;
        private String page;
        private String country;

        private GetUpcomingMoviesRequestBuilder() {
        }

        /**
         * Set pageLimit
         * @param pageLimit The amount of upcoming movies to show per page (optional, default to 16)
         * @return GetUpcomingMoviesRequestBuilder
         */
        public GetUpcomingMoviesRequestBuilder pageLimit(String pageLimit) {
            this.pageLimit = pageLimit;
            return this;
        }
        
        /**
         * Set page
         * @param page The selected page of upcoming movies (optional, default to 1)
         * @return GetUpcomingMoviesRequestBuilder
         */
        public GetUpcomingMoviesRequestBuilder page(String page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set country
         * @param country Provides localized data for the selected country (ISO 3166-1 alpha-2) if available. Otherwise, returns US data. (optional, default to us)
         * @return GetUpcomingMoviesRequestBuilder
         */
        public GetUpcomingMoviesRequestBuilder country(String country) {
            this.country = country;
            return this;
        }
        
        /**
         * Build call for getUpcomingMovies
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getUpcomingMoviesCall(pageLimit, page, country, _callback);
        }


        /**
         * Execute getUpcomingMovies request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            getUpcomingMoviesWithHttpInfo(pageLimit, page, country);
        }

        /**
         * Execute getUpcomingMovies request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return getUpcomingMoviesWithHttpInfo(pageLimit, page, country);
        }

        /**
         * Execute getUpcomingMovies request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return getUpcomingMoviesAsync(pageLimit, page, country, _callback);
        }
    }

    /**
     * 
     * 
     * @return GetUpcomingMoviesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public GetUpcomingMoviesRequestBuilder getUpcomingMovies() throws IllegalArgumentException {
        return new GetUpcomingMoviesRequestBuilder();
    }
}
