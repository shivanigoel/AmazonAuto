package Pageclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class loadpropertiesfile {
	
	public Properties useprop() throws IOException{
		
		File file=new File("C:\\Users\\Shiva\\workspace\\amazonautto\\src\\main\\java\\Home.properties");
		FileInputStream fs=new FileInputStream(file);
		Properties op=new Properties();
		op.load(fs);
		return op;
	}
	
}
