package com.example.ChapterRepository;

import com.example.ChapterDto.Dto;
import com.example.ChapterEntity.ChapterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepo extends JpaRepository<ChapterEntity , Integer> {

    //ChapterEntity save (Dto dto);
}
