package cotroller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sevice.ProductService;

import java.io.IOException;

@WebServlet(value = "/products")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("sanphams", ProductService.products);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/showProduct.jsp");
        dispatcher.forward(req,resp);
    }
}
