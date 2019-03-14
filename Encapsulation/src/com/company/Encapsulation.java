package com.company;




class  Person {
   public String name;

   // Getter
   public String getName() {
     return name;
   }

   // Setter
   public void setName(String newName) {
     this.name = newName;
   }
}


     class  Main {
        public static void main(String[] args) {
            Person myObj = new Person();
            myObj.name = "John";
            System.out.println(myObj.name);
        }
    }
