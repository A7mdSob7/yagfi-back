package com.github.regyl.gfi.service.impl.statistic;

import com.github.regyl.gfi.controller.dto.response.LanguageStatisticResponseDto;
import com.github.regyl.gfi.repository.StatisticRepository;
import com.github.regyl.gfi.service.statistic.StatisticService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@RequiredArgsConstructor
public class StatisticServiceImpl implements StatisticService {

    private final StatisticRepository repository;

    @Override
    public Collection<LanguageStatisticResponseDto> getLanguageStatistics() {
        return repository.getLanguageStatistics();
    }
}
