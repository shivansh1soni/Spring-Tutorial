package com.shivansh.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Repository("dao")

@Repository
@Primary
public class OracleDBReportDao implements ReportDao {
    @Override
    public void getData() {
        System.out.println("getting data from Oracle.......");
    }
}
