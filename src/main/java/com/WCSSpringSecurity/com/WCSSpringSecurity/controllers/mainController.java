package com.WCSSpringSecurity.com.WCSSpringSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    @GetMapping("/")
    public String hello() {
        return "Welcome tp the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String assemble() {
        return "Avengers... Asemble";
    }

    @GetMapping("/secret-bases")
    public String fury() {
        return "Biarritz, Bordeaux, La Loupe, Lille, Lyon, Marseille, Nantes, Orléans, Paris, Reims, " +
        "Strasbourg, Toulouse, Tours, Amsterdam, Barcelone, Berlin, Bruxelles, Bucarest, Budapest" +
                "Dublin, Lisbonne, Londres, Madrid, Milan";
    }
}
