package cookbook.cookingmanagementsystem.dao;

import cookbook.cookingmanagementsystem.entity.Dish;
import cookbook.cookingmanagementsystem.entity.DishDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface DishDetailsDao extends JpaRepository<DishDetails,Integer> {
    //@Query("select dn from DishDetails dn where Date prepTime=?1")
   // DishDetails findByPrepTime(Date prepTime);

   // @Query("select dn from DishDetails dn where recipe=?1")
    //DishDetails  findByRecipe(String recipe);

    //@Query("select dn from DishDetails dn where dishType=?1")
   // DishDetails findByDishType(String dishType);
}
