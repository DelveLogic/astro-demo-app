package com.example.astrodashalib.model

import com.google.gson.annotations.SerializedName

import java.util.ArrayList

class HoroscopeRequestBody(@field:SerializedName("kpChart")
                           var kpChartList: ArrayList<KPChart>, @field:SerializedName("onlineResult")
                           var onlineResult: String, @field:SerializedName("paramForPerskv")
                           var paramForPerskv: String )
