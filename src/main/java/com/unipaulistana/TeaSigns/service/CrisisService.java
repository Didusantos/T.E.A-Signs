package com.unipaulistana.TeaSigns.service;

import com.unipaulistana.TeaSigns.domainmodel.Crisis;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CrisisService {

    Optional<Crisis> findById(UUID id);

    Crisis createCrisis(Crisis crisis);

    Crisis updateCrisis(Crisis crisis);

    void deleteByCrisisId(UUID id);

    List<Crisis> findAll();

    List<Crisis> findByInitialDateTimeAndLastDateTimeCriteria(LocalTime initalTime, LocalTime lastTime);

    List<Crisis> findByInitialDateTimeCriteriaAfter(LocalTime initalTime);

    List<Crisis> findByLastDateTimeCriteriaBefore(LocalTime lastTime);

    List<Crisis> findByIntensityCriteriaMin(Double intensityMin);

    List<Crisis> findByIntensityCriteriaMax(Double intensityMax);
}
