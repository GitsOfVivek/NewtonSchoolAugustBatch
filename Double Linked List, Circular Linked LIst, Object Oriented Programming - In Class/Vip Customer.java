// your class code goes here
class VipCustomer{
    String name;
    double creditLimit;
    String email;
    VipCustomer(){
        name="XYZ";
        creditLimit=10;
        email="xyz@abc.com";
    }
    VipCustomer(String name,double creditLimit){
        this.name=name;
        this.creditLimit=creditLimit;
        email="xyz@abc.com";
    }
    VipCustomer(String name,double creditLimit,String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
    }
    public String getName(){
        return name;
    }
    public double getCreditLimit(){
        return creditLimit;
    }
    public String getEmail(){
        return email;
    }
}
