package com.SonarVibon.SonarVibon.repository;

import com.SonarVibon.SonarVibon.model.Table2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface Table2Repository extends JpaRepository<Table2,String> {

    @Query("SELECT f FROM Table2 f where f.groupId = :groupId")
    Table2 getCalibrationDataByGroupId(@Param("groupId") String groupId);

    @Query("SELECT f FROM Table2 f where f.open = :open")
    List<Table2> getAllOpen(@Param("open") String open);

}
