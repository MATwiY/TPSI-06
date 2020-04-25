package wizut.tpsi.springlab1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


@Controller
public class CalculatorController {

    @RequestMapping("/calc")
    public String calc(Model model, Integer x, Integer y){

        model.addAttribute("x", x);
        model.addAttribute("y", y);

        int wynik = x + y;

        model.addAttribute("wynik", wynik);

        return "calc";
    }

    @RequestMapping("/calc2")
    public String calc2(Model model, Integer x, Integer y, String dzialanie){

        model.addAttribute("x", x);
        model.addAttribute("y", y);

        int wynik = 0;

        switch (dzialanie){
            case "+":
                wynik = x + y;
                break;
            case "-":
                wynik = x - y;
                break;
            case "*":
                wynik = x * y;
                break;
        }

        model.addAttribute("dzialanie", dzialanie);
        model.addAttribute("wynik", wynik);

        return "calc2";
    }

    @RequestMapping("/calc3")
    public String calc3(Model model, CalculatorForm cf){

        //model.addAttribute("x", cf.getX());
        //model.addAttribute("y", cf.getY());


        //int wynik = 0;

        switch (cf.getDzialanie()){
            case "+":
                //wynik = cf.getX() + cf.getY();
                cf.setWynik(cf.getX() + cf.getY());
                break;
            case "-":
                cf.setWynik(cf.getX() - cf.getY());
                break;
            case "*":
                cf.setWynik(cf.getX() * cf.getY());
                break;
        }

        //model.addAttribute("dzialanie", cf.getDzialanie());
        //model.addAttribute("wynik", wynik);
        model.addAttribute("calc", cf);

        return "calc3";
    }
}
