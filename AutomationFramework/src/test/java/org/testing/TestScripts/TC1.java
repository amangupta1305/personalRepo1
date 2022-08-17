package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPSmethod;
import org.testing.utilities.JsonFileLoad;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.PropertiesFileLoad;

import io.restassured.response.Response;

public class TC1 {

	public static void main(String[] args) throws IOException {
		
		Properties pr=PropertiesFileLoad.loadproperties("../AutomationFramework/URI.properties");
		String data=JsonFileLoad.LoadJson("../AutomationFramework/src/test/java/org/testing/resources/BodyData.json");
		HTTPSmethod http= new HTTPSmethod(pr);
		http.Postrequest(data, "QA_URI_SeleniumBatch");
		
		LogsCapture.takelog("TC1","status code is 201");
	}
}
