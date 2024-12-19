import java.util.Scanner;

class Password{
    String x;
    Password(String x){
        this.x=x;
    }
    boolean PassLength(){
        if (x.length()>=8)
            return true;
        else
            return false;}

    boolean PassUpper(){
        return x.matches(".*[A-Z].*");}
    boolean PassLower(){
        return x.matches(".*[a-z].*");
    }
    boolean PassNum(){
        return x.matches(".*[0-9].*");
    }
    boolean PassSpecial(){
        return x.matches(".*[^a-zA-Z0-9].*");
    }
}
public class PasswordTester {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int f=0, count = 0;
        while(f==0) {
            System.out.println("Enter password:");
            Password p = new Password(s.nextLine());
            count = 0;

            if (p.PassLength()){
                count += p.x.length() - 8;
                f=1;}
            else {
                System.out.println("Password not long enough. Password should more than 8 characters.Re-enter");
                f=0;
                continue;
            }if (p.PassUpper()){
                count += 1;
                f=1;}
            else {
                System.out.println("Password should contain atleast one uppercase character.");
                f=0;
                continue;
            }if (p.PassLower()){
                count += 1;
                f=1;}
            else {
                System.out.println("Password should contain atleast one lowercase character.");
                f=0;
                continue;
            }if (p.PassNum()){
                count += 1;
                f=1;}
            else {
                System.out.println("Password should contain atleast one numerical value.");
                f=0;
                continue;
            }if (p.PassSpecial()){
                count += 1;
                f=1;}
            else {
                System.out.println("Password should contain atleast one special charater.");
                f=0;
            }}
        if (count>8){
            System.out.println("Password strong.Good to go.");}
        else if (3<count && count<8) {
            System.out.println("Password mid.But good to go.");}
                
    }
}
