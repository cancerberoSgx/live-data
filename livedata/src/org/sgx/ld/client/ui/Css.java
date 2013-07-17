package org.sgx.ld.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.UIObject;

public class Css extends UIObject {

	private static CssUiBinder uiBinder = GWT.create(CssUiBinder.class);

	interface CssUiBinder extends UiBinder<Element, Css> {
	}

	public Css() {
		setElement(uiBinder.createAndBindUi(this));
	}

}
