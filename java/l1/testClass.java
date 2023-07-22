public class testClass {
      public static void main(String[] args) {        
          stud student = new stud();
          student.rollNumber=10;
          System.out.println(student.rollNumber);
          student.greeting();
          student.changeName("must");
          System.out.println(student.name);
          
      }

      
    }
    
    
    class stud{
        int rollNumber;
        int phoneNumber;
        String name;  
        
        void greeting (){
          System.out.println("hello " + this.name);
        }

        void changeName(String name){
            this.name=name;
        }

    stud(){
        this.rollNumber=12;
        this.phoneNumber=100;
        this.name="adarsh";

    }
}