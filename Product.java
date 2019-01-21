
public class Product {
    String desctription;
    long barcode;
    String serialNumber;
    GoldenTicket prizeticket;


    public Product(String desctription, long barcode, String serialNumber, GoldenTicket prizeticket) {
        this.desctription = desctription;
        this.barcode = barcode;
        this.serialNumber = serialNumber;
        this.prizeticket = prizeticket;
    }

    public String getDesctription() {
        return desctription;
    }

    public void setDesctription(String desctription) {
        this.desctription = desctription;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public GoldenTicket getPrizeticket() {
        return prizeticket;
    }

    public void setPrizeticket(GoldenTicket prizeticket) {
        this.prizeticket = prizeticket;
    }
}
