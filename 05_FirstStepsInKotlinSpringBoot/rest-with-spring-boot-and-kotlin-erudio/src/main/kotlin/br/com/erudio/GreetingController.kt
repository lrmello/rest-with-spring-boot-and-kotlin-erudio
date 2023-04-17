package br.com.erudio

import org.springFramework.web.bind.annotation.RestController
import org.springFramework.web.bind.annotation.RequestMapping
import org.springFramework.web.bind.annotation.RequestParam

import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    val counter: AtomicLong = AtomicLong()

    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value="name", defaultValue = "World") name:String?):Greeting{
        return Greeting(counter.incrementAndGet(),"Hello $name!")
    }
}