package ua.kek.dobriy_kot.anoherdiplom.model;


public class ShopModel  {

    private int id;
    private int nameShop;
    private double price;
    private String linkShop;

    public ShopModel() {
    }

    public ShopModel(int id, int nameShop, double price, String linkShop) {
        this.id=id;
        this.nameShop = nameShop;
        this.price = price;
        this.linkShop = linkShop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
