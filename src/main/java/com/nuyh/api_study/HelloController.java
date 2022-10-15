package com.nuyh.api_study;

import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
public class HelloController {
    public static Long count=3L;

    @GetMapping("/board/all/{page}")
    @ResponseBody
    public Post[] getAllPages(@PathVariable("page") int page){
        if(page!=3)
            return new Post[]{};

        Post p1=new Post(1L, "OSI 7계층이란??", "네트워크", 5, LocalDateTime.of(2022, 10, 14, 3, 22));
        Post p2=new Post(2L, "연어 먹고 싶다", "알고리즘", 137, LocalDateTime.now());

        return new Post[]{p1, p2};
    }

    @PostMapping("/board/summary/{category}")
    @ResponseBody
    public String post(@PathVariable("category") String category, @RequestBody Post post){
        if(post.getTopic()==null || post.getContent()==null || !category.equals("연어"))
            return "제대로 요청하세요";

        post.setId(count++);
        post.setDate(LocalDateTime.now());
        post.setCategory(category);

        return "굿굿 \n\n"+category+"게시판에 성공적으로 등록되었습니다.\n"+post;
    }
}
