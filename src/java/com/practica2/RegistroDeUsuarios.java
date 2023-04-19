package com.practica2;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(name = "RegistroDeUsuarios", urlPatterns = {"/RegistroDeUsuarios"})
public class RegistroDeUsuarios extends HttpServlet {
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
        out.println("<title style='color:orange'>Registro De Usuarios</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1 style='color:orange'>Registro De Usuarios</h1>");
        
        out.println("<form action='' method='POST' >");
        out.println("");
        //NOMBRE
        out.println("<label style='margin-right:6rem;' for='nombre'>Nombre</label>");
        out.println("<input type='text' name='nombre' id='nombre'>");
        out.println("<br><br>"); // salto de linea
        
        out.println("<label style='margin-right:5.3rem;' for='apellidos'>Apellidos</label>");
        out.println("<input type='text' name='apellidos' id='apellidos'>");
        out.println("<br><br>"); // salto de linea
        out.println("<label style='margin-right:1.9rem;' for='email'>Correo electrónico</label>");
        out.println("<input type='email' name='email' id='email'>");
        out.println("<br><br>"); // salto de linea
        out.println("<label style='margin-right:4.8rem;' for='contraseña'>Contraseña</label>");
        out.println("<input type='password' name='contraseña' id='contraseña'>");
        out.println("<br><br>"); // salto de linea
        //ENVIAR
        out.println("<input type='submit' value='Enviar'>");
        out.println("</form ><br>");
        out.println("<a href='/PRACTICA2'>Volver</a>");
        out.println("</body>");
        out.println("</html>");
        }finally{
        out.close();
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    //RECEPCION DATOS
    String nombre = request.getParameter("nombre")!=null? request.getParameter("nombre"):"";
    String apellidos = request.getParameter("apellidos")!=null? request.getParameter("apellidos"):"";
    String email = request.getParameter("email")!=null? request.getParameter("email"):"";
    String contraseña = request.getParameter("contraseña")!=null? request.getParameter("contraseña"):"";
    PrintWriter out = response.getWriter();
    try{
        //MOSTRAMOS DATOS
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title >Registro de Usuarios</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1 style='color:orange'>Datos Recibidos</h1>");
        out.println("");
        out.println("<ul>");
        out.println("<li>Nombre: "+nombre+"</li>");
        out.println("<li>Apellidos: "+apellidos+"</li>");
        out.println("<li>Correo electronico: "+email+"</li>");
        out.println("<li>Contrasena: "+contraseña+"</li>");
        out.println("</ul>");
        out.println("<a href='Registro de Usuarios' style='color:orange'>Volver</a><br>");
        out.println("<a href='/PRACTICA-2'>Volver a menu</a>");
        out.println("</body>");
        out.println("</html>");
        }finally{
        out.close();
        }
    }
}