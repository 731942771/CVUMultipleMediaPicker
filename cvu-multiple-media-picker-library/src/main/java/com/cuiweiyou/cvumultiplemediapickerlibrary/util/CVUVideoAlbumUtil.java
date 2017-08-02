package com.cuiweiyou.cvumultiplemediapickerlibrary.util;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.provider.MediaStore;

/**
 * 类的说明：
 *
 * @author：崔维友
 * @phone：13241701472
 * @version：1.0.0
 * @created：2016/10/013,16/10/13
 */
public class CVUVideoAlbumUtil {

	public static Bitmap getVideoAlbum(String path) {
		return ThumbnailUtils.createVideoThumbnail(path, MediaStore.Video.Thumbnails.MINI_KIND);
	}
}
