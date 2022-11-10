package cookbook.cookingmanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
@Entity
public class DishDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private int dishDetailsId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dish_id", referencedColumnName = "dishId")
private Dish dish ;
private String prepTime;
private String recipe;
private  String dishType;
  public  DishDetails()
  {

  }

    public DishDetails(int dishDetailsId, Dish dish , String prepTime, String recipe, String dishType) {
        this.dishDetailsId = dishDetailsId;
        this.dish= dish;
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

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public String getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(String prepTime) {
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
                ", dish=" + dish +
                ", prepTime=" + prepTime +
                ", recipe='" + recipe + '\'' +
                ", dishType='" + dishType + '\'' +
                '}';
    }
}
