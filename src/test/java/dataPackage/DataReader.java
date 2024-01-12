package dataPackage;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReader {
	
	public List<HashMap<String, String>> dataConvert() throws IOException {
		
		
		//read json to string
		String stringData = FileUtils.readFileToString(new File(System.getProperty("user.dir")+"//src//test//java//dataPackage//OrderData.json"), StandardCharsets.UTF_8);
		
		//String to HashMap - Json Databind
		
		ObjectMapper mapper = new ObjectMapper();
		
		List<HashMap<String, String>> data = mapper.readValue(stringData, new TypeReference<List<HashMap<String, String>>>(){
			
		});
		
		return data;
		
	}

}
