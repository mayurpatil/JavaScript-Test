package com.google.appengine.demos.search;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Hello extends HttpServlet{
 public void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws IOException, ServletException {
        resp.getWriter().println("Hello SDMCET");
      }
}

