package com.syntax1.class06int;

public class Employees {
        int age;
        String name;
        char grade;
        Employees(){
            System.out.println("I will be called  everytime you create an object");
        }
        Employees(int ageValue, String nameValue, char characterValue) {
            System.out.println("Im not a useless constructor, im initializing your fields");
            if (ageValue > 60| ageValue<18) {
                System.out.println("Please retire or wait to be 18");
            } else {
                age = ageValue;

            }
            if(nameValue.length()>25){
                System.out.println("Please use short name");
            }else{
                name = nameValue;
                grade = characterValue;




            }
        }
        void  print(){
            System.out.println("Number "+age+ " name "+name+" character "+grade);
        }


        public static void main(String[] args) {
            Employees employees=new Employees();
            System.out.println(employees.age);
            // constructors.print();
            employees.age=200;
            employees.grade='M';
            employees.name="Davit";
            Employees employees1= new Employees(5,"Davit",'A');
            System.out.println(employees1.age);
            //Constructors
            //constructors name of the var
            //=assignment
            //new we want an object
            //Constructors()

        }

    }



