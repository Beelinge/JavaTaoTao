package com.taotao.service;

import java.util.List;

import com.taotao.pojo.TbItemCat;

public interface ItemCatService {
	// 查询商品类目
	List<TbItemCat> getItemCatList(Long parentId);
}
