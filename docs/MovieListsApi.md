# MovieListsApi

All URIs are relative to *http://api.rottentomatoes.com/api/public/v1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBoxOfficeJson**](MovieListsApi.md#getBoxOfficeJson) | **GET** /lists/movies/box_office.json |  |
| [**getIntheaterMovies**](MovieListsApi.md#getIntheaterMovies) | **GET** /lists/movies/in_theaters.json |  |
| [**getOpeningMovies**](MovieListsApi.md#getOpeningMovies) | **GET** /lists/movies/opening.json |  |
| [**getUpcomingMovies**](MovieListsApi.md#getUpcomingMovies) | **GET** /lists/movies/upcoming.json |  |


<a name="getBoxOfficeJson"></a>
# **getBoxOfficeJson**
> getBoxOfficeJson().limit(limit).country(country).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RottenTomatoes;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MovieListsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
    
    configuration.key  = "YOUR API KEY";
    RottenTomatoes client = new RottenTomatoes(configuration);
    String limit = "16"; // Limits the number of movies returned
    String country = "us"; // Provides localized data for the selected country (ISO 3166-1 alpha-2) if available. Otherwise, returns US data.
    try {
      client
              .movieLists
              .getBoxOfficeJson()
              .limit(limit)
              .country(country)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MovieListsApi#getBoxOfficeJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .movieLists
              .getBoxOfficeJson()
              .limit(limit)
              .country(country)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MovieListsApi#getBoxOfficeJson");
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
| **limit** | **String**| Limits the number of movies returned | [optional] [default to 16] |
| **country** | **String**| Provides localized data for the selected country (ISO 3166-1 alpha-2) if available. Otherwise, returns US data. | [optional] [default to us] |

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

<a name="getIntheaterMovies"></a>
# **getIntheaterMovies**
> getIntheaterMovies().pageLimit(pageLimit).page(page).country(country).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RottenTomatoes;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MovieListsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
    
    configuration.key  = "YOUR API KEY";
    RottenTomatoes client = new RottenTomatoes(configuration);
    String pageLimit = "16"; // The amount of movies in theaters to show per page
    String page = "1"; // The selected page of in theaters movies
    String country = "us"; // Provides localized data for the selected country (ISO 3166-1 alpha-2) if available. Otherwise, returns US data.
    try {
      client
              .movieLists
              .getIntheaterMovies()
              .pageLimit(pageLimit)
              .page(page)
              .country(country)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MovieListsApi#getIntheaterMovies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .movieLists
              .getIntheaterMovies()
              .pageLimit(pageLimit)
              .page(page)
              .country(country)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MovieListsApi#getIntheaterMovies");
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
| **pageLimit** | **String**| The amount of movies in theaters to show per page | [optional] [default to 16] |
| **page** | **String**| The selected page of in theaters movies | [optional] [default to 1] |
| **country** | **String**| Provides localized data for the selected country (ISO 3166-1 alpha-2) if available. Otherwise, returns US data. | [optional] [default to us] |

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

<a name="getOpeningMovies"></a>
# **getOpeningMovies**
> getOpeningMovies().limit(limit).country(country).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RottenTomatoes;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MovieListsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
    
    configuration.key  = "YOUR API KEY";
    RottenTomatoes client = new RottenTomatoes(configuration);
    String limit = "16"; // Limits the number of opening movies returned
    String country = "us"; // Provides localized data for the selected country (ISO 3166-1 alpha-2) if available. Otherwise, returns US data.
    try {
      client
              .movieLists
              .getOpeningMovies()
              .limit(limit)
              .country(country)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MovieListsApi#getOpeningMovies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .movieLists
              .getOpeningMovies()
              .limit(limit)
              .country(country)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MovieListsApi#getOpeningMovies");
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
| **limit** | **String**| Limits the number of opening movies returned | [optional] [default to 16] |
| **country** | **String**| Provides localized data for the selected country (ISO 3166-1 alpha-2) if available. Otherwise, returns US data. | [optional] [default to us] |

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

<a name="getUpcomingMovies"></a>
# **getUpcomingMovies**
> getUpcomingMovies().pageLimit(pageLimit).page(page).country(country).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RottenTomatoes;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MovieListsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
    
    configuration.key  = "YOUR API KEY";
    RottenTomatoes client = new RottenTomatoes(configuration);
    String pageLimit = "16"; // The amount of upcoming movies to show per page
    String page = "1"; // The selected page of upcoming movies
    String country = "us"; // Provides localized data for the selected country (ISO 3166-1 alpha-2) if available. Otherwise, returns US data.
    try {
      client
              .movieLists
              .getUpcomingMovies()
              .pageLimit(pageLimit)
              .page(page)
              .country(country)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MovieListsApi#getUpcomingMovies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .movieLists
              .getUpcomingMovies()
              .pageLimit(pageLimit)
              .page(page)
              .country(country)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MovieListsApi#getUpcomingMovies");
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
| **pageLimit** | **String**| The amount of upcoming movies to show per page | [optional] [default to 16] |
| **page** | **String**| The selected page of upcoming movies | [optional] [default to 1] |
| **country** | **String**| Provides localized data for the selected country (ISO 3166-1 alpha-2) if available. Otherwise, returns US data. | [optional] [default to us] |

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

