package pl.jg.bike_rental.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.jg.bike_rental.BikeDao;

@Controller
public class MainController {

    @Autowired
    private BikeDao bikeDaoImplementation;

    @RequestMapping ("/")
    public String index(Model model) {
        model.addAttribute("bikes", bikeDaoImplementation.getBikes());
        return "index";
    }

}
