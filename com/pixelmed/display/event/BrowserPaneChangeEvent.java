/* Copyright (c) 2001-2015, David A. Clunie DBA Pixelmed Publishing. All rights reserved. */

package com.pixelmed.display.event;

import com.pixelmed.event.Event;
import com.pixelmed.event.EventContext;

/**
 * @author	dclunie
 */
public class BrowserPaneChangeEvent extends Event {

	private static final String identString = "@(#) $Header: /userland/cvs/pixelmed/imgbook/com/pixelmed/display/event/BrowserPaneChangeEvent.java,v 1.9 2015/08/26 15:44:24 dclunie Exp $";

	/***/
	public static final int IMAGE = 1;
	/***/
	public static final int DICOMDIR = 2;
	/***/
	public static final int DATABASE = 3;
	/***/
	public static final int SPECTROSCOPY = 4;
	/***/
	public static final int SR = 5;
	
	private int browserPaneType;

	/**
	 * @param	eventContext
	 * @param	browserPaneType
	 */
	public BrowserPaneChangeEvent(EventContext eventContext,int browserPaneType) {
		super(eventContext);
		this.browserPaneType=browserPaneType;
	}

	/***/
	public int getType() { return browserPaneType; }
}

