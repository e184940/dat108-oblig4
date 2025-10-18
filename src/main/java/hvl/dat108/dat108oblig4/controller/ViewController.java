package hvl.dat108.dat108oblig4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {

    @GetMapping({"/", "/paamelding"})
    public String paamelding() {
        return "paamelding"; // /WEB-INF/jsp/paamelding.jsp
    }

    @GetMapping("/deltagerliste")
    public String deltagerliste(Model model) {
        return "deltagerliste"; // /WEB-INF/jsp/deltagerliste.jsp
    }

    @GetMapping("/paameldt")
    public String paameldt() {
        return "paameldt";
    }


}