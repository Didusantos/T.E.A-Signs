package com.unipaulistana.TeaSigns.service;

import com.unipaulistana.TeaSigns.domainmodel.Crisis;

import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

public interface CrisisService {

    public Crisis findById(UUID id);

    public Crisis createCrisis(Crisis crisis);

    public Crisis updateCrisis(Crisis crisis);

    public void deleteByCrisisId(UUID id);

    public List<Crisis> findAll();

    public Crisis parcialUpdate(Crisis crisis);

    public List<Crisis> findByInitialDateTimeAndLastDateTimeCriteria(LocalTime initalTime, LocalTime lastTime);

    public List<Crisis> findByInitialDateTimeCriteriaAfter(LocalTime initalTime);

    public List<Crisis> findByLastDateTimeCriteriaBefore(LocalTime lastTime);

    public List<Crisis> findByIntensityCriteriaMin(Double intensityMin);

    public List<Crisis> findByIntensityCriteriaMax(Double intensityMax);
}
