package com.konfigthis.client;

import com.konfigthis.client.api.DvdListsApi;
import com.konfigthis.client.api.DetailedInfoApi;
import com.konfigthis.client.api.MovieListsApi;
import com.konfigthis.client.api.SearchApi;
import com.konfigthis.client.api.TopLevelListsApi;

public class RottenTomatoes {
    private ApiClient apiClient;
    public final DvdListsApi dvdLists;
    public final DetailedInfoApi detailedInfo;
    public final MovieListsApi movieLists;
    public final SearchApi search;
    public final TopLevelListsApi topLevelLists;

    public RottenTomatoes() {
        this(null);
    }

    public RottenTomatoes(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.dvdLists = new DvdListsApi(this.apiClient);
        this.detailedInfo = new DetailedInfoApi(this.apiClient);
        this.movieLists = new MovieListsApi(this.apiClient);
        this.search = new SearchApi(this.apiClient);
        this.topLevelLists = new TopLevelListsApi(this.apiClient);
    }

}
