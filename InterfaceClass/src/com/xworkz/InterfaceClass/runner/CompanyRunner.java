package com.xworkz.InterfaceClass.runner;

import com.xworkz.InterfaceClass.external.CompanyUser;
import com.xworkz.InterfaceClass.intrnal.Company;
import com.xworkz.InterfaceClass.intrnal.Employee;

public class CompanyRunner {
    public static void main(String[] args) {


        Company company=new Employee();
        CompanyUser companyUser=new CompanyUser(company);
        companyUser.developer();

    }
}
