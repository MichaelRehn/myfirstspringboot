package dk.rehn.myfirstspringboot

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @RequestMapping("/hello")
    fun sayHi(): String {
        return "Hello"
    }

}