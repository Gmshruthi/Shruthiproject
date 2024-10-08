package Git.src.practise;

public class Address {
    String addressLine1;
    String addressLine2;
    String pincode;
    public Address(String addressLine,String addressLine2,String pincode){
        this.addressLine1=addressLine;
        this.addressLine2=addressLine2;
        this.pincode=pincode;
    }
    @Override
    public String toString(){
        return addressLine1+addressLine2+pincode;
    }

}
