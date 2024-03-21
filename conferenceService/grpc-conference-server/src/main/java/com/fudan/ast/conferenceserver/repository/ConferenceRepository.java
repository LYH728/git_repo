package com.fudan.ast.conferenceserver.repository;


import com.fudan.ast.conferenceserver.entity.ConferenceEntity;

import com.fudan.ast.conferenceserver.entity.ConferenceStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ConferenceRepository extends JpaRepository<ConferenceEntity, Integer> {

    public List<ConferenceEntity> findByLocation(String location);

    @Query("select c from ConferenceEntity c where c.status = ?1")
    public List<ConferenceEntity> findByStatus(ConferenceStatusEntity status);

}