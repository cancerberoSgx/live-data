package org.sgx.ld.client.templ;

import com.google.gwt.core.client.JavaScriptObject;

public interface TemplateRenderer {
String render(String templ, JavaScriptObject data) throws TemplateRenderException;
}
