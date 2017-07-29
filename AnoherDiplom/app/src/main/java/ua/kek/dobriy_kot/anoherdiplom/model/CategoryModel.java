package ua.kek.dobriy_kot.anoherdiplom.model;

import java.util.List;


public class CategoryModel {

    private int id;
    private String nameCategory;
    private List<SubcategoryModel> subcategoryModels;

    public CategoryModel() {
    }

    public CategoryModel(int id, String nameCategory, List<SubcategoryModel> subcategoryModels) {
        this.id = id;
        this.nameCategory = nameCategory;
        this.subcategoryModels = subcategoryModels;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<SubcategoryModel> getSubcategoryModels() {
        return subcategoryModels;
    }

    public void setSubcategoryModels(List<SubcategoryModel> subcategoryModels) {
        this.subcategoryModels = subcategoryModels;
    }
}
