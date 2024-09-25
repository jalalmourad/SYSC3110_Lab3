public class BuddyInfo {
    String name;
    String Address;
    int phoneNumber;

//Constructor for class BuddyInfo
    public BuddyInfo(String name, String Address, int phoneNumber) {
        this.name = name;
        this.Address = Address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo(){
        name = "Jalal";
        Address = "222 Address";
        phoneNumber = 11111;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }




    public static void main(String[] args) {

        BuddyInfo buddy = new BuddyInfo("Homer","100 Kibi cres", 2222222);
        System.out.println("Hello "+ buddy.getName());
        System.out.println("Hello world!");
    }
}
