package com.alurkerja.alurin.pengajuancuti;

import com.alurkerja.core.controller.BpmnController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bpmn/PengajuanCuti")
class PengajuanCutiController(
    pengajuanCutiService: PengajuanCutiService
): BpmnController<PengajuanCuti, PengajuanCutiDto, PengajuanCutiVariable, PengajuanCutiService>(
    pengajuanCutiService)
