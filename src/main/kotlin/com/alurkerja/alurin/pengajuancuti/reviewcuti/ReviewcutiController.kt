package com.alurkerja.alurin.pengajuancuti.reviewcuti;

import com.alurkerja.core.controller.UserTaskController;
import com.alurkerja.alurin.pengajuancuti.PengajuanCuti;
import com.alurkerja.alurin.pengajuancuti.PengajuanCutiRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bpmn/PengajuanCuti/reviewCuti")
class ReviewcutiController(
    reviewcutiService: ReviewcutiService
): UserTaskController<PengajuanCuti, ReviewcutiDto, ReviewcutiVariable, ReviewcutiService>(
    reviewcutiService, "reviewCuti"
)
