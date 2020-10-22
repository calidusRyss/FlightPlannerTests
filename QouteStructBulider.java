/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightfinder3.main.java.FlightPlannerTests;
import java.util.ArrayList;
import main.java.models.flightapi.structures.QuoteStruct;
import java.util.Random;




/**
 *
 * @author Callidus
 */
public class QouteStructBulider {
    
    
    
    static  String[] locations = {"CLT","GBO","JFK","LAX","CLT"};
    static String[] times = {"12:00p","1:00p","11:00a","6:45a"};
    static String[] dates = {"11-06-20","11-30-20","12-12-20","12-25-20"};
    static String[] cars = {"United","American","SouthWest","Awesom!"};
    
    static Random r = new Random();
    
    public static QuoteStruct bulidQuote()
    {
        int oi = r.nextInt(4);
        int di = r.nextInt(4);
        if (oi==di)
            di +=1;
        
        String origin = locations[oi];
        String des =  locations[di];
        
        String originDepartureTime = dates[r.nextInt(4)] + times[r.nextInt(4)];
        String inboundDepartureTime = dates[r.nextInt(4)] + times[r.nextInt(4)];        
        
        String originFlightCarrier = cars[r.nextInt(4)];
        String inboundFlightCarrier = cars[r.nextInt(4)];
        
        int val = r.nextInt(150) + 90; 
        String price = "$" +  val + ".00";
        
        return new QuoteStruct(origin,originDepartureTime,originFlightCarrier,des,inboundDepartureTime,inboundFlightCarrier,null,null,null,null,null,null,price);
    }
    
    public static ArrayList<QuoteStruct> getArrList(int size)
    {
        
        ArrayList<QuoteStruct> QSArry = new ArrayList<>();
        
        for (int i =0 ; i< size;i++)
        {
            QSArry.add(bulidQuote());
        }
        
        return QSArry;
    }
    
    
    
}
