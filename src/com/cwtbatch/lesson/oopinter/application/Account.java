package com.cwtbatch.lesson.oopinter.application;
class Location{
    String cityName;
    String streetName;
    int homeNo;

    public Location(String cityName, String streetName, int homeNo) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.homeNo = homeNo;
    }
}
class User{
    int id;
    String name;
    Location location;

    public User(int id, String name, Location location) {
        this.id = id;
        this.name = name;
       this.location= location;
    }
    void show(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(location.cityName);
        System.out.println(location.streetName);
        System.out.println(location.homeNo);
    }
}



public class Account {
    public static void main(String[] args) {
        Location location = new Location("Yangon","ZarTi",12);
        User user1 = new User(1,"Mg",location);
        user1.show();
        User user2 = new User(2,"Su",new Location("Mdy","Yal",13));
        user2.show();

    }

}

