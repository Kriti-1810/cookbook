package cookbook.cookingmanagementsystem.services;

import cookbook.cookingmanagementsystem.entity.Dish;
import cookbook.cookingmanagementsystem.entity.DishDetails;
import cookbook.cookingmanagementsystem.entity.DishFlavour;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public interface DishService {
    public Dish addDish(Dish dish);
    public Dish viewDish(Integer dishId);
    public List<Dish> viewAllDish();
    public Dish modifyDish(Dish dish);
    public void deleteDish(Integer dishId);
    public Dish addDishFlavourToDish(Integer dishId, DishFlavour dishFlavour);
    public Dish addDishDetailToDish(Integer dishId, DishDetails dishDetails);
}
