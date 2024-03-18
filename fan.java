class fan{
    //properties

    int NoOffins = 3;
    String Brand;
    String ModelNumber;
    String Speed;
    //String Speed;
    boolean State;

    //constructor
    fan() {} //default constructor
    fan(int _NoOffins, String _brand){
        this.NoOffins = _NoOffins;
        this.Brand = _brand;
        this.State = false; //Off
    }

    //methods
    public String getBrand(){
        return this.Brand;
    }

    public boolean getState(){
        return this.State;
    }

    //setter
    public void setBrand(String _brand){
        this.Brand = _brand;
    }

    
    //user defined method
    public void SwitchOn() { this.State = true;}
    public void SwitchOff() { this.State = false;}

    //main method
    public static void main(String[] args) {
        fan fanObj = new fan();
        fan fanObj2 = new fan( 4, "LG");
        System.out.println("Fan of " + fanObj2.Brand + "is created");
        fanObj2.SwitchOn();
        System.out.println("State of Fan is " + (fanObj2.getState()== true ? "ON" : "OFF"));
        fanObj2.SwitchOff();
    }

}