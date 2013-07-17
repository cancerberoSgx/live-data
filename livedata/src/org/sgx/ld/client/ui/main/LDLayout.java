package org.sgx.ld.client.ui.main;

import org.sgx.jsutil.client.DOMUtil;
import org.sgx.ld.client.LDMain;
import org.sgx.ld.client.states.LDStateManager;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.UIObject;

public class LDLayout extends UIObject {

	private static MainUiBinder uiBinder = GWT.create(MainUiBinder.class);

	interface MainUiBinder extends UiBinder<Element, LDLayout> {
	}

	@UiField Element main, freeTemplateEditor; 
	
	public LDLayout() {
		setElement(uiBinder.createAndBindUi(this));
	}
	
	public void setView(UIObject view) {
		//TODO: hide current
		main.appendChild(view.getElement()); 
		
		DOMUtil.addClickHandler(freeTemplateEditor, new DOMUtil.EventHandler() {			
			@Override
			public void onEvent(Event event) {
System.out.println("hello");
				LDMain.states().navigate(LDStateManager.STATE_FREEEDITOR, ""); 
			}
		});
	}

}
