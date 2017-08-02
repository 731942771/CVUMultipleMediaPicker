package com.cuiweiyou.cvumultiplemediapickerlibrary.task;

import android.content.Context;
import android.os.AsyncTask;

import com.cuiweiyou.cvumultiplemediapickerlibrary.back.CVUMultipleMediaBack;
import com.cuiweiyou.cvumultiplemediapickerlibrary.bean.CVUMediaBaseBean;
import com.cuiweiyou.cvumultiplemediapickerlibrary.flag.CVUMultipleMediaPickerFlags;
import com.cuiweiyou.cvumultiplemediapickerlibrary.util.CVUMultipleMediaUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 类的说明：扫描任务
 *
 * @author：崔维友
 * @version：1.0.0
 */

public class CVUMultipleMediaPickerTask extends AsyncTask<Void, Void, Map<String, ArrayList<CVUMediaBaseBean>>>{

	private final Context ctx;
	private final CVUMultipleMediaBack back;
	private final CVUMultipleMediaPickerFlags key;

	/**
	 * 扫描任务
	 * @param ctx 上下文
	 * @param back 扫描完回调
	 * @param key 扫描文件类型标记
	 */
	public CVUMultipleMediaPickerTask(Context ctx, CVUMultipleMediaBack back, CVUMultipleMediaPickerFlags key){
		this.ctx = ctx;
		this.back = back;
		this.key = key;
	}

	@Override
	protected Map<String, ArrayList<CVUMediaBaseBean>> doInBackground(Void... params) {
		return getData(key);
	}

	@Override
	protected void onPostExecute(Map<String, ArrayList<CVUMediaBaseBean>> result) {
		super.onPostExecute(result);

		back.getMultipleMediaFiles(result);
	}

	/**
	 * 函数功能：扫描文件
	 *
	 * @param flag 扫描文件类型标记
	 * @return 扫描结果 指定类型文件的list集合
	 *
	 * @author：崔维友
	 * @version：1.0.0
	 */
	private Map<String, ArrayList<CVUMediaBaseBean>> getData(CVUMultipleMediaPickerFlags flag) {
		Map<String, ArrayList<CVUMediaBaseBean>> map = new HashMap<>();

		if(null != flag){
			if(CVUMultipleMediaPickerFlags.FLAG_IMAGE_ONLY == flag){
				getImages(map);
			} else if(CVUMultipleMediaPickerFlags.FLAG_AUDIO_ONLY == flag){
				getAudios(map);
			} else if(CVUMultipleMediaPickerFlags.FLAG_VIDEO_ONLY == flag){
				getVideos(map);
			} else if(CVUMultipleMediaPickerFlags.FLAG_IMAGE_AND_AUDIO == flag){
				getImagesAndAudios(map);
			} else if(CVUMultipleMediaPickerFlags.FLAG_IMAGE_AND_VIDEO == flag){
				getImagesAndVideos(map);
			} else {
				getAll(map);
			}
		}
		else {
			getAll(map);
		}

		return map;
	}

	private void getImages(Map map){
		ArrayList<CVUMediaBaseBean> list = CVUMultipleMediaUtil.getImageFiles(ctx);
		map.put(CVUMultipleMediaPickerFlags.RESOURCE_IMAGE, list);
	}

	private void getAudios(Map map){
		ArrayList<CVUMediaBaseBean> list = CVUMultipleMediaUtil.getAudioFiles(ctx);
		map.put(CVUMultipleMediaPickerFlags.RESOURCE_AUDIO, list);
	}

	private void getVideos(Map map){
		ArrayList<CVUMediaBaseBean> list = CVUMultipleMediaUtil.getVideoFiles(ctx);
		map.put(CVUMultipleMediaPickerFlags.RESOURCE_VIDEO, list);
	}

	private void getImagesAndAudios(Map map){
		getImages(map);
		getAudios(map);
	}

	private void getImagesAndVideos(Map map){
		getImages(map);
		getVideos(map);
	}

	private void getAll(Map map){
		getImages(map);
		getAudios(map);
		getVideos(map);
	}
}




