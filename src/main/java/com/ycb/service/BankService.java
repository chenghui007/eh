package com.ycb.service;

import java.util.List;

import cn.kanmars.ecm.entity.TblBankamountInfo;

public interface BankService {

	int addBankAmount(TblBankamountInfo bankAmount);

	List<TblBankamountInfo> searchBankAmount(String openID);

}