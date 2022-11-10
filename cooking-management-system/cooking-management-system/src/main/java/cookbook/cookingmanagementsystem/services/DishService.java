package cookbook.cookingmanagementsystem.services;

import cookbook.cookingmanagementsystem.entity.Dish;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DishService {
    public Dish addDish(Dish dish);
    public Dish viewDish(Integer dishId);
    public List<Dish> viewAllDish();
    public Dish modifyDish(Dish dish);
    public void deleteDish(Integer dishId);
}
