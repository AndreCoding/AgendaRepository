package com.andre.agenda.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.DateFormatter;

import com.andre.agenda.ejb.EjbUsuario;
import com.andre.agenda.ejbinterface.IEjbUsuario;

/**
 * Servlet implementation class ServletUsuarioInsertar
 */
@WebServlet("/ServletUsuarioInsertar")
public class ServletUsuarioInsertar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private IEjbUsuario ejbUsuario;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUsuarioInsertar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("usuario/insertar.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			ejbUsuario = new EjbUsuario();
			
			ejbUsuario.getUsuario().setNombre(request.getParameter("txtNombre"));
			ejbUsuario.getUsuario().setApellido(request.getParameter("txtApellido"));
			ejbUsuario.getUsuario().setCorreo(request.getParameter("txtCorreoElectronico"));
			DateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
			
		
			ejbUsuario.getUsuario().setFechanacimiento(dt.parse(request.getParameter("dateFechaNacimiento")));
			ejbUsuario.getUsuario().setPassword(request.getParameter("txtPassword"));

			ejbUsuario.insert();
			request.getRequestDispatcher("usuario/insertar.jsp").forward(request, response);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.getMessage());
		}
	}

}
