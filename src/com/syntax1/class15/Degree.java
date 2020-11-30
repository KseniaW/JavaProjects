package com.syntax1.class15;

 class Degree {
    void getPrequisite(){
        System.out.println("you need school diploma");
    }

}
class Bachelors extends Degree{


}
class Masters extends Degree{
    void getPrequisite(){
        System.out.println("you need bachelors diploma");
    }
}
class ClassTask1{
    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrequisite();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrequisite();
        Masters masters=new Masters();
        masters.getPrequisite();

    }
}

