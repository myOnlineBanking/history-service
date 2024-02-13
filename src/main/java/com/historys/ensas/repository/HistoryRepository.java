package com.historys.ensas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

import com.historys.ensas.entity.History;

@RepositoryRestResource
public interface HistoryRepository extends MongoRepository<History, String> {

    List<History> findByUserIdAndCompteId(@Param(value = "userId") String userId,
            @Param(value = "compteId") String compteId);

    List<History> findByUserId(@Param(value = "userId") String userId);

}
