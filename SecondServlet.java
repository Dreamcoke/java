package qhw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out=response.getWriter();
    Student student=(Student)request.getAttribute("stu");
    out.println("<html><body>");
    out.println("学号："+student.getsno()+"<br>");
    out.println("姓名："+new String(student.getname().getBytes("ISO-8859-1"),"UTF-8")+"<br>");
    
    out.println("<img src='file?photo="+student.getsno()+"'>"+"<br>");
    out.println("<a href='input.jsp'>返回输入页面</a>");
    out.println("</body></html>");
    
    
	
    
	}
	
}