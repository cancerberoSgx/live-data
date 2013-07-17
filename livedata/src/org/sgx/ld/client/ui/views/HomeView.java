package org.sgx.ld.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.UIObject;

public class HomeView extends UIObject {

	private static HomeViewUiBinder uiBinder = GWT.create(HomeViewUiBinder.class);

	interface HomeViewUiBinder extends UiBinder<Element, HomeView> {
	}

	public HomeView() {
		setElement(uiBinder.createAndBindUi(this));
	}

}
