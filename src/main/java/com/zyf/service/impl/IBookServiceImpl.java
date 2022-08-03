package com.zyf.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyf.dao.BookDao;
import com.zyf.domain.Book;
import com.zyf.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IBookServiceImpl extends ServiceImpl<BookDao,Book> implements IBookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public IPage<Book> getPage(int currentPAge, int pageSize) {
        IPage page = new Page(currentPAge, pageSize);
        bookDao.selectPage(page,null);
        return page;

    }
}
