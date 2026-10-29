package com.example.darkestdungeon.Repository;

import com.example.darkestdungeon.model.Heroi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroiRepository extends JpaRepository<Heroi, Integer> {
}
