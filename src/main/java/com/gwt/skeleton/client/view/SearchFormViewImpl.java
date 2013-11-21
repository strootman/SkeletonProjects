package com.gwt.skeleton.client.view;

import com.google.common.collect.Lists;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Widget;

import com.sencha.gxt.data.shared.StringLabelProvider;
import com.sencha.gxt.widget.core.client.Composite;
import com.sencha.gxt.widget.core.client.form.DateField;
import com.sencha.gxt.widget.core.client.form.NumberField;
import com.sencha.gxt.widget.core.client.form.NumberPropertyEditor;
import com.sencha.gxt.widget.core.client.form.SimpleComboBox;
import com.sencha.gxt.widget.core.client.form.TextField;

import java.util.List;

public class SearchFormViewImpl extends Composite implements SearchFormView {

    private static SearchFormUiBinder uiBinder = GWT.create(SearchFormUiBinder.class);

    @UiTemplate("SearchForm.ui.xml")
    interface SearchFormUiBinder extends UiBinder<Widget, SearchFormViewImpl> {}

    @UiField
    TextField fileName;

    @UiField
    TextField fileNameNegated;

    @UiField(provided = true)
    SimpleComboBox<String> createdWithinCombo;

    @UiField
    DateField createdWithin;

    @UiField(provided = true)
    SimpleComboBox<String> modifiedWithinCombo;

    @UiField
    DateField modifiedWithin;
    
    @UiField
    TextField metadata;
    
    @UiField
    TextField metadataNegated;
    
    @UiField
    TextField createdBy;
    
    @UiField 
    TextField sharedWith;

    @UiField(provided = true)
    NumberField<Double> fileSizeGreaterThan;

    @UiField(provided = true)
    SimpleComboBox<String> greaterThanComboBox;

    @UiField(provided = true)
    NumberField<Double> fileSizeLessThan;

    @UiField(provided = true)
    SimpleComboBox<String> lessThanComboBox;

    private final List<String> fileSizeUnits = Lists.newArrayList("KB", "MB");
    private final List<String> timeIntervals = Lists.newArrayList("1 day", "3 days", "1 week", "2 weeks", "1 month", "2 months", "6 months", "1 year");

    public SearchFormViewImpl() {
        initProvidedUiFields();
        initWidget(uiBinder.createAndBindUi(this));
    }

    private void initProvidedUiFields() {
        // Data range combos
        StringLabelProvider<String> stringLabelProvider = new StringLabelProvider<String>();
        createdWithinCombo = new SimpleComboBox<String>(stringLabelProvider);
        modifiedWithinCombo = new SimpleComboBox<String>(stringLabelProvider);
        createdWithinCombo.add(timeIntervals);
        modifiedWithinCombo.add(timeIntervals);
        createdWithinCombo.setValue(timeIntervals.get(0));
        modifiedWithinCombo.setValue(timeIntervals.get(0));
        
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

}
