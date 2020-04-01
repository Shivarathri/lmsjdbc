package com.capgemini.javafullstack.springcore;

import com.capgemini.javafullstack.bean.EmployeeAddressInfo;
import com.capgemini.javafullstack.bean.EmployeePrimaryInfo;

public class App 
{
    public static void main( String[] args )
    {
        EmployeeAddressInfo address = new EmployeeAddressInfo();
        address.setAid(1);
        address.setCity("Hyd");
        address.setAddressType("current");
        
		/*
		 * EmployeePrimaryInfo primary = new EmployeePrimaryInfo(); primary.setId(10);
		 * primary.setName("Ravi"); primary.setAddress(address);
		 */
        
        
    }
}
