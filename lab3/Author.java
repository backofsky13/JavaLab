package lab3;
public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }
    public String getName(String name){
        return name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return ("Author " + this.name + " (" + this.gender + ")" + " at " + this.email);
    }
}