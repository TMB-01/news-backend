package uz.news.newsbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.news.newsbackend.entity.CarouselNews;
import uz.news.newsbackend.service.CarouselNewsService;

import java.util.List;

@RestController
@RequestMapping("api/v1/carousel-news")
public class CarouselNewsController {

    @Autowired
    CarouselNewsService carouselNewsService;

    @GetMapping
    public List<CarouselNews> getAll() {
        return carouselNewsService.getAll();
    }
}