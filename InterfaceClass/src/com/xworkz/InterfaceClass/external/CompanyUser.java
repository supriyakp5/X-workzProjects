package com.xworkz.InterfaceClass.external;

import com.xworkz.InterfaceClass.intrnal.Company;

public class CompanyUser {
    private Company company;
     public CompanyUser(Company company){
        this.company=company;
        System.out.println("initial company in company user");
     }
     public void developer(){
         System.out.println("running developer");
         if(this.company!=null){
             this.company.product1();
         }
     }

}
