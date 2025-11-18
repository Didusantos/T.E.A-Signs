package com.unipaulistana.TeaSigns.domainmodel.repositories;


import com.unipaulistana.TeaSigns.domainmodel.Crisis;

import java.time.LocalTime;
import java.util.Optional;

public interface CrisisRepositoryCustom<Crisis, UUID> {

    public Optional<Crisis> findByInitialDateTimeAndLastDateTimeCriteria(LocalTime initalTime, LocalTime lastTime);

    public Optional<Crisis> findByInitialDateTimeCriteriaAfter(LocalTime initalTime);

    public Optional<Crisis> findByLastDateTimeCriteriaBefore(LocalTime lastTime);

    Optional<com.unipaulistana.TeaSigns.domainmodel.Crisis> findByIntensityCriteriaMin(Double intensityBefore);

    Optional<com.unipaulistana.TeaSigns.domainmodel.Crisis> findByIntensityCriteriaMax(Double intensityAfter);
}
