import java.util.ArrayList;

public class Kid extends Being {

    String code;
    String birthday;
    String name;
    ArrayList <Product> productList;
    String birthPlace;


    public Kid(String code, String birthday, String name, ArrayList<Product> productList, String birthPlace) {

        this.birthday = birthday;
        this.name = name;
        this.productList = productList;
        this.birthPlace = birthPlace;
    }

    public String getCode() {
        return code;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
}
