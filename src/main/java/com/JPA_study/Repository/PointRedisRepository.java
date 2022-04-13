package com.JPA_study.Repository;

import com.JPA_study.entity.Point;
import org.springframework.data.repository.CrudRepository;

public interface PointRedisRepository extends CrudRepository<Point, String> {
}