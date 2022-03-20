import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ecommerce.Eproduct;
import com.ecommerce.HibernateUtil;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/add-product")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("add-product.html").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body>");
		

		String name = request.getParameter("name");
		String price = request.getParameter("price");
		if(name.isEmpty() && price.isEmpty()) {
			pw.println("<h2 style='color:green'>Enter the products details again</h2><br/>");
			pw.println("<br><a href=\"add-product.html\">Back to add product page</a>");
		}
		else {
		// STEP 1: Gets SessionFactory Object
		SessionFactory sf = HibernateUtil.buildSessionFactory();
		
		// STEP 2: Open Sesson
		Session session = sf.openSession();
		
		
		Transaction tx = session.beginTransaction();
			Eproduct ep = new Eproduct();
			ep.setName(name);
			ep.setPrice(Double.valueOf(price));
			//ep.setDate_added(Date.);
			session.save(ep);
		
		tx.commit();
		
		pw.println("<h3 style='color:green'> Product is created successfully ! </h3>");
		
		session.close();
		}
		
	}

}