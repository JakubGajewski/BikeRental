package pl.jg.bike_rental.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.jg.bike_rental.BikeDao;
import pl.jg.bike_rental.domain.Bike;
import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    private BikeDao bikeDaoImplementation;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("bikes", bikeDaoImplementation.getBikes());
        return "index";
    }

    @RequestMapping(value = "/addBike", method = RequestMethod.GET)
    public String getAddBike(@ModelAttribute("bikeForm") BikeForm bikeForm) {
        return "add_bike";
    }

    @RequestMapping(value = "/addBike", method = RequestMethod.POST)
    public String postAddBike(@ModelAttribute("bikeForm") @Valid BikeForm bikeForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            //TODO: display error message to the user!
            return "redirect:/error";
        }
        Bike bike = new Bike();
        bike.setBikeType(bikeForm.getBikeType());
        bike.setModel(bikeForm.getModel());
        bike.setBikeSize(bikeForm.getBikeSize());
        bike.setRented(false);
        bikeDaoImplementation.addBike(bike);
        return "redirect:/";
    }

    @RequestMapping("/error")
    public String error() {
        return "error";
    }
}
