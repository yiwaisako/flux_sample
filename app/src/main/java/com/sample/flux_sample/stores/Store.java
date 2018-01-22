package com.sample.flux_sample.stores;

import com.sample.flux_sample.actions.Action;
import com.sample.flux_sample.dispatcher.Dispatcher;

/**
 * Created by yoshitoiwaisako on 2018/01/21.
 */

public abstract class Store {

    final Dispatcher dispatcher;

    protected Store(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    void emitStoreChange() {
        dispatcher.emitChange(changeEvent());
    }

    abstract StoreChangeEvent changeEvent();
    public abstract void onAction(Action action);

    public interface StoreChangeEvent {
    }
}
