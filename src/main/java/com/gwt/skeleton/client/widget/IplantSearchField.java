package com.gwt.skeleton.client.widget;

import com.google.gwt.event.shared.HandlerRegistration;

import com.sencha.gxt.widget.core.client.event.CollapseEvent;
import com.sencha.gxt.widget.core.client.event.CollapseEvent.CollapseHandler;
import com.sencha.gxt.widget.core.client.event.CollapseEvent.HasCollapseHandlers;
import com.sencha.gxt.widget.core.client.event.ExpandEvent;
import com.sencha.gxt.widget.core.client.event.ExpandEvent.ExpandHandler;
import com.sencha.gxt.widget.core.client.event.ExpandEvent.HasExpandHandlers;
import com.sencha.gxt.widget.core.client.event.ParseErrorEvent;
import com.sencha.gxt.widget.core.client.form.DateField;
import com.sencha.gxt.widget.core.client.form.PropertyEditor;
import com.sencha.gxt.widget.core.client.form.TriggerField;

/**
 * This class is a clone-and-own of {@link DateField}.
 * 
 * @author jstroot
 * 
 */
public class IplantSearchField extends TriggerField<String> implements HasExpandHandlers, HasCollapseHandlers {

    /**
     * Creates a new iPlant Search field.
     */
    public IplantSearchField() {
        this(new IplantSearchCell());
    }

    /**
     * Creates a new iPlant Search field.
     * 
     * @param cell the search cell
     */
    public IplantSearchField(IplantSearchCell cell) {
        this(cell, null);
    }

    /**
     * Creates a new iPlant Search field.
     * 
     * @param cell the search cell
     * @param propertyEditor the property editor
     */
    public IplantSearchField(IplantSearchCell cell, PropertyEditor<String> propertyEditor) {
        super(cell);
        setPropertyEditor(propertyEditor);
        redraw();
    }

    @Override
    public IplantSearchCell getCell() {
        return (IplantSearchCell)super.getCell();
    }


    protected void expand() {
        getCell().expand(createContext(), getElement(), getValue(), valueUpdater);
    }

    @Override
    protected void onCellParseError(ParseErrorEvent event) {
        super.onCellParseError(event);
        /*String value = event.getException().getMessage();
        String f = getPropertyEditor().getFormat().getPattern();
        String msg = DefaultMessages.getMessages().dateField_invalidText(value, f);
        parseError = msg;*/
        // TODO Update parse error message
        String msg = "Default message";
        forceInvalid(msg);
    }

    @Override
    public HandlerRegistration addExpandHandler(ExpandHandler handler) {
        return addHandler(handler, ExpandEvent.getType());
    }

    @Override
    public HandlerRegistration addCollapseHandler(CollapseHandler handler) {
        return addHandler(handler, CollapseEvent.getType());
    }

}
