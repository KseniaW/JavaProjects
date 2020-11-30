package com.syntax1.class11;

public class userInfo extends userClass{
    String userAddress;


    userInfo(String name,String mobileNumber,String userAddress){
        super(name, mobileNumber);
        this.userAddress=userAddress;
    }


    void userDetails(){
        System.out.println(super.getName()+super.getMobileNumber()+userAddress);
    }



    public static void main(String[] args) {
        userInfo userInfo= new userInfo("li","766757","jsha");
    userInfo.userDetails();
    }
}
