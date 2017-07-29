package ua.kek.dobriy_kot.diplomwork.models;

import java.util.List;


public class CategoryModel {

    private int id;
    private String nameCategory;
    private List<SubcategoryModel> subcategoryModels;

    public CategoryModel() {
    }

    public CategoryModel(String nameCategory, List<SubcategoryModel> subcategoryModels) {
        this.nameCategory = nameCategory;
        this.subcategoryModels = subcategoryModels;
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
