
public class Customer {
    String name, lastName, tlf;
    
    public Customer(String name, String lastName,String tlf){
        this.name= name;
        this.lastName= lastName;
        this.tlf = tlf;
    }
    
    public String getName(){
        return name;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getTlf(){
        return tlf;
    }
}
