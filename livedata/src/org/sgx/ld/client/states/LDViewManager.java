package org.sgx.ld.client.states;

import java.util.HashMap;
import java.util.Map;

import org.sgx.ld.client.ui.views.FreeTemplateEditor;
import org.sgx.ld.client.ui.views.HomeView;

import com.google.gwt.user.client.ui.UIObject;

/**
 * mantains a singleton dictionary for views so they don't have to be created each time. 
 * @author sg
 *
 */
public class LDViewManager {
private static LDViewManager instance;

private LDViewManager() {
	views=new HashMap<String, UIObject>(); 
}

public static LDViewManager getInstance() {
	if (instance == null)
		instance = new LDViewManager();
	return instance;
}
Map<String, UIObject> views; 
//public UIObject getView(String c) {
//	if(!views.containsKey(c))
//		views.put(c, createView(c)); 
//	return views.get(c); 
//}

public UIObject getView(String c) {
	if(!views.containsKey(c))
		views.put(c, createView(c));
	UIObject v = views.get(c); 
//	System.out.println("getView "+v+" - "+c);	
	return v; 
}
public <T extends UIObject> T getView(Class<T> c) {
	return (T) getView(c.getName()); 
//	if(!views.containsKey(c))
//		views.put(c.getName(), createView(c.getName())); 
//	UIObject view = views.get(c); 
//	return (T) view; 
}

private UIObject createView(String c) {
	UIObject view = null; 
	if(c.equals(HomeView.class.getName())) {
		view = new HomeView(); 
	}
	
	else if(c.equals(FreeTemplateEditor.class.getName())) {
		view = new FreeTemplateEditor(); 
	}
	return view; 
}
}
