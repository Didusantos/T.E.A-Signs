package com.unipaulistana.TeaSigns.service;

import com.unipaulistana.TeaSigns.domainmodel.Crisis;
import com.unipaulistana.TeaSigns.domainmodel.repositories.CrisisRepository;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CrisisServiceImpl implements CrisisService {

    private CrisisRepository crisisRepository;

    @Override
    public Optional<Crisis> findById(UUID id) {
        return crisisRepository.findById(id);
    }

    @Override
    public Crisis createCrisis(Crisis crisis) {
        return crisisRepository.save(crisis);
    }

    @Override
    public Crisis updateCrisis(Crisis crisis) {
        return crisisRepository.save(crisis);
    }

    @Override
    public void deleteByCrisisId(UUID id) {
        this.crisisRepository.deleteById(id);
    }

    @Override
    public List<Crisis> findAll() {
        return crisisRepository.findAll();
    }

    @Override
    public Crisis parcialUpdate(Crisis crisis) {
        return crisisRepository.save(crisis);
    }

    @Override
    public List<Crisis> findByInitialDateTimeAndLastDateTimeCriteria(LocalTime initalTime, LocalTime lastTime) {
        return crisisRepository.findByInitialDateTimeAndLastDateTimeCriteria(initalTime, lastTime);
    }

    @Override
    public List<Crisis> findByInitialDateTimeCriteriaAfter(LocalTime initalTime) {
        return crisisRepository.findByInitialDateTimeCriteriaAfter(initalTime);
    }

    @Override
    public List<Crisis> findByLastDateTimeCriteriaBefore(LocalTime lastTime) {
        return crisisRepository.findByLastDateTimeCriteriaBefore(lastTime);
    }

    @Override
    public List<Crisis> findByIntensityCriteriaMin(Double intensityMin) {
        return crisisRepository.findByIntensityCriteriaMin(intensityMin);
    }

    @Override
    public List<Crisis> findByIntensityCriteriaMax(Double intensityMax) {
        return crisisRepository.findByIntensityCriteriaMax(intensityMax);
    }
}
