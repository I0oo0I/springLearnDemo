package com.kxy.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kxy.demo.model.ReportEntity;

public class ReportEntityServiceImpl implements ReportEntityService{
	
	 @Autowired
	 private StoreSingtonScopeService scopeService;	

	  public ReportEntityServiceImpl() {
          System.out.println("初始化ReportEntityServiceImpl");
      }

      @Override
      public List<ReportEntity> findOne(String schoolId) {
    	  List<ReportEntity> entitys = new ArrayList<>();
          ReportEntity reportEntity = new ReportEntity("1","小花", 18, "武汉科技大学","001");
          ReportEntity reportEntity1 = new ReportEntity("2","小红", 18, "武汉科技大学","001");
          ReportEntity reportEntity2 = new ReportEntity("3","小黑", 18, "武汉科技大学","001");
          ReportEntity reportEntity3 = new ReportEntity("4","小黄", 18, "武汉科技大学","001");
          ReportEntity reportEntity4 = new ReportEntity("5","小绿", 18, "武汉科技大学","001");
          ReportEntity reportEntity5 = new ReportEntity("6","小白", 18, "武汉科技大学","001");
          ReportEntity reportEntity6 = new ReportEntity("7","小蓝", 18, "武汉科技大学","001");
          entitys.add(reportEntity);
          entitys.add(reportEntity1);
          entitys.add(reportEntity2);
          entitys.add(reportEntity3);
          entitys.add(reportEntity4);
          entitys.add(reportEntity5);
          entitys.add(reportEntity6);
          if(schoolId.equals("001")) {
        	  return entitys;
          }
          return null;
      }

}
