package com.SuperHeroSquadInterfaceNoDataOpen.SuperHeroSquadInterfaceNoDataOpen.controller;

import com.SuperHeroSquadInterfaceNoDataOpen.SuperHeroSquadInterfaceNoDataOpen.service.FormedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FormedController {
    @Autowired
    private FormedService userService;


}
