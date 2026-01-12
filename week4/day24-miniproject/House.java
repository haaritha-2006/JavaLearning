/*Ravi bought a smart house.
His house has rooms, lights, doors.
Rules of house: you can open door, close door, switch lights.
The house has owner name (private), type (public), lock status (protected).
Ravi can lock/unlock the house.
We will use all OOP concepts + access modifiers + interface + abstract class.
 */
interface HouseRules {
    void opendoor();
    void closedoor();
    void switchlight(String room);
}
abstract class CommonHouse implements HouseRules{

    protected int rooms;// all houses know how many rooms
    protected boolean islocked;// door lock status

    
    public CommonHouse(int rooms){
        this.rooms=rooms;
        this.islocked=false;
    }

    // Common feature for all houses
    public switchlight(String room){
         System.out.println("Light in " + room + " switched");
    }
    public void lockHouse(){
        islocked=true;
        System.out.println("house is locked");
    }
    public void unlockHouse(){
        islocked=false;
        System.out.println("house is unlocked");
    } 
}
class smartHouse extends CommonHouse{
    private String houseOwner;
    public String houseType;

    public smartHouse(String houseOwner,int rooms){
        super(rooms);
        this.houseOwner=houseOwner;
        this.houseType="Smart";
    }

    public void opendoor(){
        if(!islocked){
            System.out.println(houseOwner+"opened the door.");
        }
        else{
            System.out.println("please unlock the door first.");
        }
    }
    public void closedoor(){
        if(islocked){
            System.out.println("door is locked already .no need to close door.");
        }
        else{
            System.out.println(houseOwner+"closed the door.")
        }
    }
    public String getownerName(){
        return houseOwner;
    }
}
public class House{
    public static void main(String[] args) {
         System.out.println("=== Ravi's Smart House Story ===");
         
         HouseRules h1=new smartHouse("Ravi",30);
         h1.switchlight("bathroom");
         h1.opendoor();
         h1.closedoor();

         smartHouse s1=new smartHouse("Arun", 30);
         s1.switchlight("bedroom");
         System.out.println("name of the owner"+s1.getownerName());
         System.out.println("type of house:"+s1.houseType);
         s1.unlockHouse();
         s1.opendoor();
         s1.lockHouse();
         s1.closedoor();
    }
}