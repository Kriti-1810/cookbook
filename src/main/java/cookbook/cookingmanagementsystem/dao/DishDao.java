package cookbook.cookingmanagementsystem.dao;

import cookbook.cookingmanagementsystem.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface DishDao extends JpaRepository<Dish,Integer> {
    /*public Dish addDish(Dish dish);

    public Dish viewDish(Integer dishId);

    public List<Dish> viewAllDish();

    public Dish modifyDish(Dish dish);

    public void deleteDish(Integer dishId);
*/

    // Optional<Dish> get(int dishId);

    // List<Dish> getAll();

    //void save(T t);

    //void update(T t, String[] params);

    //void delete(T t);
    // @Query("select dn from Dish dn where dishName=?1")
    //Dish findByDishName(String dishName);


    // @Query("select dn from Dish dn where dateOfCooking=?1")
    // Dish findByDateOfCooking(Date dateOfCooking);

}


