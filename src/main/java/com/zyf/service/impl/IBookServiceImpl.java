package com.zyf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyf.dao.BookDao;
import com.zyf.domain.Book;
import com.zyf.service.IBookService;
import org.springframework.stereotype.Service;

@Service
public class IBookServiceImpl extends ServiceImpl<BookDao,Book> implements IBookService {
}
