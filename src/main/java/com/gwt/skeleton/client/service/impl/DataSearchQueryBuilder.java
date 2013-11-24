package com.gwt.skeleton.client.service.impl;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

import com.gwt.skeleton.client.view.model.DataSearchFilter;

/**
 * # Currently working on assumption that the full query can have a field term shown twice.
 * 
 * # Question for tony: What does the query string look like when designating multiple fields?
 * # Question for tony: Is there a "sharedWith" key in the file and/or folder records?
 * 
 * @author jstroot
 * 
 */
public class DataSearchQueryBuilder {

    private final DataSearchFilter dsf;
    private final StringBuilder sb;

    public DataSearchQueryBuilder(DataSearchFilter dsf) {

        this.dsf = dsf;
        sb = new StringBuilder();
    }

    public String buildFullQuery() {
        createdBy().createdWithin().file().fileSizeRange().metadata().modifiedWithin().negatedFile().negatedMetadata().sharedWith();
        return toString();
    }


    public DataSearchQueryBuilder createdBy() {
        String queryContent = dsf.getCreatedBy();
        sb.append(createQuery("creator.username:", queryContent));
        return this;
    }

    public DataSearchQueryBuilder createdWithin() {
        String query = createQuery("dataCreated:", "");
        sb.append(query);
        return this;
    }

    public DataSearchQueryBuilder file() {
        String content = dsf.getFileQuery();
        sb.append(createQuery("label:", content));
        return this;
    }

    public DataSearchQueryBuilder fileSizeRange() {
        String content = "[" + dsf.getFileSizeRange().getMin() + " TO " + dsf.getFileSizeRange().getMax() + "]";
        sb.append(createQuery("fileSize:", content));
        return this;
    }

    /**
     * @return the currently constructed query.
     */
    public String getQuery() {
        return toString();
    }

    public DataSearchQueryBuilder metadata() {
        String content = dsf.getMetadataQuery();
        // Search metadata.attribute, metadata.value, and metadata.unit for the given query
        sb.append(createQuery("metadata.\\*", content));
        return this;
    }

    public DataSearchQueryBuilder modifiedWithin() {
        String content = "";
        sb.append(createQuery("dataModified:", content));
        return this;
    }

    public DataSearchQueryBuilder negatedFile() {
        // Split the query and reassemble with a "-" slapped onto the front.
        Iterable<String> split = Splitter.on(" ").split(dsf.getNegatedFileQuery());
        String content = Joiner.on(" -").join(split);
        sb.append(createQuery("label:", content));
        return this;
    }

    public DataSearchQueryBuilder negatedMetadata() {
        // Split the query and reassemble with a "-" slapped onto the front.
        Iterable<String> split = Splitter.on(" ").split(dsf.getNegatedMetadataQuery());
        String content = Joiner.on(" -").join(split);
        // Search metadata.attribute, metadata.value, and metadata.unit for the given query
        sb.append(createQuery("metadata.\\*:", content));
        return this;
    }

    public DataSearchQueryBuilder sharedWith() {
        String content = dsf.getSharedWith();
        sb.append(createQuery("", content));
        return this;
    }

    /**
     * @return the currently constructed query.
     */
    @Override
    public String toString() {
        return sb.toString();
    }

    private String createQuery(String queryField, String queryContent) {
        String query = queryField + queryContent;
        return query;
    }
}
