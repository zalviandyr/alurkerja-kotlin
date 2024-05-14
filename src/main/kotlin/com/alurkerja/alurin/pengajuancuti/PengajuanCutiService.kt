package com.alurkerja.alurin.pengajuancuti;

import com.alurkerja.core.service.ActivityLogService;
import com.alurkerja.core.service.BpmnService;
import com.alurkerja.core.service.CamundaProcessService;
import org.springframework.stereotype.Service;

@Service
class PengajuanCutiService(
    pengajuancutiRepository: PengajuanCutiRepository,
    private val camundaProcessService: CamundaProcessService,
    activityLogService: ActivityLogService
): BpmnService<PengajuanCuti, PengajuanCutiDto, PengajuanCutiVariable, PengajuanCutiRepository>(
    pengajuancutiRepository,
    camundaProcessService,
    activityLogService
) {
    override fun getCurrentUser(): String {
        TODO("Not yet implemented")
    }

    override fun getCurrentGroup(): String {
        TODO("Not yet implemented")
    }

    override fun getCurrentOrganization(): String {
        TODO("Not yet implemented")
    }
}
