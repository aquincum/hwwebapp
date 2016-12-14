/**
 * Created by dani on 12/13/16.
 */
import javax.servlet.http.*;
import java.io.IOException;

public class TrialServlet extends HttpServlet {
    public TrialServlet() {
        super();
    }

    @Override
    public doGet(HttpServletRequest req,
                 HttpServletResponse resp)
              throws ServletException,
                    IOException
    {
        resp.getWriter().println("AAAAA");
    }

}
