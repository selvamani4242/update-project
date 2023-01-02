package com.example.ChapterService;

import com.example.ChapterDto.Dto;
import com.example.ChapterEntity.ChapterEntity;
import com.example.ChapterRepository.ChapterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChapterServiceImpl implements ChapterService{
    @Autowired
    private ChapterRepo repo;
    @Override
    public ChapterEntity update(Dto dto) {
        ChapterEntity chapter = new ChapterEntity();
        chapter.setName(dto.getName());
        return repo.save(chapter);
    }
}
