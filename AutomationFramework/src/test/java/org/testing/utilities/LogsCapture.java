package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {

	public static void takelog(String Classname,String message)
	{
		DOMConfigurator.configure("../AutomationFramework/Layout.xml");
		Logger log=Logger.getLogger(Classname);
		log.info(message);

	}

}
