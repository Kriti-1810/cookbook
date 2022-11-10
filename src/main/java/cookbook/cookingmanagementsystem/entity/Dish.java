package cookbook.cookingmanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="dish")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int dishId;

    @OneToOne(mappedBy = "dish")
    private DishDetails dishDetails;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="dishflavourid",referencedColumnName="dishFlavourId")
   private  DishFlavour dishFlavour;

    @Column(name="dish_name")
    private String dishName;

    @Column(name="date_of_cooking")
    @JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
    private Date dateOfCooking;



    public  Dish()
    {

    }
    public Dish(int dishId,DishDetails dishDetails,DishFlavour dishFlavour, String dishName, Date dateOfCooking) {
        this.dishId=dishId;
        this.dishDetails=dishDetails;
        this.dishFlavour=dishFlavour;
        this.dishName=dishName;
        this.dateOfCooking=dateOfCooking;

    }

    public DishFlavour getDishFlavour() {
        return dishFlavour;
    }

    public void setDishFlavour(DishFlavour dishFlavour) {
        this.dishFlavour = dishFlavour;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public DishDetails getDishDetails() {
        return dishDetails;
    }

    public void setDishDetails(DishDetails dishDetails) {
        this.dishDetails = dishDetails;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Date getDateOfCooking() {
        return dateOfCooking;
    }

    public void setDateOfCooking(Date dateOfCooking) {
        this.dateOfCooking = dateOfCooking;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishId=" + dishId +
                ", dishDetails=" + dishDetails +
                ", dishFlavour=" + dishFlavour +
                ", dishName='" + dishName + '\'' +
                ", dateOfCooking=" + dateOfCooking +
                '}';
    }
}
