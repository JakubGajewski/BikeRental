package pl.jg.bike_rental.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.jg.bike_rental.application.BikeDao;
import pl.jg.bike_rental.application.RentDao;
import pl.jg.bike_rental.domain.Bike;
import pl.jg.bike_rental.domain.Rent;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    private BikeDao bikeDaoImplementation;

    @Autowired
    private RentDao rentDaoImplementation;

    @RequestMapping("/")
    public String index (Model model) {
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
        System.out.println(bikeForm.getDupa());
        Bike bike = new Bike();
        bike.setBikeType(bikeForm.getBikeType());
        bike.setModel(bikeForm.getModel());
        bike.setBikeSize(bikeForm.getBikeSize());
        bike.setRented(false);
        bikeDaoImplementation.addBike(bike);
        return "redirect:/";
    }

    @RequestMapping(value="/addRent", method = RequestMethod.GET)
    public String getAddRent(@ModelAttribute("rentForm") RentForm rentForm) {
        return "add_rent";
    }

    @RequestMapping(value="/addRent", method = RequestMethod.POST)
    public String postAddRent(@ModelAttribute("rentForm") @Valid RentForm rentForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {

            //TODO: display error message to the user!
            return "redirect:/error";
        }
        Rent rent = new Rent();
        rent.setFrom(rentForm.getFrom());
        rent.setTo(rentForm.getTo());
        rentDaoImplementation.addRent(rent);
        System.out.println(rent);
        return "redirect:/";
    }

    @RequestMapping("/error")
    public String error() {
        return "error";
    }


    @RequestMapping("/changeRent/{bikeId}")
    public String changeRent(@PathVariable("bikeId") String stringBikeId) {
        try {
            int intBikeId = Integer.parseInt(stringBikeId);
            bikeDaoImplementation.changeRented(intBikeId);
        } catch (NumberFormatException nFE) {
            return "redirect:/error";
        }
        return "redirect:/";
    }

    @RequestMapping("/deleteBike/{bikeId}")
    public String deleteBike(@PathVariable("bikeId") String stringBikeId) {
        try {
            int intBikeId = Integer.parseInt(stringBikeId);
            bikeDaoImplementation.deleteBike(intBikeId);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return "redirect:/error";
        } catch (InvalidDataAccessApiUsageException e) {
            e.printStackTrace();
            return "redirect:/error";
        }
        return "redirect:/";
    }
}