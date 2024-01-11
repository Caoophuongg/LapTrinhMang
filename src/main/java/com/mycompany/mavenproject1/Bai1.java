/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.net.InetAddress;

/**
 *
 * @author ACER
 */
public class Bai1 {
    public static void main(String[]args){
        try{
            //Lay dia chi IP cua 1 trang web
            InetAddress inet=InetAddress.getByName("www.google.com");
            //thu ket noi trong thoi gian 5 giay
            boolean isKN=inet.isReachable(5000);
            //in ra thong bao
            if(isKN)
            {
                System.out.println("Co internet");
            }
            else
            {
                System.out.println("khong ket noi duoc");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
