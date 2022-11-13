package cookbook.cookingmanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
@Entity
public class DishDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dishDetailsId;

    private Double prepTime;

    private String recipe;

    private  String dishType;

    public  DishDetails()
    {

    }

    public DishDetails(int dishDetailsId, Double prepTime, String recipe, String dishType) {
        this.dishDetailsId = dishDetailsId;
        this.prepTime = prepTime;
        this.recipe = recipe;
        this.dishType = dishType;
    }

    public int getDishDetailsId() {
        return dishDetailsId;
    }

    public void setDishDetailsId(int dishDetailsId) {
        this.dishDetailsId = dishDetailsId;
    }



    public Double getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Double prepTime) {
        this.prepTime = prepTime;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getDishType() {
        return dishType;
    }

    public void setDishType(String dishType) {
        this.dishType = dishType;
    }

    @Override
    public String toString() {
        return "DishDetails{" +
                "dishDetailsId=" + dishDetailsId +
                ", prepTime=" + prepTime +
                ", recipe='" + recipe + '\'' +
                ", dishType='" + dishType + '\'' +
                '}';
    }
}
