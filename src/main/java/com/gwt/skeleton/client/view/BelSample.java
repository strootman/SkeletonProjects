package com.gwt.skeleton.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class BelSample extends Composite {

    private static BelSampleUiBinder uiBinder = GWT.create(BelSampleUiBinder.class);

    interface BelSampleUiBinder extends UiBinder<Widget, BelSample> {
    }

    @UiField
    SpanElement nameSpan;

    public BelSample(String firstName) {
        initWidget(uiBinder.createAndBindUi(this));
        nameSpan.setInnerText(firstName);
    }

}
