package internetshop;

public class Advertising {
    private String advertiser;
    private int price;

    public Advertising(String advertiser, int price) {
        this.advertiser = advertiser;
        this.price = price;
    }

    public String getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(String advertiser) {
        this.advertiser = advertiser;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
