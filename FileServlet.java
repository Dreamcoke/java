package qhw;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/file")
public class FileServlet extends HttpServlet{
public void doPost(HttpServletRequest request,
		HttpServletResponse response) throws IOException{
	
	String photo=request.getParameter("photo");
	InputStream is=FileSystem.readFile(photo);
	response.setContentType("image/jpeg");
	response.setContentLength(is.available());
	OutputStream os=response.getOutputStream();
	byte []buf=new byte[8192];
	int length;
	while((length=is.read(buf))!=-1)
	{
		os.write(buf,0,length);
	}
	os.close();
 }

public void doGet(HttpServletRequest request,
		   HttpServletResponse response) 
				   throws ServletException,IOException{
	   doPost(request, response);
	
}
}
