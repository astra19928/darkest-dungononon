package com.example.darkestdungeon.Repository;

import com.example.darkestdungeon.model.Quirk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuirkRepository extends JpaRepository<Quirk, Integer> {
}
