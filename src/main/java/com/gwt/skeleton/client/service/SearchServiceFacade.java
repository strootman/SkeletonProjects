package com.gwt.skeleton.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

import com.gwt.skeleton.client.view.model.DataSearchFilter;

public interface SearchServiceFacade {

    void saveFilter(DataSearchFilter filter, AsyncCallback<String> callback);

    /**
     * Submits a search query build from the given filter.
     * 
     * @param filter
     * @param callback
     */
    void submitSearchFromFilter(DataSearchFilter filter, AsyncCallback<String> callback);

}
