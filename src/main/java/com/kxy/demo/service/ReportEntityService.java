package com.kxy.demo.service;

import java.util.List;

import javax.jws.WebService;

import com.kxy.demo.model.ReportEntity;

/**
* 接口定义
*  @WebService用于定义webservice对外开放的接口
* Created by ht on 2017/1/20.
*/
@WebService
public interface  ReportEntityService {

	List<ReportEntity> findOne(String pkid);
}
