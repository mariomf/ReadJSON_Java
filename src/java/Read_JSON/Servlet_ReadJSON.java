/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Read_JSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;


/**
 *
 * @author mario
 */
//@WebServlet(name = "Servlet_ReadJSON", urlPatterns = {"/Servlet_ReadJSON"})
@WebServlet(urlPatterns = {"/info2Back"})
public class Servlet_ReadJSON extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String contrasena = request.getParameter("contrasena");
        
        
        JSONObject json = new JSONObject();
        json.put("respuesta", true);
        response.setContentType("application/json utf-8");
        PrintWriter out = response.getWriter();
        out.print(json.toString());

        
    }
}
