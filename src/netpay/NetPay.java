/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netpay;
/**
 * 
 * @author shhua8751
 */

public class NetPay {

    /**
 *@Henry Huang
 *NetPay.java
 * This program calculates the Net Pay of employee.
 * February 27,2018
 */
    public static void main(String[] args) {
        
       int hours;
       double wage;
       double insurance;
       double tax;
       double netpay;
       
       hours =40;          //The employee worked 40hours.
       wage = 5.00;        //The employee received $5.00 per hour.
       insurance = 2.00;   //The employee has a insurance which is 2.00.
       tax = 0.22;         //The employee needs to pay 22% for tax.
       
       netpay = (hours * wage - insurance) - tax * (hours *wage - insurance);
       //The eqaution to caculates the netpay of the employee.
       
       
       System.out.println("The NetPay is" + netpay);
     
       
    }
    
    
}
