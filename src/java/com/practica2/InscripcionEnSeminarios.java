package com.practica2;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
    @WebServlet(name = "InscripcionEnSeminarios", urlPatterns = {"/InscripcionEnSeminarios"})
    public class InscripcionEnSeminarios extends HttpServlet {
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
        out.println("<title style='color:blue'>Inscripcion en seminarios</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1 style='color:blue'>Inscripcion en seminarios</h1>");

        out.println("<form action='' method='POST' >");
        out.println("");

        //FECHA
        out.println("<label for='fecha' style='margin-right:4rem;'>Fecha</label>");
        out.println("<input type='date' name='fecha' id='fecha' style='margin-right:5rem;'>");
        out.println("<input type='checkbox' name='5g' value='5G' id='5g'style='color:blue'>");
        
        out.println("<label for='5g' style='color:blue'>5G</label><br>");
        out.println("<br>");

        //NOMBRE
        out.println("<label for='nombre' style='margin-right:3rem;'>Nombre</label>");
        out.println("<input type='text' name='nombre' id='nombre' style='margin-right:1.4rem;'>");
        out.println("<input type='checkbox' name='ia' value='Inteligencia Artificial' id='ia' style='color:blue'>");
        out.println("<label for='ia'style='color:blue'>Inteligencia Artificial</label><br>");
        out.println("<br>");

        //APELLIDOS
        out.println("<label for='apellidos' style='margin-right:2.4rem;' >Apellidos</label>");
        out.println("<input type='text' name='apellidos' id='apellidos' style='margin-right:1.4rem;'>");
        out.println("<input type='checkbox' name='machler' value='Machine learning' id='machler' style='color:blue'>");
        out.println("<label for='machler' style='color:blue'>Machine learning</label><br>");
        out.println("<br>");

        //TURNO
        out.println("<label for='turno' style='margin-right:3.9rem;' style='color:blue'>Turno</label>");
        out.println("<select name='turno' id='turno' style='margin-right:8rem;'>");
        out.println("<option value='Mañana'style='color:blue'>Mañana</option>");
        out.println("<option value='Tarde'style='color:blue'>Tarde</option>");
        out.println("<option value='Noche'style='color:blue'>Noche</option>");
        out.println("</select>");
        out.println("<input type='checkbox' name='rob' value='Robótica' id='rob' >");
        out.println("<label for='rob'style='color:blue'>Robótica</label><br><br>");

        //ENVIAR
        out.println("<input type='submit' value='Enviar' style='color:blue'>");
        out.println("</form ><br>");
        out.println("<a href='/PRACTICA-2' style='color:blue'>Volver</a>");
        out.println("</body>");
        out.println("</html>");

        }finally{
         out.close();
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    //RECEPCION DE DATOS
    String fecha = request.getParameter("fecha")!=null? request.getParameter("fecha"):"";
    String cincoG = request.getParameter("5g")!=null? request.getParameter("5g"):"";
    String nombre = request.getParameter("nombre")!=null? request.getParameter("nombre"):"";
    String ia = request.getParameter("ia")!=null? request.getParameter("ia"):"";
    String apellidos = request.getParameter("apellidos")!=null? request.getParameter("apellidos"):"";
    String machler = request.getParameter("machler")!=null? request.getParameter("machler"):"";
    String turno = request.getParameter("turno")!=null? request.getParameter("turno"):"";
    String rob = request.getParameter("rob")!=null? request.getParameter("rob"):"";

    PrintWriter out = response.getWriter();
    try{

        //MOSTRAR DATOS
         out.println("<!DOCTYPE html>");
         out.println("<html>");
         out.println("<head>");
         out.println("<title style='color:blue'>Inscripcion en seminarios</title>");
         out.println("</head>");
         out.println("<body>");
         out.println("<h1 style='color:blue;'>Datos Recibidos</h1>");
         out.println("");
         out.println("<ul>");
         out.println("<li >Fecha: "+fecha+"</li>");
         out.println("<li >Nombre: "+nombre+"</li>");
         out.println("<li >Apellidos: "+apellidos+"</li>");
         out.println("<li >Turno: "+turno+"</li>");
         out.println("<li >Seminario de: "+cincoG+", "+ia+", "+machler+", "+rob+"</li>");
         out.println("</ul>");

         //VOLVER
         out.println("<a href='InscripcionEnSeminarios' style='color:blue'>Volver</a><br>");
         out.println("<a href='/PRACTICA-2' style='color:blue'>Volver a menu</a>");
         out.println("</body>");
         out.println("</html>");
         }finally{
         out.close();
         }
         }
        }
