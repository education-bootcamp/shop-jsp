package com.devstack.pos.servlet;

import com.devstack.pos.bo.BoFactory;
import com.devstack.pos.bo.customer.CustomerBo;
import com.devstack.pos.dto.CustomerDto;
import com.google.gson.Gson;

import javax.jws.WebService;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet(name = "customer-servlet",
        urlPatterns="/customer")
public class CustomerServlet extends HttpServlet {


    CustomerBo customerBo= (CustomerBo) BoFactory.getInstance().getBo(BoFactory.BoType.CUSTOMER);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get");
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        double salary = Double.parseDouble(request.getParameter("salary"));

        customerBo.saveCustomer(
                new CustomerDto(id,name,address,salary)
        );
        /*
        response.setContentType("application/json");
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = request.getReader();

        try{
            String newLine;
            while ((newLine= reader.readLine())!=null){
                sb.append(newLine);
            }
            Gson gson = new Gson();
            CustomerDto customerDto = gson.fromJson(sb.toString(), CustomerDto.class);
            System.out.println(sb.toString());
            System.out.println(customerDto);
        }catch (Exception e){
        }*/


    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}
