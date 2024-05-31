package com.example.project.repository;

import com.example.project.dto.response.UserProductStatsDTO;
import com.example.project.entity.OrderedProduct;
import com.example.project.entity.pk.IDOrderedProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderedProductRepo extends JpaRepository<OrderedProduct, IDOrderedProduct> {
    @Query("SELECT new com.example.project.dto.response.UserProductStatsDTO(SUM(case when op.deliveryStatusTitle = 'Выдан' then 1 else 0 end), SUM(case when op.deliveryStatusTitle = 'Отказ' then 1 else 0 end)) " +
            "FROM OrderedProduct op " +
            "JOIN op.order o " +
            "JOIN o.user u " +
            "WHERE u.user_id = :userId " +
            "GROUP BY u.user_id")
    UserProductStatsDTO findUserProductStatsByUserId(@Param("userId") Integer userId);
}
