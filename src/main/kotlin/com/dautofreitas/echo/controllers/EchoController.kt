package com.dautofreitas.echo.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class EchoController {
    @GetMapping("/echo")
    fun getEcho(@RequestParam message: String ): String
    {
        println("MESSAGE: $message")
        return message;

    }
}