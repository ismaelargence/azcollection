package net.zazacorp.azcollection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class OuiController {

    @GetMapping
    String getTest(Model model){
        return "oui";
    }
}
