package org.sgx.ld.client.templ;

import org.sgx.underscoregwt.client.CompiledTemplate;
import org.sgx.underscoregwt.client._;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * using underscoregwt _.template function
 * @author sg
 *
 */
public class TemplateRendererImpl implements TemplateRenderer {

	@Override
	public String render(String templ, JavaScriptObject data) throws TemplateRenderException {
		CompiledTemplate compiledTemplate = _.template(templ);
		return compiledTemplate.execute(data);//TODO check and throw exception
	}

}
