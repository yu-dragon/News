package com.atyou.service;

import java.util.List;

import com.atyou.common.EasyUIDataGridResult;
import com.atyou.common.TaotaoResult;
import com.atyou.pojo.Detail;

public interface AdminItemQueryService {

	EasyUIDataGridResult getItemList(int page,int rows)throws Exception;

	TaotaoResult delContent(List<Integer> list)throws Exception;

	TaotaoResult updateContent(Detail detail)throws Exception;
}
