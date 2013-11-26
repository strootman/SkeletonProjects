package com.gwt.skeleton.client.widget;

import com.google.gwt.core.client.GWT;

import com.gwt.skeleton.client.widget.IplantSearchCell.IplantSearchCellAppearance;
import com.sencha.gxt.theme.base.client.field.DateCellDefaultAppearance;
import com.sencha.gxt.theme.base.client.field.TriggerFieldDefaultAppearance;

/**
 * This class is a clone-and-own of {@link DateCellDefaultAppearance}.
 * 
 * @author jstroot
 * 
 */
public class IplantSearchCellDefaultAppearance extends TriggerFieldDefaultAppearance implements IplantSearchCellAppearance {

    public interface IplantSearchCellResources extends TriggerFieldResources {

        @Override
        @Source({"com/sencha/gxt/theme/base/client/field/ValueBaseField.css", "com/sencha/gxt/theme/base/client/field/TextField.css", "com/sencha/gxt/theme/base/client/field/TriggerField.css"})
        IplantSearchCellStyle css();
        
        // TODO Override images
        /*@ImageOptions(repeatStyle = RepeatStyle.Horizontal)
        ImageResource textBackground();

        @Source("dateArrow.png")
        ImageResource triggerArrow();

        @Source("dateArrowOver.png")
        ImageResource triggerArrowOver();

        @Source("dateArrowClick.png")
        ImageResource triggerArrowClick();

        @Source("dateArrowFocus.png")
        ImageResource triggerArrowFocus();

        ImageResource triggerArrowFocusOver();

        ImageResource triggerArrowFocusClick();*/
    }

    public interface IplantSearchCellStyle extends TriggerFieldStyle {

    }

    public IplantSearchCellDefaultAppearance() {
        this(GWT.<IplantSearchCellResources> create(IplantSearchCellResources.class));
    }

    public IplantSearchCellDefaultAppearance(IplantSearchCellResources resources) {
        super(resources);
    }

}
