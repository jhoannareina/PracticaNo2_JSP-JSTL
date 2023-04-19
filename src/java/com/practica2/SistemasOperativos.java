package com.practica2;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "SistemasOperativos", urlPatterns = {"/SistemasOperativos"})
public class SistemasOperativos extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    try{
 
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title style='color:green'>Sistemas Operativos</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1 style='color:green'>Encuesta de Sistemas Operativos</h1>");
    
    out.println("<form action='' method='POST' >");
    out.println("");

    //NOMBRE
    out.println("<label for='nombre' style='color:green'>Nombre</label>");
    out.println("<input type='text' name='nombre' id='nombre'>");
    out.println("<br><br>"); 

   //CKECKBOX
   //WINDOWS
    out.println("<input type='checkbox' name='win' value='Windows' id='win' >");
    out.println("<label for='windows' style='color:green'>Windows</label><br>");
    //LINUX
    out.println("<input type='checkbox' name='linux' value='Linux' id='linux'>");
    out.println("<label for='linux' style='color:green'>Linux</label><br>");
    //IOs
    out.println("<input type='checkbox' name='ios' value='IOs' id='ios'>");
    out.println("<label for='ios' style='color:green'>IOs</label><br>");
    //ANDRIOD
    out.println("<input type='checkbox' name='andr' value='Android' id='andr'>");
    out.println("<label for='android' style='color:green'>Android</label><br><br>");
 
    //ENVIAR
    out.println("<input type='submit' value='Enviar'>");
    out.println("<br><br>");
    out.println("</form >");
    out.println("<a href='/PRACTICA-2' style='color:green'>Volver</a>");
    out.println("</body>");
    out.println("</html>");
    }finally{
    out.close();
    }
    }
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    //Recibimos los datos y asignamos alas variables
    String nombre = request.getParameter("nombre")!=null? request.getParameter("nombre"):"";
    String windows = request.getParameter("windows")!=null? request.getParameter("windows"):"";
    String linux = request.getParameter("linux")!=null? request.getParameter("linux"):"";
    String ios = request.getParameter("ios")!=null? request.getParameter("ios"):"";
    String android = request.getParameter("android")!=null? request.getParameter("android"):"";

    PrintWriter out = response.getWriter();
    try{

        //MOSTRAR DATOS
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Sistemas Operativos</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1 style='color:green'>Datos Recibidos</h1>");
        out.println("");
        out.println("<ul>");
        out.println("<li >Nombre: "+nombre+"</li>");
        out.println("<li>Sistema Opertivo utilizados: "+windows+", "+linux+", "+ios+", "+android+"</li>");
        out.println("</ul>");

        out.println("<a href='SistemasOperativos'>Volver</a><br>");
        out.println("<a href='/PRACTICA-2'>Volver a menu</a>");
        out.println("</body>");
        out.println("</html>");
    }finally{
    out.close();
    }
 }
}