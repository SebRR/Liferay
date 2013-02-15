package com.test;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.vaadin.Application;
import com.vaadin.terminal.gwt.server.PortletRequestListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public class WelcomePortletApplication extends Application implements PortletRequestListener {

	private User user;
	
    public void init() {
        Window window = new Window("Vaadin Portlet Application");
        setMainWindow(window);
        window.addComponent(new Label("Hello Vaadin user "+user.getFullName()));
    }

	@Override
	public void onRequestStart(PortletRequest request, PortletResponse response) {

		 final ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		 user =  themeDisplay.getUser();
	}

	@Override
	public void onRequestEnd(PortletRequest request, PortletResponse response) {
		// TODO Auto-generated method stub
		
	}

}
