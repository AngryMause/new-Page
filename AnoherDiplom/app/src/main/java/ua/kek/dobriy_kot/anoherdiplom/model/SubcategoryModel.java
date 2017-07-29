package ua.kek.dobriy_kot.anoherdiplom.model;

import java.util.List;


public class SubcategoryModel  {

    private int id;
    private String nameSubcategory;
    private List<ProductModel> productModel;

    public SubcategoryModel() {
    }

    public SubcategoryModel(int id , String nameSubcategory, List<ProductModel> productModel) {
        this.id=id;
        this.nameSubcategory = nameSubcategory;
        this.productModel = productModel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
