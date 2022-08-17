package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonFileLoad {

	
	public static String LoadJson(String path) throws FileNotFoundException
	{
		File f=new File(path);
		FileReader fr=new FileReader(f);
	    JSONTokener jk=new JSONTokener(fr);
	    JSONObject jo=new JSONObject(jk);
	    
	    return jo.toString();
	}
}
