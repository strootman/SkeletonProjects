package com.gwt.skeleton.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

import com.gwt.skeleton.client.view.SearchFormViewImpl;
import com.sencha.gxt.widget.core.client.Dialog;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Skeleton implements EntryPoint {

  /**
   * This is the entry point method.
   */
  @Override
public void onModuleLoad() {
        TextButton launchSample = new TextButton("Launch sample");
        launchSample.addSelectHandler(new SelectHandler() {

            @Override
            public void onSelect(SelectEvent event) {
                Dialog dlg = new Dialog();
                dlg.setHeadingText("Sample");
                dlg.setAutoHide(false);
                dlg.setSize("400", "800");
                dlg.add(new SearchFormViewImpl());
                dlg.show();

            }
        });

        RootPanel.get("sendButtonContainer").add(launchSample);

  }
}
