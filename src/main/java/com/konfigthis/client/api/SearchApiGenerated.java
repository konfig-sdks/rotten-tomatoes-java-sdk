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

public class SearchApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SearchApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call moviesJsonCall(String q, String pageLimit, String page, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/movies.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (q != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("q", q));
        }

        if (pageLimit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_limit", pageLimit));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
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
    private okhttp3.Call moviesJsonValidateBeforeCall(String q, String pageLimit, String page, final ApiCallback _callback) throws ApiException {
        return moviesJsonCall(q, pageLimit, page, _callback);

    }


    private ApiResponse<Void> moviesJsonWithHttpInfo(String q, String pageLimit, String page) throws ApiException {
        okhttp3.Call localVarCall = moviesJsonValidateBeforeCall(q, pageLimit, page, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call moviesJsonAsync(String q, String pageLimit, String page, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = moviesJsonValidateBeforeCall(q, pageLimit, page, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class MoviesJsonRequestBuilder {
        private String q;
        private String pageLimit;
        private String page;

        private MoviesJsonRequestBuilder() {
        }

        /**
         * Set q
         * @param q The plain text search query to search for a movie. Remember to URI encode this! (optional)
         * @return MoviesJsonRequestBuilder
         */
        public MoviesJsonRequestBuilder q(String q) {
            this.q = q;
            return this;
        }
        
        /**
         * Set pageLimit
         * @param pageLimit The amount of movie search results to show per page (optional, default to 10)
         * @return MoviesJsonRequestBuilder
         */
        public MoviesJsonRequestBuilder pageLimit(String pageLimit) {
            this.pageLimit = pageLimit;
            return this;
        }
        
        /**
         * Set page
         * @param page The selected page of movie search results (optional, default to 1)
         * @return MoviesJsonRequestBuilder
         */
        public MoviesJsonRequestBuilder page(String page) {
            this.page = page;
            return this;
        }
        
        /**
         * Build call for moviesJson
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
            return moviesJsonCall(q, pageLimit, page, _callback);
        }


        /**
         * Execute moviesJson request
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
            moviesJsonWithHttpInfo(q, pageLimit, page);
        }

        /**
         * Execute moviesJson request with HTTP info returned
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
            return moviesJsonWithHttpInfo(q, pageLimit, page);
        }

        /**
         * Execute moviesJson request (asynchronously)
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
            return moviesJsonAsync(q, pageLimit, page, _callback);
        }
    }

    /**
     * 
     * 
     * @return MoviesJsonRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public MoviesJsonRequestBuilder moviesJson() throws IllegalArgumentException {
        return new MoviesJsonRequestBuilder();
    }
}
