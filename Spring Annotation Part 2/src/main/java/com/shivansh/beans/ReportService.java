package com.shivansh.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    @Autowired
//    @Qualifier("mysqlDao")
    private ReportDao dao;

    public void generateReport(){
        dao.getData();
        System.out.println("Report Generated....");
    }

}
