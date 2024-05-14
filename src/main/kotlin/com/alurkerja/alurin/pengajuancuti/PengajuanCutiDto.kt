package com.alurkerja.alurin.pengajuancuti;

import com.alurkerja.spec.entity.BaseDto;
import lombok.Getter;
import lombok.Setter;

class PengajuanCutiDto: BaseDto<PengajuanCuti, PengajuanCutiDto>() {
    lateinit var name: String;
    lateinit var reason: String;
}
