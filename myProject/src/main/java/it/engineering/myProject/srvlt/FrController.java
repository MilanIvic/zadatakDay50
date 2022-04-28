package it.engineering.myProject.srvlt;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.engineering.myProject.contr.ApplicationController;
import it.engineering.myProject.view.ViewResolver;

/**
 * Servlet implementation class FrController
 */
@Component
public class FrController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationController applicationController;   
	
	@Autowired
	ViewResolver viewResolver;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = applicationController.processRequest(request, response);
		//na osnovu pogleda vrati konkretnu stranicu korisniku
		request.getRequestDispatcher(viewResolver.getPage(view)).forward(request, response);
	}
	
	@Override
	public void init() throws ServletException {
		super.init();
		applicationController = new ApplicationController();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		ApplicationContext applicationContext = 
				(ApplicationContext) config.getServletContext().getAttribute("application-context");
		AutowireCapableBeanFactory acbf = applicationContext.getAutowireCapableBeanFactory();
		acbf.autowireBean(this);
	}
}
