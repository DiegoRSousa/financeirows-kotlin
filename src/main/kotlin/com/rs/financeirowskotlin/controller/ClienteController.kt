package com.rs.financeirowskotlin.controller

import com.rs.financeirowskotlin.model.Cliente
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("clientes")
class ClienteController {

    @GetMapping
    fun list() : List<Cliente> {
        return listOf(Cliente(1, "Diego", "8399999999", "diegors90@gmail.com"))

    }
}