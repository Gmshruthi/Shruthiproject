package Git.src.practise;

public class Address {
    String addressLine1;
    String addressLine2;
    String city;
    String state;
    String pincode;
    public Address(String addressLine,String addressLine2,String city,String pincode,String state){
        this.addressLine1=addressLine;
        this.addressLine2=addressLine2;
        this.pincode=pincode;
        this.city=city;
        this.state=state;
    }
    @Override
    public String toString(){
        return addressLine1+addressLine2+city+pincode+state;
    }

}
