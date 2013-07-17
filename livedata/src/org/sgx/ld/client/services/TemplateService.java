package org.sgx.ld.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("template")
public interface TemplateService extends RemoteService {
	String greetServer(String name) throws IllegalArgumentException;
}
