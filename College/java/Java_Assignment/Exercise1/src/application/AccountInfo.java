package application;

public class AccountInfo { // Account Info For deposit and withdraw

    private String name;

    public AccountInfo(String name){ // constructor to get name Information from main class
        this.name = name;
    }

    public String getName(){ //get name method
        return name;
    }

    public void setName(String name){  //set name method
        this.name = name;
    }
}