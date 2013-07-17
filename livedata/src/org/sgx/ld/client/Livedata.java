package org.sgx.ld.client;

import org.sgx.ld.client.states.LDStateManager;
import org.sgx.ld.client.ui.main.LDLayout;
import org.sgx.ld.client.ui.views.FreeTemplateEditor;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;

public class Livedata implements EntryPoint {

	public void onModuleLoad() {
		LDMain main = LDMain.getInstance(); 
		
		LDStateManager stateManager = new LDStateManager(); 
		main.setStateManager(stateManager);
		
		LDLayout layout = new LDLayout(); 
		main.setLayout(layout);
		
		Document.get().getBody().appendChild(LDMain.layout().getElement()); 
		

		Document.get().getBody().appendChild(new FreeTemplateEditor().getElement());
	}

}
