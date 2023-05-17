package com.example.retrofit_example

data class Data(
    val ARP_SE: String, //공항 코드
    val NMS_NM: String, //소음측정국 명칭
    val NMT_DT: String, //실시간 소음 측정 시간
    val NMT_LVL: String, //소음측정 정도
    val NMT_NO: Int //소음측정국 번호
)