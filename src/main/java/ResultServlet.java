

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResultServlet
 */
@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		ArrayList<String> cardName = new ArrayList<>();
		ArrayList<String> cost = new ArrayList<>();
		ArrayList<String> resultCard = new ArrayList<>();
		
		String[] check = request.getParameterValues("playCard[]");
		for (int i = 0;i < check.length;i++) {
			String[] split = check[i].split(",");
			cardName.add(split[0]);
			cost.add( split[1]);
		}
		
		for(int i = 0;i<10;i++) {
			Random rand =new Random();
			int number =rand.nextInt(cardName.size());
			resultCard.add(cardName.get(number));
			cardName.remove(number);
		}
		/*要素数取得
		 * 配列　→ length
		 *ArrayList → size()
		 *
		 *参照
		 *配列 配列名[index]
		 *ArrayList 配列名.get(index)
		 */
		
		
		request.setAttribute("playCard[]", resultCard);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Result.jsp");
		dispatcher.forward(request,response);
		//System.out.println("受け取った値は;" + check);
		}
	
	
	
}
