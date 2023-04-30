package net.zazacorp.azcollection.module.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping()
public class ControllerHome {
    @GetMapping(value = "/", headers = "User-Agent!=Mobile")
    public ModelAndView homePageDesktop() {
        return new ModelAndView("homeDesktop");
    }

    @GetMapping(value = "/", headers = "User-Agent=Mobile")
    public ModelAndView homePageMobile() {
        return new ModelAndView("homeMobile");
    }
}
