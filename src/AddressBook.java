import java.util.ArrayList;

public class AddressBook {
    ArrayList<BuddyInfo> buddies;
    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if(buddy != null) {
            buddies.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }
//TEST
    public BuddyInfo removeBuddyIndex(int index){
        if(index>=0 && index<buddies.size()){
            return buddies.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("Jalal","Carleton",123);

        System.out.println("Address Book:  ");

        ab.addBuddy(buddy);
        ab.removeBuddyIndex(0);


    }
}
