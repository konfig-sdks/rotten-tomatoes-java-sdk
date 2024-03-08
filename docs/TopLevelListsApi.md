# TopLevelListsApi

All URIs are relative to *http://api.rottentomatoes.com/api/public/v1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getData**](TopLevelListsApi.md#getData) | **GET** /lists.json |  |
| [**getDvds**](TopLevelListsApi.md#getDvds) | **GET** /lists/dvds.json |  |
| [**getMoviesJson**](TopLevelListsApi.md#getMoviesJson) | **GET** /lists/movies.json |  |


<a name="getData"></a>
# **getData**
> getData().execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RottenTomatoes;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopLevelListsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
    
    configuration.key  = "YOUR API KEY";
    RottenTomatoes client = new RottenTomatoes(configuration);
    try {
      client
              .topLevelLists
              .getData()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TopLevelListsApi#getData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .topLevelLists
              .getData()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TopLevelListsApi#getData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

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

<a name="getDvds"></a>
# **getDvds**
> getDvds().execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RottenTomatoes;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopLevelListsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
    
    configuration.key  = "YOUR API KEY";
    RottenTomatoes client = new RottenTomatoes(configuration);
    try {
      client
              .topLevelLists
              .getDvds()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TopLevelListsApi#getDvds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .topLevelLists
              .getDvds()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TopLevelListsApi#getDvds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

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

<a name="getMoviesJson"></a>
# **getMoviesJson**
> getMoviesJson().execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RottenTomatoes;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopLevelListsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
    
    configuration.key  = "YOUR API KEY";
    RottenTomatoes client = new RottenTomatoes(configuration);
    try {
      client
              .topLevelLists
              .getMoviesJson()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TopLevelListsApi#getMoviesJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .topLevelLists
              .getMoviesJson()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TopLevelListsApi#getMoviesJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

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

