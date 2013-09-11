package com.gwt.skeleton.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.gwt.skeleton.client.view.BelSample;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Skeleton implements EntryPoint {

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
        RootPanel.get("start").add(new BelSample("asdf"));
  }
}
