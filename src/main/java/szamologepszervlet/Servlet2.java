package szamologepszervlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/szamologep.do")
public class Servlet2 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ResultDto resultDto = new ResultDto();
		List<String> errorList = new ArrayList<String>(); 
		
		String aString = req.getParameter("a");
		Double a = 0.0;
		if (aString == null) {
				errorList.add("az 'a' parameter nem lehet ures");
		} else {
			try {
				a = Double.parseDouble(aString);
			} catch (NumberFormatException ex) {
				errorList.add("az 'a' parameter szam kell legyen");
			}
		}
		resultDto.setA(aString);
		
		
		String bString = req.getParameter("b");
		Double b = 0.0;
		if (bString == null) {
				errorList.add("az 'b' parameter nem lehet ures");
		} else {
			try {
				b = Double.parseDouble(bString);
			} catch (NumberFormatException ex) {
				errorList.add("az 'b' parameter szam kell legyen");
			}
		}
		resultDto.setB(bString);
		
		
		String operator = req.getParameter("operator");
		resultDto.setOperator(operator);
		
		if (operator == null) {
			errorList.add("az operator parameter nem lehet ures");
		}
		
		
		Double result = 0.0;
		if (errorList.isEmpty()) {
			if ("+".equals(operator)) {
				result = a + b;
			} else {
				errorList.add("nem tamogatott muvelet");	
			}
		}
		
		resultDto.setResult(result);
		resultDto.setErrorList(errorList);
		// eltarolja a keres attributumba az osszes infot, hogy a jsp is elerje
		req.setAttribute("result", resultDto);
		
		// forward
		RequestDispatcher rd = req.getSession()
				.getServletContext( )
				.getRequestDispatcher("/");
		
		rd.forward(req, resp);
	}
	
	
}
