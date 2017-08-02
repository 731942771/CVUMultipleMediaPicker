package com.cuiweiyou.cvumultiplemediapickerlibrary.back;

import com.cuiweiyou.cvumultiplemediapickerlibrary.bean.CVUMediaBaseBean;

import java.util.ArrayList;
import java.util.Map;

/**
 * 类的说明：扫描结果回调
 *
 * @author：崔维友
 * @version：1.0.0
 */

public interface CVUMultipleMediaBack {
	/**
	 * @param result Map<String, List> key是文件类型，list即对于的文件集合
	 */
	void getMultipleMediaFiles(Map<String, ArrayList<CVUMediaBaseBean>> result);
}
