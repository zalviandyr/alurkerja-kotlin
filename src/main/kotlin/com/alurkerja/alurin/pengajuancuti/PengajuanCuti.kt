package com.alurkerja.alurin.pengajuancuti;

import com.alurkerja.core.entity.BpmnEntity;
import jakarta.persistence.MappedSuperclass

@MappedSuperclass
data class PengajuanCuti(
    var name: String,
    var reason: String,
): BpmnEntity()
