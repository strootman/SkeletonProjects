package com.gwt.skeleton.client.view.model;

/**
 * This object is used to collect the information required to build a search request for the endpoints
 * described <a href=
 * "https://github.com/iPlantCollaborativeOpenSource/Donkey/blob/dev/doc/endpoints/filesystem/search.md"
 * >here</a>
 * 
 * @author jstroot
 * 
 */
public interface SearchFilter {

    DateInterval getCreatedWithin();

    void setCreatedWithin(DateInterval createdWithin);

    DateInterval getModifiedWithin();

    void setModifiedWithin(DateInterval modifiedWithin);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    String getSharedWith();

    void setSharedWith();

    String getMetadataQuery();

    void setMetadataQuery(String metadataQuery);

    String getNegatedMetadataQuery();

    void setNegatedMetadataQuery(String negatedMetadataQuery);

    String getFileQuery();

    void setFileQuery(String fileQuery);

    String getNegatedFileQuery();

    void setNegatedFileQuery(String negatedFileQuery);
}
