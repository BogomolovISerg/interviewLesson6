package ru.geekbrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public final class Lesson6Application extends HttpServlet{

	public void doGet(HttpServletRequest request,
					  HttpServletResponse response)
			throws IOException, ServletException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>Sample Application Servlet Page</title>");
		writer.println("</head>");
		writer.println("<body bgcolor=white>");
		writer.println("<h1>Hello, World</h1>");
		writer.println("</body>");
		writer.println("</html>");
	}
}
