import java.util.Date;

public class GoldenTicket {

    boolean isRaffled;
    Date raffleDate;
    String serialNo;

    //Constructors:

    GoldenTicket(){}

    GoldenTicket(String code, Date raffled){}

    // Getters and Setters

    public boolean getRaffled(){
        return isRaffled();
    }

    public void setRaffled(boolean raffelStatus){
        this.isRaffled = raffelStatus;
    }

    public Date getRaffleDate() {
        return raffleDate;
    }

    public void setRaffleDate(Date raffleDate) {
        this.raffleDate = raffleDate;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getSerialNo() {
        return serialNo;
    }

    // If the current ticket has been already raffled

    boolean isRaffled(){
        return false;
    }
}