package com.zyf.controller;

import com.zyf.domain.Book;
import com.zyf.service.IBookService;
import com.zyf.controller.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        Boolean flag = ibookService.save(book);
        return new R(flag, flag ? "添加成功" : "添加失败");
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
