package com.mamta.sl.client.utils;

import elemental2.dom.DomGlobal;

public class WebUtils {

	private WebUtils() {
		throw new AssertionError();
	}

	public static String getWebAppUrl() {

		String webAppUrl = getHost();

		String path = DomGlobal.window.location.getPathname();
		int index = path.lastIndexOf('/');

		if (index != -1) {

			if (path.length() == index + 1) {
				return webAppUrl + path;
			}
			return webAppUrl + path.substring(0, index + 1);

		}

		return webAppUrl + '/';
	}

	public static String getHost() {

		String protocol = DomGlobal.window.location.getProtocol();
		String port = DomGlobal.window.location.getPort();
		String host = DomGlobal.window.location.getHostname();

		String portElement = port.length() > 0 ? ':' + port : "";
		return protocol + "//" + host + portElement;
	}

}
