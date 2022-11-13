package cookbook.cookingmanagementsystem.controller;


import cookbook.cookingmanagementsystem.entity.DishFlavour;
import cookbook.cookingmanagementsystem.services.DishFlavourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin("*")
public class DishFlavourController {


    @Autowired
    DishFlavourService dishFlavourService;

    @GetMapping(path = "getdishflavours")
    public List<DishFlavour> getDishFlavours() {
        List<DishFlavour> lc = dishFlavourService.viewAllDishFlavour();
        return lc;
    }

    @GetMapping(path = "getdishflavour/{dishFlavourId}")
    public DishFlavour viewDishFlavour(@PathVariable int dishFlavourId) {
        DishFlavour c = dishFlavourService.viewDishFlavour(dishFlavourId);

        return c;

    }
    @DeleteMapping(path="/deletedishflavour/{dishFlavourId}") // variable name
    public void deleteDishFlavour(@PathVariable Integer dishFlavourId)
    {
        dishFlavourService.deleteDishFlavour(dishFlavourId);

    }
    @PostMapping("adddishflavour")
    public DishFlavour addDishFlavour(@RequestBody DishFlavour d)
    {
        DishFlavour d1=dishFlavourService.addDishFlavour(d);

        return d1;

    }
    @PutMapping(path="/updatedishflavour")
    public DishFlavour modifyDishFlavour(@RequestBody DishFlavour d)
    {
        DishFlavour d1=dishFlavourService.modifyDishFlavour(d);


        return d1;
    }
}

