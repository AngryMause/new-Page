package ua.kek.dobriy_kot.diplomwork.models;


public class ShopModel  {

    private int id;
    private int nameShop;
    private double price;
    private String linkShop;

    public ShopModel() {
    }

    public ShopModel(int nameShop, double price, String linkShop) {
        this.nameShop = nameShop;
//        this.ratingShop = ratingProduct;
        this.price = price;
        this.linkShop = linkShop;
    }

    public int getNameShop() {
        return nameShop;
    }

    public void setNameShop(int name) {
        nameShop = nameShop;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLinkShop() {
        return linkShop;
    }

    public void setLinkShop(String linkShop) {
        this.linkShop = linkShop;
    }
}
