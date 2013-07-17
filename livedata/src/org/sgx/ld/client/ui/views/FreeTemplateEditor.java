package org.sgx.ld.client.ui.views;

//import org.sgx.gwtbootstrap.client.Bootstrap;
import org.sgx.gwtbootstrap.client.Bootstrap;
import org.sgx.gwtsizzle.client.Sizzle;
import org.sgx.jsutil.client.DOMUtil;
import org.sgx.underscoregwt.client.CompiledTemplate;
import org.sgx.underscoregwt.client._;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TextAreaElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.UIObject;

public class FreeTemplateEditor extends UIObject {

	private static FreeCompilerUiBinder uiBinder = GWT.create(FreeCompilerUiBinder.class);

	interface FreeCompilerUiBinder extends UiBinder<Element, FreeTemplateEditor> {
	}

	@UiField Element doit; 
	@UiField TextAreaElement templateCode, dataCode, outputCode;
	private Element modal; 
	public FreeTemplateEditor() {
		setElement(uiBinder.createAndBindUi(this));
		
		DOMUtil.addClickHandler(doit, new DOMUtil.EventHandler() {			
			@Override
			public void onEvent(Event event) {
				doIt();
			}
		});
		
//		modal = Sizzle.sizzleCol(".modal", getElement()).iterator().next(); 
		modal = Sizzle.sizzleOne(".modal", getElement()); 
		
		templateCode.setValue("hello <%= name %>"); 
		dataCode.setValue("{name: 'seba'}"); 
	}
	
	protected void doIt() {
		
		Bootstrap.modal(modal, "show"); 
		
		CompiledTemplate compiled = null; 
		JavaScriptObject data = null; 
		String result=null;
		try {
			compiled=_.template(templateCode.getValue());
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		try {
//			data=JsonUtils.safeEval(dataCode.getValue());
			data=JsonUtils.unsafeEval(dataCode.getValue());
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		
		if(compiled!=null&&data!=null) try {
			result=compiled.execute(data); 
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		
		if(result!=null) {
			outputCode.setValue(result); 
		}
		
//		bootstrap
	}

}
