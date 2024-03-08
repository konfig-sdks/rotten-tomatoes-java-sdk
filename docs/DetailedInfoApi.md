# DetailedInfoApi

All URIs are relative to *http://api.rottentomatoes.com/api/public/v1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findSimilarMovies**](DetailedInfoApi.md#findSimilarMovies) | **GET** /movies/{id}/similar.json |  |
| [**getClipById**](DetailedInfoApi.md#getClipById) | **GET** /movies/{id}/clips.json |  |
| [**getMovieAliasInfo**](DetailedInfoApi.md#getMovieAliasInfo) | **GET** /movie_alias.json |  |
| [**getMovieByIdJson**](DetailedInfoApi.md#getMovieByIdJson) | **GET** /movies/{id}.json |  |
| [**getMovieCast**](DetailedInfoApi.md#getMovieCast) | **GET** /movies/{id}/cast.json |  |
| [**getMovieReviews**](DetailedInfoApi.md#getMovieReviews) | **GET** /movies/{id}/reviews.json |  |


<a name="findSimilarMovies"></a>
# **findSimilarMovies**
> findSimilarMovies(id).limit(limit).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RottenTomatoes;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DetailedInfoApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
    
    configuration.key  = "YOUR API KEY";
    RottenTomatoes client = new RottenTomatoes(configuration);
    String id = "770672122"; // Movie ID. You can use the movies search endpoint or peruse the lists of movies/dvds to get the Movie ID
    String limit = "5"; // Limit the number of similar movies to show
    try {
      client
              .detailedInfo
              .findSimilarMovies(id)
              .limit(limit)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DetailedInfoApi#findSimilarMovies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .detailedInfo
              .findSimilarMovies(id)
              .limit(limit)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DetailedInfoApi#findSimilarMovies");
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
| **id** | **String**| Movie ID. You can use the movies search endpoint or peruse the lists of movies/dvds to get the Movie ID | [default to 770672122] |
| **limit** | **String**| Limit the number of similar movies to show | [optional] [default to 5] |

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

<a name="getClipById"></a>
# **getClipById**
> getClipById(id).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RottenTomatoes;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DetailedInfoApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
    
    configuration.key  = "YOUR API KEY";
    RottenTomatoes client = new RottenTomatoes(configuration);
    String id = "770672122"; // Movie ID. You can use the movies search endpoint or peruse the lists of movies/dvds to get the Movie ID
    try {
      client
              .detailedInfo
              .getClipById(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DetailedInfoApi#getClipById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .detailedInfo
              .getClipById(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DetailedInfoApi#getClipById");
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
| **id** | **String**| Movie ID. You can use the movies search endpoint or peruse the lists of movies/dvds to get the Movie ID | [default to 770672122] |

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

<a name="getMovieAliasInfo"></a>
# **getMovieAliasInfo**
> getMovieAliasInfo().id(id).type(type).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RottenTomatoes;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DetailedInfoApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
    
    configuration.key  = "YOUR API KEY";
    RottenTomatoes client = new RottenTomatoes(configuration);
    String id = "0031381"; // Movie ID. You can use the movies search endpoint or peruse the lists of movies/dvds to get the Movie ID
    String type = "imdb"; // Only supports imdb lookup at this time
    try {
      client
              .detailedInfo
              .getMovieAliasInfo()
              .id(id)
              .type(type)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DetailedInfoApi#getMovieAliasInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .detailedInfo
              .getMovieAliasInfo()
              .id(id)
              .type(type)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DetailedInfoApi#getMovieAliasInfo");
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
| **id** | **String**| Movie ID. You can use the movies search endpoint or peruse the lists of movies/dvds to get the Movie ID | [optional] [default to 0031381] |
| **type** | **String**| Only supports imdb lookup at this time | [optional] [default to imdb] |

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

<a name="getMovieByIdJson"></a>
# **getMovieByIdJson**
> getMovieByIdJson(id).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RottenTomatoes;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DetailedInfoApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
    
    configuration.key  = "YOUR API KEY";
    RottenTomatoes client = new RottenTomatoes(configuration);
    String id = "770672122"; // Movie ID. You can use the movies search endpoint or peruse the lists of movies/dvds to get the Movie ID
    try {
      client
              .detailedInfo
              .getMovieByIdJson(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DetailedInfoApi#getMovieByIdJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .detailedInfo
              .getMovieByIdJson(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DetailedInfoApi#getMovieByIdJson");
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
| **id** | **String**| Movie ID. You can use the movies search endpoint or peruse the lists of movies/dvds to get the Movie ID | [default to 770672122] |

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

<a name="getMovieCast"></a>
# **getMovieCast**
> getMovieCast(id).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RottenTomatoes;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DetailedInfoApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
    
    configuration.key  = "YOUR API KEY";
    RottenTomatoes client = new RottenTomatoes(configuration);
    String id = "770672122"; // Movie ID. You can use the movies search endpoint or peruse the lists of movies/dvds to get the Movie ID
    try {
      client
              .detailedInfo
              .getMovieCast(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DetailedInfoApi#getMovieCast");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .detailedInfo
              .getMovieCast(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DetailedInfoApi#getMovieCast");
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
| **id** | **String**| Movie ID. You can use the movies search endpoint or peruse the lists of movies/dvds to get the Movie ID | [default to 770672122] |

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

<a name="getMovieReviews"></a>
# **getMovieReviews**
> getMovieReviews(id).reviewType(reviewType).pageLimit(pageLimit).page(page).country(country).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RottenTomatoes;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DetailedInfoApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
    
    configuration.key  = "YOUR API KEY";
    RottenTomatoes client = new RottenTomatoes(configuration);
    String id = "770672122"; // Movie ID. You can use the movies search endpoint or peruse the lists of movies/dvds to get the Movie ID
    String reviewType = "top_critic"; // 3 different review types are possible: 'all', 'top_critic' and 'dvd'. 'top_critic' shows all the Rotten Tomatoes designated top critics. 'dvd' pulls the reviews given on the DVD of the movie. 'all' as the name implies retrieves all reviews.
    String pageLimit = "20"; // The number of reviews to show per page
    String page = "1"; // The selected page of reviews
    String country = "us"; // Provides localized data for the selected country (ISO 3166-1 alpha-2) if available. Otherwise, returns US data.
    try {
      client
              .detailedInfo
              .getMovieReviews(id)
              .reviewType(reviewType)
              .pageLimit(pageLimit)
              .page(page)
              .country(country)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DetailedInfoApi#getMovieReviews");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .detailedInfo
              .getMovieReviews(id)
              .reviewType(reviewType)
              .pageLimit(pageLimit)
              .page(page)
              .country(country)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DetailedInfoApi#getMovieReviews");
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
| **id** | **String**| Movie ID. You can use the movies search endpoint or peruse the lists of movies/dvds to get the Movie ID | [default to 770672122] |
| **reviewType** | **String**| 3 different review types are possible: &#39;all&#39;, &#39;top_critic&#39; and &#39;dvd&#39;. &#39;top_critic&#39; shows all the Rotten Tomatoes designated top critics. &#39;dvd&#39; pulls the reviews given on the DVD of the movie. &#39;all&#39; as the name implies retrieves all reviews. | [optional] [default to top_critic] |
| **pageLimit** | **String**| The number of reviews to show per page | [optional] [default to 20] |
| **page** | **String**| The selected page of reviews | [optional] [default to 1] |
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

