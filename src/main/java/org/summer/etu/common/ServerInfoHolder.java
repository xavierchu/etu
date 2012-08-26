package org.summer.etu.common;

public class ServerInfoHolder {

	private static String startTime;
	
	public static String getStartTime() {
		return startTime;
	}

	public static void setStartTime(String startTime) {
		ServerInfoHolder.startTime = startTime;
	}

	private ServerInfoHolder() {
		
	}
	
}
