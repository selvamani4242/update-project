package com.example.ChapterController;


import com.example.ChapterDto.Dto;
import com.example.ChapterEntity.ChapterEntity;
import com.example.ChapterService.ChapterService;
import com.example.ChapterService.ChapterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/chapter")
public class ChapterController {
    @Autowired
    private ChapterService chapterService;
    @PostMapping("/update")
    public ResponseEntity<?> registerChapter(@RequestBody Dto dto){
        System.out.println("save update running");
       ChapterEntity obj = chapterService.update(dto);
       /*Dto dto1 = new Dto();
       dto1.setId(obj.getId());
       dto1.setName(obj.getName());*/
        return ResponseEntity.status(HttpStatus.CREATED).body(obj);
    }
}
