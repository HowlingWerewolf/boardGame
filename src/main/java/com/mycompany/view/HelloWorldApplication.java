package com.mycompany.view;

import org.apache.wicket.protocol.http.WebApplication;

public class HelloWorldApplication extends WebApplication {
	
    public HelloWorldApplication() {
    	// Do nothing
    }

    @Override
    public Class getHomePage() {
        return HelloWorld.class;
    }
}
