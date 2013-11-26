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
public interface DataSearchFilter {

    /**
     * creator.username:(here is the content)
     * 
     * @return
     */
    String getCreatedBy();

    DateInterval getCreatedWithin();

    String getFileQuery();

    FileSizeRange getFileSizeRange();

    String getMetadataQuery();

    DateInterval getModifiedWithin();

    String getNegatedFileQuery();

    String getNegatedMetadataQuery();

    String getSharedWith();

    void setCreatedBy(String createdBy);

    void setCreatedWithin(DateInterval createdWithin);

    void setFileQuery(String fileQuery);

    void setFileSizeRange(FileSizeRange fileSizeRange);

    void setMetadataQuery(String metadataQuery);

    void setModifiedWithin(DateInterval modifiedWithin);

    void setNegatedFileQuery(String negatedFileQuery);

    void setNegatedMetadataQuery(String negatedMetadataQuery);

    void setSharedWith(String sharedWith);
}
