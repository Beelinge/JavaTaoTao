package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
	// 根据id查询商品信息
	TbItem getItemById(long itemId);
	
	// 商品列表查询
	EUDataGridResult getItemList(int page, int rows);
	
	// 保存商品
	void saveItem(TbItem item, String desc, String Params);
}
