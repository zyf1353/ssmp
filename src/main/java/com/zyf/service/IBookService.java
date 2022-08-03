package com.zyf.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zyf.domain.Book;
import org.springframework.web.bind.annotation.PathVariable;

public interface IBookService extends IService<Book> {

    IPage<Book> getPage(int currentPAge, int pageSize);
    IPage<Book> getPage(int currentPAge, int pageSize, Book book);

}
