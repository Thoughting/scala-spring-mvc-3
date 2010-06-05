package org.robertroland.scalaspringmvc3.web.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexController {
    @RequestMapping(Array("/"))
    def index = {
      "/index"
    }
}
