package com.coding.omkar.intro.inroToSpringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbService {

    private Db db;

    String getData() {
        return db.getData();
    }
    public DbService(Db db){
        this.db=db;
    }

}
