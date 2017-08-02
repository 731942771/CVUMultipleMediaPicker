package com.cuiweiyou.cvumultiplemediapickerlibrary.flag;

import java.io.Serializable;

/**
 * 类的说明：多媒体文件选择标记<br/>
 *
 * IMAGE_ONLY 仅选择图片 <br/>
 * AUDIO_ONLY 仅选择音频 <br/>
 * VIDEO_ONLY 仅选择视频 <br/>
 * IMAGE_AND_AUDIO 图片和音频 <br/>
 * IMAGE_AND_VIDEO 图片和视频 <br/>
 * AUDIO_AND_VIDEO 音频和视频 <br/>
 * ALL 全部（图片、音频、视频） <br/>
 *
 * @author：崔维友
 * @version：1.0.0
 */
public enum CVUMultipleMediaPickerFlags implements Serializable {
	/** 仅选择图片 */
	FLAG_IMAGE_ONLY,
	/** 仅选择音频 */
	FLAG_AUDIO_ONLY,
	/** 仅选择视频 */
	FLAG_VIDEO_ONLY,
	/** 图片和音频 */
	FLAG_IMAGE_AND_AUDIO,
	/** 图片和视频 */
	FLAG_IMAGE_AND_VIDEO,
	/** 音频和视频 */
	FLAG_AUDIO_AND_VIDEO,
	/** 全部（图片、音频、视频） */
	FLAG_ALL;

	/** 资源集合类型 图片 */
	public static String RESOURCE_IMAGE = "IMAGE";
	/** 资源集合类型 音频 */
	public static String RESOURCE_AUDIO = "AUDIO";
	/** 资源集合类型 视频 */
	public static String RESOURCE_VIDEO = "VIDEO";

	/** Activity直接传递数据的key */
	public static String FLAG_KEY = "cvu_key";
	/** 跳转到文件选择界面请求码 */
	public static int REQUEST_CODE = 1024;
	/** 从选择界面返回的响应码 */
	public static int RESULT_CODE = 1024;
}

