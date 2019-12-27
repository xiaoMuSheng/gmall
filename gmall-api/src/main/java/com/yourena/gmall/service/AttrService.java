package com.yourena.gmall.service;

import com.yourena.gmall.bean.PmsBaseAttrInfo;
import com.yourena.gmall.bean.PmsBaseAttrValue;
import com.yourena.gmall.bean.PmsProductSaleAttr;

import java.util.List;
import java.util.Set;

public interface AttrService {

    List<PmsBaseAttrInfo> attrInfoList(String Catalog3Id);

    List<PmsBaseAttrValue> attrValueList(String attrId);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrInfo> getAttrValueListByValueId(Set<String> valueIdSet);

    List<PmsProductSaleAttr> baseAttrInfoList();
}
