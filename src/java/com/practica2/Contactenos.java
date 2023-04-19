package com.practica2;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

    @WebServlet(name = "Contactenos", urlPatterns = {"/Contactenos"})
    public class Contactenos extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    try{

            //FORMULARIO
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Contactenos</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 style='color:palevioletred'>Contactenos</h1>");
            
            out.println("<form action='' method='POST' >");
            out.println("");
        
            //NOMBRE
            out.println("<label for='nombre' style='margin-right:6rem;'>Nombre</label>");
            out.println("<input type='text' name='nombre' id='nombre'");
            out.println("<br><br><br>");

            //CORREO ELECTRONIC
            out.println("<label for='email' style='margin-right:1.9rem;'>Correo electrónico</label>");
            out.println("<input type='text' name='email' id='email'>");
            out.println("<br><br>");

            //MENSAJE
            out.println("<label for='mensaje' style='margin-right:3rem;'>Mensaje</label><br>");
            out.println("<textarea style='margin-left:9.6rem;’ name='mensaje' id='mensaje' cols='40' rows='5' ></textarea>");
            out.println("<br><br>");

            //CHECKBOX
            out.println("<input type='checkbox' style='margin-left:9.6rem;' name='ecop' value='SI' id='ecop' >");
            out.println("<label for='copicor' style='color:palevioletred'>Enviar una copia a mi correo</label>");
            out.println("<br><br>");

            //ENVIAR
            out.println("<input type='submit' value='Enviar' style='color:palevioletred'>");
            out.println("</form ><br>");
            out.println("<a href='/PRACTICA-2' style='color:palevioletred'>Volver</a>");
            out.println("</body>");
            out.println("</html>");
            }finally{
            out.close();
            }
            }
            @Override
            protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            //rECEPCION DE DATOS
            String nombre = request.getParameter("nombre")!=null? request.getParameter("nombre"):"";
            String email = request.getParameter("email")!=null? request.getParameter("email"):"";
            String mensaje = request.getParameter("mensaje")!=null? request.getParameter("mensaje"):"";
            String copicor = request.getParameter("copicor")!=null? request.getParameter("copicor"):"NO";
            PrintWriter out = response.getWriter();
        try{
        
            //MOSTRAR DATOS
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title style='color:palevioletred'>Contactenos</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 style='color:palevioletred'>Datos Recibidos</h1>");
            out.println("");
            out.println("<ul>");
            out.println("<li>Nombre: "+nombre+"</li>");
            out.println("<li>Correo electronico: "+email+"</li>");
            out.println("<li>Mensaje: "+mensaje+"</li>");
            out.println("<li>Enviar copia a correo: "+copicor+"</li>");
            out.println("</ul>");
            out.println("<a href='Contactenos' style='color:palevioletred'>Volver</a><br>");
            out.println("<a href='/PRACTICA-2'>Volver a menu</a>");
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }
}