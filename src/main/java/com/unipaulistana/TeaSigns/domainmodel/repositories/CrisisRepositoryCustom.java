package com.unipaulistana.TeaSigns.domainmodel.repositories;


import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

public interface CrisisRepositoryCustom<Crisis, UUID> {

    public List<com.unipaulistana.TeaSigns.domainmodel.Crisis> findByInitialDateTimeAndLastDateTimeCriteria(LocalTime initalTime, LocalTime lastTime);

    public List<Crisis> findByInitialDateTimeCriteriaAfter(LocalTime initalTime);

    public List<Crisis> findByLastDateTimeCriteriaBefore(LocalTime lastTime);

    List<Crisis> findByIntensityCriteriaMin(Double intensityBefore);

    List<Crisis> findByIntensityCriteriaMax(Double intensityAfter);
}
