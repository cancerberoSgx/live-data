package org.sgx.ld.client;

import org.sgx.jsutil.client.storage.Storage;
import org.sgx.ld.client.states.LDStateManager;
import org.sgx.ld.client.states.LDViewManager;
import org.sgx.ld.client.ui.main.LDLayout;

public class LDMain {
	private static LDMain instance;

	public static LDMain getInstance() {
		if (instance == null)
			instance = new LDMain();
		return instance;
	}

	private LDMain() {
	}
		
	LDLayout layout;
	LDStateManager stateManager; 
	LDViewManager viewManager;
	Storage storage; 
	
	public static LDStateManager states() {
		return getInstance().getStateManager(); 
	}
	public static Storage storage() {
		return getInstance().getStorage();
	}
	public static LDViewManager views() {
		return getInstance().getViewManager(); 
	}
	public static LDLayout layout() {
		return getInstance().getLayout(); 
	}
	public LDStateManager getStateManager() {
		return stateManager;
	}
	public LDViewManager getViewManager() {
		return viewManager;
	}
public Storage getStorage() {
	return storage;
}
public void setStorage(Storage storage) {
	this.storage = storage;
}
	public LDLayout getLayout() {
		return layout;
	}

	public void setLayout(LDLayout layout) {
		this.layout = layout;
	}

	public void setStateManager(LDStateManager stateManager) {
		this.stateManager = stateManager;
	}

	public void setViewManager(LDViewManager viewManager) {
		this.viewManager = viewManager;
	}
	
	
}
