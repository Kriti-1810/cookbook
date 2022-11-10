package cookbook.cookingmanagementsystem.controller;

import cookbook.cookingmanagementsystem.entity.DishDetails;
import cookbook.cookingmanagementsystem.services.DishDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("api")
    public class DishDetailsController {


        @Autowired
        DishDetailsService dishDetailsService;

        @GetMapping(path = "getdishdetails")
        public List<DishDetails> viewAllDishDetails() {
            List<DishDetails> lc = dishDetailsService.viewAllDishDetails();
            return lc;
        }

        @GetMapping(path = "getdishdetail/{dishDetailsId}")
        public DishDetails viewDishDetails(@PathVariable int dishDetailsId) {
            DishDetails c = dishDetailsService.viewDishDetails(dishDetailsId);

            return c;

        }
        @DeleteMapping(path="/deletedishDetail/{dishDetailId}") // variable name
        public void deleteDishDetails(@PathVariable Integer dishDetailId)
        {
            dishDetailsService.deleteDishDetails(dishDetailId);

        }
        @PostMapping("adddishdetail")
        public DishDetails addDishDetails(@RequestBody DishDetails d)
        {
            DishDetails d1=dishDetailsService.addDishDetails(d);

            return d1;

        }
        @PutMapping(path="/updatedishdetail")
        public DishDetails modifyDishDetails(@RequestBody DishDetails d)
        {
            DishDetails d1=dishDetailsService.modifyDishDetails(d);


            return d1;
        }
}
