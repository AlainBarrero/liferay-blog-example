package com.puntocoma.web.portlet;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Tutorial
 */
public class Tutorial extends MVCPortlet {
 
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		super.doView(renderRequest, renderResponse);
	}

}
