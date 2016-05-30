package dz2;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
//		resp.getWriter().println("Hello, world");
		
		
		String v1 = req.getParameter("v1");
		int i1 = Integer.parseInt(v1);       
		
		String v2 = req.getParameter("v2");
		int i2 = Integer.parseInt(v2);      
		
		String operation = req.getParameter("operation");
		
		int result; 
		
		if (operation.equals("0")) {
			result = i1 + i2; 
		} else if (operation.equals("1")) {
			result = i1 - i2;
		} else if (operation.equals("2")) {
			result = i1 * i2; 
		} else {   
			result = i1 / i2;     
		}           
		
		resp.getWriter().println(result);
	}
}
