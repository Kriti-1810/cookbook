package cookbook.cookingmanagementsystem.dao;

import cookbook.cookingmanagementsystem.entity.Dish;
import cookbook.cookingmanagementsystem.entity.DishFlavour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DishFlavourDao extends JpaRepository<DishFlavour,Integer> {
    @Query("select dn from DishFlavour dn where flavourName=?1")
    DishFlavour findByDishFlavour(String flavourName);
}
