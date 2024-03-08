# SearchApi

All URIs are relative to *http://api.rottentomatoes.com/api/public/v1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**moviesJson**](SearchApi.md#moviesJson) | **GET** /movies.json |  |


<a name="moviesJson"></a>
# **moviesJson**
> moviesJson().q(q).pageLimit(pageLimit).page(page).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RottenTomatoes;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SearchApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
    
    configuration.key  = "YOUR API KEY";
    RottenTomatoes client = new RottenTomatoes(configuration);
    String q = "q_example"; // The plain text search query to search for a movie. Remember to URI encode this!
    String pageLimit = "10"; // The amount of movie search results to show per page
    String page = "1"; // The selected page of movie search results
    try {
      client
              .search
              .moviesJson()
              .q(q)
              .pageLimit(pageLimit)
              .page(page)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#moviesJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .search
              .moviesJson()
              .q(q)
              .pageLimit(pageLimit)
              .page(page)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#moviesJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **q** | **String**| The plain text search query to search for a movie. Remember to URI encode this! | [optional] |
| **pageLimit** | **String**| The amount of movie search results to show per page | [optional] [default to 10] |
| **page** | **String**| The selected page of movie search results | [optional] [default to 1] |

### Return type

null (empty response body)

### Authorization

[key](../README.md#key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |

