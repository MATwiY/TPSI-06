package wizut.tpsi.springlab1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/hello")
    public String hello(Model model, String imie, Integer wiek){
        model.addAttribute("imie", imie);
        model.addAttribute("wiek", wiek);

        return "hello";
    }
}
