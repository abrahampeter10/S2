import java.util.*;

class nameException extends RuntimeException{

    nameException(String s){
        super(s);
    }
}

class passwordException extends RuntimeException{

    passwordException(String s){
        super(s);
    }
}

class Login{
    String password, name;
    Login(String name1, String password1){
        this.name=name1;
        this.password=password1;
    }

        void LoginCheck(String name1,String password1){
            try{
                if(password.equals(password1) && name.equals(name1)){
                       System.out.print("!!! LOGIN SUCCESFULL !!!");
 
                }else{
                    throw new passwordException("Login Failed");
                }

            }
            catch(passwordException e){
                System.out.print(e.getMessage());
                System.exit(0);

            }
        }
}

class UserValidation2{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter name to register: ");
    String name=sc.next();

    try{
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(!Character.isLetter(ch))
                throw new nameException("Invalid Name format");
            
        }
    }

    catch(nameException e){
        System.out.println(e.getMessage());
        System.exit(0);
    }

    System.out.print("Enter password to register: ");
    String password = sc.next();
    try{
        if(password.length()<8)
        throw new passwordException("Length less than 8");
        int flag=0;
        for(int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            if(Character.isDigit(ch)){
            flag=1;
            break;
            }
        }
        if(flag==0)
        throw new passwordException("No Number found");
    }

    catch(passwordException e){
        System.out.println(e.getMessage());
        System.exit(0);
    }

    Login user = new Login(name,password);
    System.out.print("Enter name to login: ");
    String name1=sc.next();
    System.out.print("Enter password to login: ");
    String password1=sc.next();
    user.LoginCheck(name1,password1);

        }
}