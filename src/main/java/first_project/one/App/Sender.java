package first_project.one.App;

public class Sender {
    private String name;
    private String email;
    
    public String getName(){
        return name; 
    }

    public String getEmail(){
        return email; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Sender{" + "name" + name + "/" + ", email =" + email + "/" + "}";
    }

}
