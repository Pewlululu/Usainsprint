/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Owner;

import java.util.ArrayList;
import java.util.Iterator;
import model.Orders;

/**
 *
 * @author TonyL
 */
public class GetStatusController {
    
    public static Iterator<Orders> getStatus()
    {
        ArrayList<Orders> list = Orders.getAllStatus();
        Iterator<Orders> itr = list.iterator();

        return itr;
    }
}
