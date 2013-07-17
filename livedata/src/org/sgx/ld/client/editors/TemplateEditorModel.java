package org.sgx.ld.client.editors;

import org.sgx.gwteditors.client.impl1.edbean.EditableBean;

import com.google.gwt.core.shared.GWT;

public abstract class TemplateEditorModel implements EditableBean {
String name, description, data;
public static TemplateEditorModel createNew() {
	TemplateEditorModel instance = GWT.create(TemplateEditorModel.class); 
	instance.setName("some name"); 
	instance.setDescription("some description"); 
	instance.setData("some data"); 
	return instance; 
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
} 


}
