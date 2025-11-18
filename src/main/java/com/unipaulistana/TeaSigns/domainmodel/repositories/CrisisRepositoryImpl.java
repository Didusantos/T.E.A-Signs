package com.unipaulistana.TeaSigns.domainmodel.repositories;

import com.unipaulistana.TeaSigns.domainmodel.Crisis;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


public class CrisisRepositoryImpl implements CrisisRepositoryCustom<Crisis, UUID> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Crisis> findByInitialDateTimeAndLastDateTimeCriteria(LocalTime initalTime, LocalTime lastTime) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Crisis> query = builder.createQuery(Crisis.class);
        Root<Crisis> root = query.from(Crisis.class);

        Predicate firstRule = builder.equal(root.get("initialDateTime"), initalTime);
        Predicate lastRule = builder.equal(root.get("lastDateTime"), lastTime);

        query.select(root).where(builder.and(firstRule, lastRule));

        TypedQuery<Crisis> query1 = entityManager.createQuery(query);
        List<Crisis> crisis = query1.getResultList();

        return query1.getResultList();
    }

    @Override
    public List<Crisis> findByInitialDateTimeCriteriaAfter(LocalTime initalTime) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Crisis> query = builder.createQuery(Crisis.class);
        Root<Crisis> root = query.from(Crisis.class);


        query.select(root).where(builder.greaterThanOrEqualTo(root.get("initialDateTime"), initalTime));

        TypedQuery<Crisis> query1 = entityManager.createQuery(query);
        List<Crisis> crisis = query1.getResultList();

        return query1.getResultList();
    }

    @Override
    public List<Crisis> findByLastDateTimeCriteriaBefore(LocalTime lastTime) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Crisis> query = builder.createQuery(Crisis.class);
        Root<Crisis> root = query.from(Crisis.class);

        query.select(root).where(builder.lessThanOrEqualTo(root.get("lastDateTime"), lastTime));

        TypedQuery<Crisis> query1 = entityManager.createQuery(query);
        List<Crisis> crisis = query1.getResultList();

        return query1.getResultList();
    }

    @Override
    public List<Crisis> findByIntensityCriteriaMin(Double intensityMin) {

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Crisis> query = builder.createQuery(Crisis.class);
        Root<Crisis> root = query.from(Crisis.class);

        query.select(root).where(builder.greaterThanOrEqualTo(root.get("intensity"), intensityMin));

        TypedQuery<Crisis> query1 = entityManager.createQuery(query);
        List<Crisis> crisis = query1.getResultList();
        return query1.getResultList();
    }

    @Override
    public List<Crisis> findByIntensityCriteriaMax(Double intensityMax) {

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Crisis> query = builder.createQuery(Crisis.class);
        Root<Crisis> root = query.from(Crisis.class);

        query.select(root).where(builder.lessThanOrEqualTo(root.get("intensity"), intensityMax));

        TypedQuery<Crisis> query1 = entityManager.createQuery(query);
        List<Crisis> crisis = query1.getResultList();
        return query1.getResultList();
    }
}
