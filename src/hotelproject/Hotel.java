
package hotelproject;

import java.util.ArrayList;
import java.util.Collections;

/**
 * TA: Maggie Stewart
 * @author Cameron Courtois
 */
public class Hotel implements Comparable<Hotel>
{
    private String name;
    private int stars;
    private double googleRating;
    private double averageRoomPrice;
    
    //Creates an instance of the object Hotel, and forces the user to initialize
    // the hotel's name and star rating.
    public Hotel(String hotelName, int hotelStars)
    {
        name = hotelName;
        stars = hotelStars;
    }
    
    //Takes the specified instance of the object Hotel, and sets it's Google
    //rating given by user. 
    public void setGoogleRating(double hotelGoogleRating)
    {
        googleRating = hotelGoogleRating;
    }
    
    //Takes the specified instance of the object Hotel, and sets its average
    // room price given by user.
    public void setRoomPrice(double hotelRoomPrice)
    {
        averageRoomPrice = hotelRoomPrice;
    }
    
    //Compares the created instances of the object hotel based off of average
    // price of hotel room, then star rating if same, then google rating if same.
    @Override
    public int compareTo(Hotel other)
    {
        if(Double.compare(averageRoomPrice, other.averageRoomPrice)!= 0)
            return Double.compare(averageRoomPrice, other.averageRoomPrice);
        else if(Integer.compare(stars, other.stars)!= 0)
            return -1*Integer.compare(stars, other.stars);
        else
            return -1*Double.compare(googleRating, other.googleRating);       
    }
    
    //Returns the hotel's name, stars, averageRoomPrice, and googleRating in a String
    public String getInfo()
    {
        return String.format("%-10s%8d%7s%3.2f%8.2f\n", name, stars,"$", getAverageRoomPrice(),
        googleRating);
    }
    
    public ArrayList<room> rooms = new ArrayList<>();
    
    
    // adds rooms
    public void addRoom(room r)
    {
        rooms.add(r);
    }
    
    //adds rooms to a list and sorts them
    public void listRooms()
    {
        Collections.sort(rooms);
        String roomsInfo;
        for(room r: rooms)
        {
            roomsInfo = String.format("%s\n",r.getRoomInfo());
            System.out.print(roomsInfo);
        }
    }
    
    // calculates the total price of rooms and averages them
    public double getAverageRoomPrice()
    {
        double roomTotalPrice = 0;
        for(room r: rooms)
           roomTotalPrice += r.price;
        
        return roomTotalPrice/rooms.size();
    }
    
    
}   
    
    
            

