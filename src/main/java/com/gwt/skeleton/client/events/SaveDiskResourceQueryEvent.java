package com.gwt.skeleton.client.events;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

import com.gwt.skeleton.client.events.SaveDiskResourceQueryEvent.SaveDiskResourceQueryEventHandler;
import com.gwt.skeleton.client.view.model.DiskResourceQueryTemplate;

public class SaveDiskResourceQueryEvent extends GwtEvent<SaveDiskResourceQueryEventHandler> {

    public interface SaveDiskResourceQueryEventHandler extends EventHandler {
        void doSaveDiskResourceQueryTemplate(SaveDiskResourceQueryEvent event);
    }

    public static final GwtEvent.Type<SaveDiskResourceQueryEventHandler> TYPE = new GwtEvent.Type<SaveDiskResourceQueryEventHandler>();
    private final DiskResourceQueryTemplate queryTemplate;

    public SaveDiskResourceQueryEvent(DiskResourceQueryTemplate queryTemplate) {
        this.queryTemplate = queryTemplate;
    }

    @Override
    public GwtEvent.Type<SaveDiskResourceQueryEventHandler> getAssociatedType() {
        return TYPE;
    }

    public DiskResourceQueryTemplate getQueryTemplate() {
        return queryTemplate;
    }

    @Override
    protected void dispatch(SaveDiskResourceQueryEventHandler handler) {
        handler.doSaveDiskResourceQueryTemplate(this);
    }

}
