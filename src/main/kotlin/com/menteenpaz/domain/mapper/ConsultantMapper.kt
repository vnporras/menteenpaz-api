package com.menteenpaz.domain.mapper

import com.menteenpaz.domain.Consultant
import com.menteenpaz.domain.dto.ConsultantDto
import com.menteenpaz.domain.enums.SexEnum


fun Consultant.toDTO(): ConsultantDto {
    return ConsultantDto(
        id = this.id,
        name = this.name,
        lastName = this.lastName,
        birthday = this.birthday,
        sex = this.sex.name
    )
}

fun ConsultantDto.toEntity(): Consultant {
    return Consultant(
        id = this.id,
        name = this.name,
        lastName = this.lastName,
        birthday = this.birthday,
        sex = SexEnum.valueOf(this.sex)
    )
}