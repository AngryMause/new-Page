package ua.kek.dobriy_kot.diplomwork.models;

import java.util.List;



public class SubcategoryModel  {

    private int id;
    private String nameSubcategory;
    private List<ProductModel> productModel;

    public SubcategoryModel() {
    }

    public SubcategoryModel(String nameSubcategory, List<ProductModel> productModel) {
        this.nameSubcategory = nameSubcategory;
        this.productModel = productModel;
    }


    public String getNameSubcategory() {
        return nameSubcategory;
    }

    public void setNameSubcategory(String nameSubcategory) {
        this.nameSubcategory = nameSubcategory;
    }

    public List<ProductModel> getProductModel() {
        return productModel;
    }

    public void setProductModel(List<ProductModel> productModel) {
        this.productModel = productModel;
    }
}
