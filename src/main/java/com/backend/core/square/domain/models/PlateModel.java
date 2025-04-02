
package com.backend.core.square.domain.models;

public class PlateModel {

    private Long id;
    private String name;
    private String description;
    private Long price;
    private Boolean enable;
    private String urlImage;
    private CategoryModel category;
    private RestaurantModel restaurant;
    
    public PlateModel() {
    }

    public PlateModel(Long id, String name, String description, Long price, Boolean enable, String urlImage,
            CategoryModel category, RestaurantModel restaurant) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.enable = enable;
        this.urlImage = urlImage;
        this.category = category;
        this.restaurant = restaurant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public CategoryModel getCategory() {
        return category;
    }

    public void setCategory(CategoryModel category) {
        this.category = category;
    }

    public RestaurantModel getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(RestaurantModel restaurant) {
        this.restaurant = restaurant;
    }

}


