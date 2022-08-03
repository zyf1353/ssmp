package com.zyf.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zyf.domain.Book;
import com.zyf.service.IBookService;
import com.zyf.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController2 {

    @Autowired
    private IBookService ibookService;

    @GetMapping()
    public R getAll(){
        return new R(true,ibookService.list());
    }

    @PostMapping()
    public R save(@RequestBody Book book){
        return new R(ibookService.save(book));
    }

    @PutMapping()
    public R update(@RequestBody Book book){
        return new R(ibookService.updateById(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(ibookService.removeById(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        return new R(true, ibookService.getById(id));
    }

    @GetMapping("{currentPAge}/{pageSize}")
    public R getPage(@PathVariable int currentPAge, @PathVariable int pageSize){
        return new R(true,ibookService.getPage(currentPAge,pageSize));
    }

}
