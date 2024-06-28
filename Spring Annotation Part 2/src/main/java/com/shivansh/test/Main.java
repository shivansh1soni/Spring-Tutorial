package com.shivansh.test;

import com.shivansh.AppConfig;
import com.shivansh.beans.ReportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ReportService reportService = context.getBean(ReportService.class);
        reportService.generateReport();
    }
}
