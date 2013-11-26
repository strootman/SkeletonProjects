package com.gwt.skeleton.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

import com.gwt.skeleton.client.service.impl.DataSearchQueryBuilder;
import com.gwt.skeleton.client.view.model.DiskResourceQueryTemplate;

public interface SearchServiceFacade {

    void saveFilter(DiskResourceQueryTemplate filter, AsyncCallback<String> callback);

    /**
     * Submits a search query build from the given filter.
     * 
     * Internally, this uses a {@link DataSearchQueryBuilder} to construct the query.
     * 
     * @param filter
     * @param callback
     */
    void submitSearchFromFilter(DiskResourceQueryTemplate filter, AsyncCallback<String> callback);

}
