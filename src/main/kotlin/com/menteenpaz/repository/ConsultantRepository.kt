package com.menteenpaz.repository

import com.menteenpaz.domain.Consultant
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ConsultantRepository : JpaRepository<Consultant, UUID> {
}