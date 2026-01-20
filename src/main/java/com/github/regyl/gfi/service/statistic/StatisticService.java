package com.github.regyl.gfi.service.statistic;

import com.github.regyl.gfi.controller.dto.response.LanguageStatisticResponseDto;

import java.util.Collection;

public interface StatisticService {

    Collection<LanguageStatisticResponseDto> getLanguageStatistics();
}
