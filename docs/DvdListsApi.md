# DvdListsApi

All URIs are relative to *http://api.rottentomatoes.com/api/public/v1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCurrentReleases**](DvdListsApi.md#getCurrentReleases) | **GET** /lists/dvds/current_releases.json |  |
| [**getNewReleasesJson**](DvdListsApi.md#getNewReleasesJson) | **GET** /lists/dvds/new_releases.json |  |
| [**getTopRentalsJson**](DvdListsApi.md#getTopRentalsJson) | **GET** /lists/dvds/top_rentals.json |  |
| [**getUpcomingDvds**](DvdListsApi.md#getUpcomingDvds) | **GET** /lists/dvds/upcoming.json |  |


<a name="getCurrentReleases"></a>
# **getCurrentReleases**
> getCurrentReleases().pageLimit(pageLimit).page(page).country(country).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RottenTomatoes;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DvdListsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
    
    configuration.key  = "YOUR API KEY";
    RottenTomatoes client = new RottenTomatoes(configuration);
    String pageLimit = "16"; // The amount of new release dvds to show per page
    String page = "1"; // The selected page of current DVD releases
    String country = "us"; // Provides localized data for the selected country (ISO 3166-1 alpha-2) if available. Otherwise, returns US data.
    try {
      client
              .dvdLists
              .getCurrentReleases()
              .pageLimit(pageLimit)
              .page(page)
              .country(country)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DvdListsApi#getCurrentReleases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dvdLists
              .getCurrentReleases()
              .pageLimit(pageLimit)
              .page(page)
              .country(country)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DvdListsApi#getCurrentReleases");
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
| **pageLimit** | **String**| The amount of new release dvds to show per page | [optional] [default to 16] |
| **page** | **String**| The selected page of current DVD releases | [optional] [default to 1] |
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

<a name="getNewReleasesJson"></a>
# **getNewReleasesJson**
> getNewReleasesJson().pageLimit(pageLimit).page(page).country(country).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RottenTomatoes;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DvdListsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
    
    configuration.key  = "YOUR API KEY";
    RottenTomatoes client = new RottenTomatoes(configuration);
    String pageLimit = "16"; // The amount of new release dvds to show per page
    String page = "1"; // The selected page of new release DVDs
    String country = "us"; // Provides localized data for the selected country (ISO 3166-1 alpha-2) if available. Otherwise, returns US data.
    try {
      client
              .dvdLists
              .getNewReleasesJson()
              .pageLimit(pageLimit)
              .page(page)
              .country(country)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DvdListsApi#getNewReleasesJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dvdLists
              .getNewReleasesJson()
              .pageLimit(pageLimit)
              .page(page)
              .country(country)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DvdListsApi#getNewReleasesJson");
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
| **pageLimit** | **String**| The amount of new release dvds to show per page | [optional] [default to 16] |
| **page** | **String**| The selected page of new release DVDs | [optional] [default to 1] |
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

<a name="getTopRentalsJson"></a>
# **getTopRentalsJson**
> getTopRentalsJson().limit(limit).country(country).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RottenTomatoes;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DvdListsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
    
    configuration.key  = "YOUR API KEY";
    RottenTomatoes client = new RottenTomatoes(configuration);
    String limit = "10"; // Limits the number of top rentals returned
    String country = "us"; // Provides localized data for the selected country (ISO 3166-1 alpha-2) if available. Otherwise, returns US data.
    try {
      client
              .dvdLists
              .getTopRentalsJson()
              .limit(limit)
              .country(country)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DvdListsApi#getTopRentalsJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dvdLists
              .getTopRentalsJson()
              .limit(limit)
              .country(country)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DvdListsApi#getTopRentalsJson");
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
| **limit** | **String**| Limits the number of top rentals returned | [optional] [default to 10] |
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

<a name="getUpcomingDvds"></a>
# **getUpcomingDvds**
> getUpcomingDvds().pageLimit(pageLimit).page(page).country(country).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RottenTomatoes;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DvdListsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.rottentomatoes.com/api/public/v1.0";
    
    configuration.key  = "YOUR API KEY";
    RottenTomatoes client = new RottenTomatoes(configuration);
    String pageLimit = "16"; // The amount of upcoming dvds to show per page
    String page = "1"; // The selected page of upcoming DVDs
    String country = "us"; // Provides localized data for the selected country (ISO 3166-1 alpha-2) if available. Otherwise, returns US data.
    try {
      client
              .dvdLists
              .getUpcomingDvds()
              .pageLimit(pageLimit)
              .page(page)
              .country(country)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DvdListsApi#getUpcomingDvds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dvdLists
              .getUpcomingDvds()
              .pageLimit(pageLimit)
              .page(page)
              .country(country)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DvdListsApi#getUpcomingDvds");
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
| **pageLimit** | **String**| The amount of upcoming dvds to show per page | [optional] [default to 16] |
| **page** | **String**| The selected page of upcoming DVDs | [optional] [default to 1] |
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

