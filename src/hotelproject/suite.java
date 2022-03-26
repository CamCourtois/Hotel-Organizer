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
public class suite extends room 
{
    private int numRoom;
    private boolean hasKitchen;
    
    //creates an instance of the class suite, an extension of the room class, 
    // and initializes its room number, price, room amount, and whether or not
    // it has a kitchen
    public suite(int roomNumber, double roomPrice, int numberOfRooms, boolean HasKitchen)
    {
        super(roomNumber, roomPrice);
        numRoom = numberOfRooms;
        hasKitchen = HasKitchen;
    }
    
    //creates a string that lists the suite number, it's price, number of rooms,
    // and whether or not it has a kitchen.
    @Override
    public String getRoomInfo()
    {
        String info = "Suite " + roomNo + "\t$" + price + "\t\t"+ numRoom + " rooms\t\t";

        if(hasKitchen)
            return info + "Kitchen" + "\n";
        else
            return info + "No Kitchen" + "\n";
    }
    
}
