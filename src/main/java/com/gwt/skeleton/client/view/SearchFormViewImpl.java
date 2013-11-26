package com.gwt.skeleton.client.view;

import com.google.common.collect.Lists;
import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.EditorDriver;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.autobean.shared.AutoBean;

import com.gwt.skeleton.client.service.SearchServiceFacade;
import com.gwt.skeleton.client.service.impl.DataSearchQueryBuilder;
import com.gwt.skeleton.client.view.model.DataSearchFilter;
import com.gwt.skeleton.client.view.model.SearchAutoBeanFactory;
import com.sencha.gxt.data.shared.StringLabelProvider;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.form.NumberField;
import com.sencha.gxt.widget.core.client.form.NumberPropertyEditor;
import com.sencha.gxt.widget.core.client.form.SimpleComboBox;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.menu.Menu;

import org.iplantc.core.uicommons.client.widgets.IPlantAnchor;

import java.util.List;

/**
 * As user makes changes to the form, a query will be built and submitted to the service. The results
 * will be used to update the form with the number of results for the current query. Will have to handle
 * ValueChanged events within the editor.
 * 
 * TODO Search form should have the ability to be shown at a position relative to a given widget
 * 
 * @author jstroot
 * 
 */
public class SearchFormViewImpl extends Menu implements Editor<DataSearchFilter>, SearchFormView {

    public final class CreateFilterClickHandler implements ClickHandler {
        private final EditorDriver<DataSearchFilter> editorDriver1;
        private final SearchServiceFacade searchService1;

        public CreateFilterClickHandler(SearchServiceFacade searchService, EditorDriver<DataSearchFilter> editorDriver) {
            this.searchService1 = searchService;
            this.editorDriver1 = editorDriver;
        }

        @Override
        public void onClick(ClickEvent event) {
            // Flush filter to perform local validations
            DataSearchFilter filterToSave = editorDriver1.flush();
            if (editorDriver1.hasErrors()) {
                return;
            }
            // Save filter
            searchService1.saveFilter(filterToSave, new AsyncCallback<String>() {
                @Override
                public void onFailure(Throwable caught) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void onSuccess(String result) {
                    // TODO Auto-generated method stub

                }

            });

        }
    }

    interface SearchFormEditorDriver extends SimpleBeanEditorDriver<DataSearchFilter, SearchFormViewImpl> {}

    @UiTemplate("SearchForm.ui.xml")
    interface SearchFormUiBinder extends UiBinder<Widget, SearchFormViewImpl> {}

    private static SearchFormUiBinder uiBinder = GWT.create(SearchFormUiBinder.class);

    private static DataSearchFilter createDefaultFilter() {
        SearchAutoBeanFactory factory = SearchAutoBeanFactory.INSTANCE;
        AutoBean<DataSearchFilter> dataSearchFilter = factory.dataSearchFilter();
        dataSearchFilter.as().setCreatedWithin(factory.dateInterval().as());
        dataSearchFilter.as().setModifiedWithin(factory.dateInterval().as());
        dataSearchFilter.as().setFileSizeRange(factory.fileSizeRange().as());

        return dataSearchFilter.as();
    }

    // TODO Any ignored field needs to be handled

    @UiField
    TextField createdBy;

    @Ignore
    @UiField(provided = true)
    SimpleComboBox<String> createdWithinCombo;

    @UiField
    TextField fileQuery;

    @Path("fileSizeRange.min")
    @UiField(provided = true)
    NumberField<Double> fileSizeGreaterThan;

    @Path("fileSizeRange.max")
    @UiField(provided = true)
    NumberField<Double> fileSizeLessThan;
    
    @Ignore
    @UiField(provided = true)
    SimpleComboBox<String> greaterThanComboBox;
    
    @Ignore
    @UiField(provided = true)
    SimpleComboBox<String> lessThanComboBox;
    
    @UiField
    TextField metadataQuery;

    @Ignore
    @UiField(provided = true)
    SimpleComboBox<String> modifiedWithinCombo;

    @UiField
    TextField negatedFileQuery;

    @UiField
    TextField negatedMetadataQuery;

    @UiField 
    TextField sharedWith;

    private final SearchFormEditorDriver editorDriver = GWT.create(SearchFormEditorDriver.class);

    private final List<String> fileSizeUnits = Lists.newArrayList("KB", "MB");

    private final SearchServiceFacade searchService;


    private final List<String> timeIntervals = Lists.newArrayList("---", "1 day", "3 days", "1 week", "2 weeks", "1 month", "2 months", "6 months", "1 year");

    /**
     * Creates the form with a new filter.
     * 
     * @param searchService
     */
    public SearchFormViewImpl(final SearchServiceFacade searchService) {
        this(searchService, createDefaultFilter());
    }

    /**
     * Creates the form populated with the given filter.
     * 
     * @param searchService
     * @param filter
     */
    public SearchFormViewImpl(final SearchServiceFacade searchService, final DataSearchFilter filter) {
        this.searchService = searchService;
        initProvidedUiFields();
        setSize("400", "800");
        add(uiBinder.createAndBindUi(this));
        plain = true;
        showSeparator = false;
        setEnableScrolling(false);
        editorDriver.initialize(this);
    }

    @UiFactory
    IPlantAnchor createAnchor() {
        IPlantAnchor anchor = new IPlantAnchor("Create filter with this search...", -1, new CreateFilterClickHandler(searchService, editorDriver));

        return anchor;
    }

    @UiHandler("searchButton")
    void onSearchBtnSelected(@SuppressWarnings("unused") SelectEvent event) {
        /*
         * # Validate filter locally
         * # Transform into query
         * # submit search
         */
        // Flush to perform local validations
        DataSearchFilter flushedFilter = editorDriver.flush();
        if (editorDriver.hasErrors()) {
            return;
        }

        // Transform into query
        String query = new DataSearchQueryBuilder(flushedFilter).buildFullQuery();

        searchService.submitSearchFromFilter(flushedFilter, new AsyncCallback<String>() {

            @Override
            public void onSuccess(String result) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onFailure(Throwable caught) {
                // TODO Auto-generated method stub

            }

        });

        /*
         * When I click this button,
         * I expect the results of the search to appear in the Data window.
         */
    }

    private void initProvidedUiFields() {
        // Data range combos
        StringLabelProvider<String> stringLabelProvider = new StringLabelProvider<String>();
        createdWithinCombo = new SimpleComboBox<String>(stringLabelProvider);
        modifiedWithinCombo = new SimpleComboBox<String>(stringLabelProvider);
        createdWithinCombo.add(timeIntervals);
        modifiedWithinCombo.add(timeIntervals);
        createdWithinCombo.setValue(timeIntervals.get(1));
        modifiedWithinCombo.setValue(timeIntervals.get(1));
        
        // File Size Number fields
        NumberPropertyEditor.DoublePropertyEditor doublePropertyEditor = new NumberPropertyEditor.DoublePropertyEditor();
        fileSizeGreaterThan = new NumberField<Double>(doublePropertyEditor);
        fileSizeLessThan = new NumberField<Double>(doublePropertyEditor);

        // File Size ComboBoxes
        greaterThanComboBox = new SimpleComboBox<String>(stringLabelProvider);
        lessThanComboBox = new SimpleComboBox<String>(stringLabelProvider);
        greaterThanComboBox.add(fileSizeUnits);
        lessThanComboBox.add(fileSizeUnits);
        greaterThanComboBox.setValue(fileSizeUnits.get(0));
        lessThanComboBox.setValue(fileSizeUnits.get(0));
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        super.show();
    }

}
