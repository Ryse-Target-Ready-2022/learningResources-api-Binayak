package com.target.rysetii.learningresourcesapi.Repository;

import com.target.rysetii.learningresourcesapi.entity.LearningResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearningResourceRepository extends JpaRepository<LearningResource, Integer> {
}
