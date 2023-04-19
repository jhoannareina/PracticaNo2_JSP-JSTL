package com.practica2;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "RegistroDeLibros", urlPatterns = {"/RegistroDeLibros"})
    public class RegistroDeLibros extends HttpServlet {
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
            out.println("<title>RegistroDeLibros</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 style='color:brown'>Registro De Libros</h1>");
            
            out.println("<form action='' method='POST' >");
            out.println("");

            //TITULO
            out.println("<label for='titulo' style='margin-right:7rem;'>Titulo</label>");
            out.println("<input type='text' name='titulo' id='titulo'>");
            out.println("<br><br>"); 

            //AUTOR
            out.println("<label for='autor' style='margin-right:7rem;'>Autor</label>");
            out.println("<input type='text' name='autor' id='autor'>");
            out.println("<br><br>"); 
        
            //RESUMEN
            out.println("<label for='res' style='margin-right:3rem;'>Resumen</label><br>");
            out.println("<textarea style='margin-left:9.6rem;' name='res' id='res' cols='40' rows='5'></textarea><br>");
            out.println("<label for='' style='margin-right:7rem;'>Medio</label>");
            

            //CHECKBOX
            out.println("<input type='radio' name='medio' value='Fisio' id='medio1'>");
            out.println("<label for='medio1' style='color:brown'>Fisico</label><br>");
            out.println("<input style='margin-left:10.2rem;' value='Magnetico' type='radio' name='medio' id='medio2'>");
            out.println("<label for='medio2' style='color:brown'>Magnetico</label><br>");

            //ENVIAR
            out.println("<input type='submit' value='Enviar' style='color:brown'>");
            out.println("</form >");
            out.println("<a href='/PRACTICA-2' style='color:brown'>Volver</a>");
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
            String titulo = request.getParameter("titulo")!=null? request.getParameter("titulo"):"";
            String autor = request.getParameter("autor")!=null? request.getParameter("autor"):"";
            String res = request.getParameter("res")!=null? request.getParameter("res"):"";
            String medio = request.getParameter("medio")!=null? request.getParameter("medio"):"";
            PrintWriter out = response.getWriter();
            try{
                //MOSTRAR DATOS
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title style='color:brown'>Ingresar Libro</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1 style='color:brown'>Datos Recibidos</h1>");
                out.println("");
                out.println("<ul>");
                out.println("<li>Titulo: "+titulo+"</li>");
                out.println("<li>Autor: "+autor+"</li>");
                out.println("<li>Resumen: "+res+"</li>");
                out.println("<li>Medio: "+medio+"</li>");
                out.println("</ul>");
                out.println("<a href='Registrar Libro' style='color:brown'>Volver</a><br>");
                out.println("<a href='/PRACTICA-2' style='color:brown'>Volver a menu</a>");
                out.println("</body>");
                out.println("</html>");
            }finally{
                out.close();
            }
        }
}