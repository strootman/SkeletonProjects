package com.gwt.skeleton.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.PlainTabPanel;
import com.sencha.gxt.widget.core.client.TabItemConfig;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.SimpleContainer;
import com.sencha.gxt.widget.core.client.menu.Menu;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Skeleton implements EntryPoint {

    /**
     * This is the entry point method.
     */
    @Override
    public void onModuleLoad() {

        Menu menu = new Menu();
        menu.setBorders(true);
        menu.add(new Label("Menu Item 1"));
        menu.add(new Label("Menu Item 2"));
        menu.add(new Label("Menu Item 3"));


        TextButton menuButton = new TextButton("Menu");
        menuButton.setMenu(menu);


        
        
        
        RootPanel.get("menu").add(menuButton);
        // RootPanel.get("menu").add(ret);

        SimpleContainer sc = new SimpleContainer();
        sc.setHeight("1");
        PlainTabPanel appTabPanel = new PlainTabPanel();

        final Label widget = new Label("Tab 1");
        widget.addStyleName("pad-text");
        ContentPanel vlc = new ContentPanel();
        vlc.add(widget);
        appTabPanel.add(vlc, new TabItemConfig("Tab 1"));
        appTabPanel.add(new Label("Tab 2"), new TabItemConfig("Tab 2"));

        sc.add(appTabPanel);
        RootPanel.get("app").add(sc);
    }

}
