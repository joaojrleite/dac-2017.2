package br.com.fametro.dsw.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Schedule
 */
@WebServlet("/Jogos")
public class Schedule extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Schedule() {
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

	private void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Liga feminina brasileira de futebol 2017-2018 Cronograma da Temporada Regular</title>");
		//out.println("<link rel='styleheet' type='text/css' herf='" + request.getContextPath()+ "/schedule.css' />");
		out.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() +  "/schedule.css' />"); 
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Liga Feminina Brasileira de Futebol</h1>");
		out.println("<h2>2017-2018 Cronograma da Temporada Regular</h2>");
		out.println("<table>");
		out.println("<thead>");
		out.println("<tr>");
		out.println("<th>Data/th");
		out.println("<th>Horario</th>");
		out.println("<th>Arena</th>");
		out.println("<th>Visitante</th>");
		out.println("<th>Mandante</th>");
		out.println("<th>Placar</th>");
		out.println("</tr>");
		out.println("</thead>");
		out.println("<tbody>");
		out.println("<tr class='odd-rom'>");
		out.println("<td>Jan. 7, 2017</td");
		out.println("<td>7:00 PM</td>");
		out.println("<td>Puma</td>");
		out.println("<td>Raposas</td>");
		out.println("<td>Vixens</td>");
		out.println("<td>" + Placar.getPlacar() + "-" + Placar.getPlacar() + "</td>");
		out.println("</tr>");
		out.println("</tbody>");
		out.println("</table>");
		out.println("</BODY>");
		out.println("</HTML>");









	}

}
