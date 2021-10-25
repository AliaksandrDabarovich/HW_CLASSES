package internetshop;

import java.util.List;

public class Catalog {
    private List<Product> productList;
    private List<Advertising> advertisingList;

    public Catalog(List<Product> productList, List<Advertising> advertisingList) {
        this.productList = productList;
        this.advertisingList = advertisingList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Advertising> getAdvertisingList() {
        return advertisingList;
    }

    public void setAdvertisingList(List<Advertising> advertisingList) {
        this.advertisingList = advertisingList;
    }
}
