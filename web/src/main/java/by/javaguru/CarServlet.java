package by.javaguru;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/car")
public class CarServlet extends HttpServlet {

    private final CarService carService = new CarService();


    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var car = carService.getCar(1L);

        resp.setContentType("text/html");
        var writer = resp.getWriter();
        writer.println("<html><body>");

        writer.println("<h1> Car: </h1>");
        writer.println("<p style='color:Tomato'> " + car.get().getBrandOfCar() +"</p>");
        writer.println("<p style='color:Tomato'> " + car.get().getPrice() +"</p>");
        writer.println("<p style='color:Tomato'> " + car.get().getMaxSpeed() +"</p>");

        writer.println("</body></html>");
        writer.close();

    }

}
