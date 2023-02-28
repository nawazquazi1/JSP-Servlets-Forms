

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().println("NAME : "+request.getParameter("name")+" ");
//		response.getWriter().println("GENDER : "+request.getParameter("gender")+" ");
//   PrintWriter out=response.getWriter();
//   String [] countries =request.getParameterValues("language");
//   out.print("LANGUAGE :");
//       if(countries!=null){
//	       for(int i=0;i<countries.length;i++){
//	     	out.println(countries[i]);
//	       }
//       	}else{
//         out.println("None Selected");	
//		}
//       
//       response.getWriter().println("COUNTRY : "+request.getParameter("country"));
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("NAME : "+request.getParameter("name")+" ");
		response.getWriter().println("GENDER : "+request.getParameter("gender")+" ");
   PrintWriter out=response.getWriter();
   String [] countries =request.getParameterValues("language");
   out.print("LANGUAGE :");
       if(countries!=null){
	       for(int i=0;i<countries.length;i++){
	     	out.println(countries[i]);
	       }
       	}else{
         out.println("None Selected");	
		}
       
       response.getWriter().println("COUNTRY : "+request.getParameter("country"));
	}

}
