import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership>members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        members=new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    public int joinedInMonth(int month){
        if (month <1 || month > 12){
            System.out.println("Error: Month must be between 1 and 12. Provided:" + month);
            return 0;
        }
        int count = 0;
        for (Membership member: members){
            if(member.getMonth() == month) {
                count++;
            }
        }
        return count;
        }
       public ArrayList<Membership> purge(int month, int year) {
            ArrayList<Membership> purgedMembers = new ArrayList<>();
        if(month <1 || month > 12){
            System.out.println("Error: Month must be between 1 and 12. Provided:" +month);
            return purgedMembers;
        }
        Iterator<Membership> it = members.iterator();
        while(it.hasNext()){
            Membership member = it.next();
            if(member.getMonth() == month && member.getYear() == year){
                purgedMembers.add(member);
                it.remove();
            }
        }
        return purgedMembers;
        
    }
}
