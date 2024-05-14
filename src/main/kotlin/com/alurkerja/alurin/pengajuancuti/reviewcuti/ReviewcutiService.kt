package com.alurkerja.alurin.pengajuancuti.reviewcuti;

import com.alurkerja.core.service.ActivityLogService;
import com.alurkerja.core.service.BpmnService;
import com.alurkerja.core.service.CamundaProcessService;
import com.alurkerja.alurin.pengajuancuti.PengajuanCuti;
import com.alurkerja.alurin.pengajuancuti.PengajuanCutiRepository;
import org.springframework.stereotype.Service;

@Service
class ReviewcutiService(
    pengajuanCutiRepository: PengajuanCutiRepository,
    camundaProcessService: CamundaProcessService,
    activityLogService: ActivityLogService,
): BpmnService<PengajuanCuti, ReviewcutiDto, ReviewcutiVariable, PengajuanCutiRepository>(
    pengajuanCutiRepository,
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
