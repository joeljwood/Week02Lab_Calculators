
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Joel Wood
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstvalue = request.getParameter("first_value");
        String secondvalue = request.getParameter("second_value");
        String addButton = request.getParameter("addition");
        String subtractButton = request.getParameter("subtraction");
        String multiplyButton = request.getParameter("multiplication");
        String modulusButton = request.getParameter("modulus");
        
        request.setAttribute("firstValue", firstvalue);
        request.setAttribute("secondValue", secondvalue);
        
        if(firstvalue == null || secondvalue == null || "".equals(firstvalue) || "".equals(secondvalue) ){
            request.setAttribute("message", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        }
        else if(isInt(firstvalue) || isInt(secondvalue)){
            if(addButton != null){
            int addValue = Integer.parseInt(firstvalue) + Integer.parseInt(secondvalue);
                request.setAttribute("message", addValue);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            }
            else if(subtractButton != null){
            int subtractValue = Integer.parseInt(firstvalue) - Integer.parseInt(secondvalue);
                request.setAttribute("message", subtractValue);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            }
            else if(modulusButton != null){
                int modulusValue = Integer.parseInt(firstvalue) % Integer.parseInt(secondvalue);
                request.setAttribute("message", modulusValue);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            } 

            else{
                  int multiplyValue = Integer.parseInt(firstvalue) * Integer.parseInt(secondvalue);
                request.setAttribute("message", multiplyValue);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            }
        }
        else{
            request.setAttribute("message", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        }
        
       
    }
    public boolean isInt(String s)
{
    try
    {
        Integer.parseInt(s);
        return true;
    } catch (NumberFormatException ex)
    {
        return false;
    }
}
}
