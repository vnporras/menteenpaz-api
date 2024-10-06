package com.menteenpaz.controller

import com.menteenpaz.domain.dto.ConsultantDto
import com.menteenpaz.service.ConsultantService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ConsultantController(
    private val consultantService: ConsultantService
) {

    @PostMapping("/consultants")
    fun createConsultant(@RequestBody consultantDto: ConsultantDto): ResponseEntity<ConsultantDto> {
        return ResponseEntity(consultantService.createConsultant(consultantDto), HttpStatus.CREATED)
    }

    @GetMapping("/consultants")
    fun getConsultants(): ResponseEntity<List<ConsultantDto>> {
        return ResponseEntity(consultantService.getConsultants(), HttpStatus.OK)
    }
}