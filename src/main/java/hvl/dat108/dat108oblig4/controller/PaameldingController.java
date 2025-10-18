package hvl.dat108.dat108oblig4.controller;

import hvl.dat108.dat108oblig4.model.Bruker;
import hvl.dat108.dat108oblig4.service.DeltagerService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PaameldingController {

    private final DeltagerService deltagerService;

    public PaameldingController(DeltagerService deltagerService) {
        this.deltagerService = deltagerService;
    }

    @GetMapping({"/paamelding"})
    public String visSkjema(Model model){
        if(!model.containsAttribute("bruker")){
            model.addAttribute("bruker", new Bruker());
        }
        return "paamelding";
    }

    @PostMapping("/paamelding")
    public String sendInn(@Valid @ModelAttribute("bruker") Bruker bruker,
                          BindingResult bindingResult,
                          RedirectAttributes ra){
        if(bindingResult.hasErrors()){
            return "paamelding";
        }

        ra.addFlashAttribute("fornavn", bruker.getFornavn());
        return "redirect:/paameldt";
    }

    @GetMapping("/paameldt")
    public String bekreftelse(){
        return "paameldt";
    }

}
