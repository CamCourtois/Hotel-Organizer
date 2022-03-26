
package hotelproject;

/**
 * TA: Maggie Stewart
 * Author Cameron Courtois
 */
public class room implements Comparable<room>
{
    public int roomNo;
    public double price;
    
    //creates a default instance of the class room
    public room()
    {
        
    }
    
    //creates an instance of the class room and initializes a room number & price
    public room(int roomNumber, double roomPrice)
    {
        roomNo = roomNumber;
        price = roomPrice;   
    }
    
    //takes the roomPrice and sets it to user input
    public void setPrice(double roomPrice)
    {
        price = roomPrice;
    }
    
    //returns an empty string
    public String getRoomInfo()
    {
        return String.format("");
    }
    
    // compares the price of one room to another and orders them from least to high
    @Override
    public int compareTo(room other)
    {
        return Double.compare(price, other.price);
    }
}
