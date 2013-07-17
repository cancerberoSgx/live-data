package org.sgx.ld.client.model;

import java.io.Serializable;

import org.sgx.jsutil.client.JsObject;

import com.google.appengine.api.datastore.GeoPt;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.rpc.IsSerializable;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
/**
 * 
 * @author sg
 * 
 */
@Entity
//@Cache
public class Structure implements Serializable, IsSerializable {
@Id Long id; 
String name;
String description; 
String ownerId;

String indexId; 

//Key<WebSite> webSite; 
///**
// * owner channel of this places
// */
/*@Parent*/
//Key<Channel> channel;

public JavaScriptObject toJSO() {
	return JsObject.one("name", getName())._("description", getDescription()); 
}

public String getOwnerId() {
	return ownerId;
}

public void setOwnerId(String ownerId) {
	this.ownerId = ownerId;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
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

public String getIndexId() {
	return indexId;
}

public void setIndexId(String indexId) {
	this.indexId = indexId;
}
}
