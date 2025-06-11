package com.xworkz.general.servlet;

import javax.servlet.RequestDispatcher;

public class birthCertificateServlet() {



@WebServlet(urlPatterns = "/birth", loadOnStartup = 1)
public class birthCertificateServlet extends HttpServlet {

    public birthCertificateServlet() {
        System.out.println("Running BirthServlet...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {



        String bid = req.getParameter("bid");
        String name = req.getParameter("name");
        String fname = req.getParameter("fname");
        String mname = req.getParameter("mname");
        String dates = req.getParameter("dates");
        String times = req.getParameter("times");
        String dname = req.getParameter("dname");
        String nname = req.getParameter("nname");

        BirthDTO dto = new BirthDTO(bid, name, fname, mname, dates, times, dname, nname);
        System.out.println("Received BirthDTO: " + dto);

//        birthCertificateServlet birth = new birthCertificateServlet();
//        String result =   birthService.validate(BirthDTO);
//        System.out.println(result);

        req.setAttribute("dto", dto);

        RequestDispatcher dispatcher = req.getRequestDispatcher("birthResult.jsp");
        dispatcher.forward(req, resp);
    }
}