public class methods {
    static void  checkAge(int age){
        if(age<18){
            System.out.println("A person is teenager");
        }
        else if(age < 25){
            System.out.println("A persond is perfect to be married ");
        }
        else{
            System.out.println("He or she might me married");
        }
    }
    public static void main(String [] args){
        checkAge(20);
    }
    
}
