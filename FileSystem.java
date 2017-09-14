package qhw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.jasper.tagplugins.jstl.core.Catch;

public class FileSystem {
private static final String ROOT_PATH=System.getProperty("user.home");
public static void saveFile(String filename,InputStream is)throws IOException {
	try {
   OutputStream os=new FileOutputStream(ROOT_PATH+"/"+filename);
   byte []buf=new byte[8192];
   int length;
   while((length=is.read(buf))!=-1) {
	   os.write(buf,0,length);
   }
	os.flush();
	os.close();
}catch (Exception e){
	e.printStackTrace();
}
	
	}
   public static InputStream readFile(String filename)throws FileNotFoundException {
	   return new FileInputStream(ROOT_PATH+"/"+filename);
  }
}
