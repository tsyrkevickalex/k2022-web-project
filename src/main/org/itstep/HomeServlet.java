package org.itstep;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HomeServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("inside init()");
        super.init();
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("inside service()");
        super.service(req, res);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("inside doGet()");

        PrintWriter writer = resp.getWriter();
        writer.println("Hello from servlet. Serer time is " + new Date());
    }

    @Override
    public void destroy() {
        System.out.println("inside destroy()");
    }
}
