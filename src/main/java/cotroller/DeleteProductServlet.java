package cotroller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Product;
import sevice.ProductService;

import java.io.IOException;

@WebServlet(urlPatterns = "/delete")
public class DeleteProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        for (int i = 0; i <ProductService.products.size() ; i++) {
            if ( ProductService.products.get(i).getName().equals(name)){
                ProductService.products.remove(i);
            }

        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/products");
        dispatcher.forward(req,resp);
    }
}
