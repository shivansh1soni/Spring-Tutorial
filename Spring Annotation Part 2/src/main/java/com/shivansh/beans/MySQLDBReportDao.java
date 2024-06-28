package com.shivansh.beans;

import org.springframework.stereotype.Repository;

//@Repository("mysqlDao")
@Repository
public class MySQLDBReportDao implements ReportDao {
    @Override
    public void getData() {
        System.out.println("getting data from MySQL.......");
    }
}
