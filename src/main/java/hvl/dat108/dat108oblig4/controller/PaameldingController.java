package hvl.dat108.dat108oblig4.controller;

import hvl.dat108.dat108oblig4.model.Bruker;
import hvl.dat108.dat108oblig4.service.DeltagerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PaameldingController {

    private final DeltagerService deltagerService;

    public PaameldingController(DeltagerService deltagerService) {
        this.deltagerService = deltagerService;
    }

    @GetMapping({"/", "/paamelding"})
    public String visSkjema(Model model){
        if(!model.containsAttribute("bruker")){
            model.addAttribute("bruker", new Bruker());
        }
        return "paamelding";
    }


}
