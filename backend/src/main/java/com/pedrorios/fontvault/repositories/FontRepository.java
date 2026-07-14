package com.pedrorios.fontvault.repositories;

import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.*;
import java.awt.print.Pageable;
import java.util.UUID;

public interface FontRepository extends JpaRepository<Font, Long> {
    Page<Font> findByUserId(UUID userId, Pageable pageable);

    @Query("SELECT f FROM Font f JOIN f.categories c WHERE f.user.id = :userId AND c.id = :categoryId")
    Page<Font> findByUserIdAndCategoryId(UUID userId, Long categoryId, Pageable pageable);
}
