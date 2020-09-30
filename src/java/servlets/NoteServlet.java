
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 818736
 */
public class NoteServlet extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            String title = br.readLine();
           
                  
            
             String content="";
            String line= br.readLine();
            while(line != null)
            {
                content = String.format(content + line);
                line = br.readLine();
            }
           Note note = new Note(title, content);
            
           request.setAttribute("Note", note);
           
           String page = request.getParameter("edit");
            
           if("edit".equals(page))
            {
                getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            }
            else
            {
                getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            }
                 
       
           
            //getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
           

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        
        pw.printf("%s/n%s", title, content);
       
        
        Note note = new Note(title, content);
         request.setAttribute("Note", note);
          getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

   
}
