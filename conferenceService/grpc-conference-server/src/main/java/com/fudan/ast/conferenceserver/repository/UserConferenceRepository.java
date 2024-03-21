package com.fudan.ast.conferenceserver.repository;

import com.fudan.ast.conferenceserver.entity.UserConferenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserConferenceRepository extends JpaRepository<UserConferenceEntity, Long> {

    // 根据用户id和会议id查询
    UserConferenceEntity findByUserIdAndConferenceId(Integer userId, Integer conferenceId);

    // 根据用户id查询该用户参与的会议
    Optional<UserConferenceEntity> findByUserId(Integer userId);

    // 根据会议id查询参与的用户
    Optional<UserConferenceEntity> findByConferenceId(Integer conferenceId);

    // 检查用户是否已经邀请/参与某会议
    boolean existsByUserIdAndConferenceId(Integer userId, Integer conferenceId);

}