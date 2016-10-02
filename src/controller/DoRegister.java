package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoRegister
 */
@WebServlet("/doRegister")
public class DoRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String customerId = request.getParameter("id");
		String customerPassword = request.getParameter("password");
		String customerName = request.getParameter("name");
		String customerGender = request.getParameter("gender");
		String customerEmail = request.getParameter("email");
	
		// perform business logic. Return a bean as a result.
		CustomerService service = (CustomerService) CustomerService.getInstance();
		Customer customer = new Customer(customerId, customerPassword, customerName, customerGender, customerEmail);
		
		String page;
		
		if(service.findCustomer(customerId) == null) {
			service.addCustomer(customer);
			page = "/view/registerSuccess.jsp";
			
			request.setAttribute("customer", customer);
		}
		else {
			page = "/view/registerFail.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

}
