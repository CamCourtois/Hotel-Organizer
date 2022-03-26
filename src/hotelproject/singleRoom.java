/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelproject;

/**
 *
 * @author cameroncourtois
 */
public class singleRoom extends room 
{
    private String bedType;
    private boolean smoking;
    
    //creates an instance of the class singleRoom and initializes the bed size, 
    // smoking tolerance, room number, and room price 
    public singleRoom(int roomNumber, double roomPrice, String bedSize, boolean smokingTolerance)
    {
        super(roomNumber, roomPrice);
        bedType = bedSize;
        smoking = smokingTolerance;
    }
    
    //returns a string listing the room number, its price, size, and smoking
    //in that order. 
    @Override
    public String getRoomInfo() 
    {
        String info = "Room " + roomNo + "\t$" + price + "\t\t"+ bedType + "\t\t";
    if(smoking)
        return info + "Smoking" + "\n";
    else
        return info + "No Smoking" + "\n";
    }
    
    
    
}
