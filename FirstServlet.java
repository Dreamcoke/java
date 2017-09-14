package qhw;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import com.sun.org.apache.regexp.internal.recompile;

@WebServlet(name="FirstServlet",urlPatterns= {"/input.do"})
@MultipartConfig()
public class FirstServlet extends HttpServlet{
   public void doPost(HttpServletRequest request,
		   HttpServletResponse response)
        throws ServletException,IOException{
	   String sno=request.getParameter("sno");
	   String name=request.getParameter("name");
	   Part photo=request.getPart("photo");
	   FileSystem.saveFile(sno,photo.getInputStream());
	   Student stu=new Student(sno,name);
	   request.setAttribute("stu", stu);
	   request.getRequestDispatcher("/SecondServlet").forward(request, response);
   }
   
   public void doGet(HttpServletRequest request,
		   HttpServletResponse response) throws ServletException,IOException{
	   doPost(request, response);
	
}
}
