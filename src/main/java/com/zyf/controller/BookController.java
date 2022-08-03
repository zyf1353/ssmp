package com.zyf.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zyf.domain.Book;
import com.zyf.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService ibookService;

    @GetMapping()
    public List<Book> getAll(){
        return ibookService.list();
    }

    @PostMapping()
    public Boolean save(@RequestBody Book book){
        return ibookService.save(book);
    }

    @PutMapping()
    public Boolean update(@RequestBody Book book){
        return ibookService.updateById(book);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return ibookService.removeById(id);
    }

    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id){
        return ibookService.getById(id);
    }

    @GetMapping("{currentPAge}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currentPAge, @PathVariable int pageSize){
        return ibookService.getPage(currentPAge,pageSize);
    }

}
