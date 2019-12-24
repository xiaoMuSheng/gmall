package com.yourena.gmall.service;

 import com.yourena.gmall.bean.PmsSearchParam;
 import com.yourena.gmall.bean.PmsSearchSkuInfo;

import java.io.IOException;
import java.util.List;

/**
 * @author : 熊亚东
 * @description :
 * @date : 2019/7/15 | 12:44
 **/
public interface SearchService {

    List<PmsSearchSkuInfo> list(PmsSearchParam pmsSearchParam) throws IOException;

}
