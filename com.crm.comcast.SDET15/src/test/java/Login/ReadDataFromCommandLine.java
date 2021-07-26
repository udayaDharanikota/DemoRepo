package Login;

import org.testng.annotations.Test;

public class ReadDataFromCommandLine {

	public static void main(String[] args) {
	//@Test
	//public void readDataTest() {
		String browserType=System.getProperty("BROWSER");
		
		String URL=System.getProperty("URL");
		System.out.println(browserType);
		System.out.println(URL);
	}

	}

	

	

