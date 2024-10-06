package com.menteenpaz.service

import com.menteenpaz.domain.dto.ConsultantDto
import com.menteenpaz.domain.mapper.toDTO
import com.menteenpaz.domain.mapper.toEntity
import com.menteenpaz.repository.ConsultantRepository
import org.springframework.stereotype.Service

@Service
class ConsultantService(
    private val consultantRepository: ConsultantRepository
) {

    fun createConsultant(consultantDto: ConsultantDto): ConsultantDto {
        val response = consultantRepository.save(consultantDto.toEntity())
        return response.toDTO()
    }
}