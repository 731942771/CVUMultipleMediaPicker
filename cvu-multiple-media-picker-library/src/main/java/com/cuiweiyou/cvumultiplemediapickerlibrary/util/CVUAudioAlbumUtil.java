package com.cuiweiyou.cvumultiplemediapickerlibrary.util;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

import com.cuiweiyou.cvumultiplemediapickerlibrary.R;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 类的说明：音乐文件的专辑图片获取工具
 *
 * @author：崔维友
 * @version：1.0.0
 */

public class CVUAudioAlbumUtil {

	private static final String TAG = "CVU-Music-Album-Util";
	private static final Uri ALBUM_URI = Uri.parse("content://media/external/audio/albumart");

	private CVUAudioAlbumUtil() {
	}

	/**
	 * 函数功能：获取专辑图片
	 *
	 * @param ctx 上下文
	 * @param song_id 歌曲id
	 * @param album_id 专辑id
	 * @param use_default 使用默认图片
	 *
	 * @author：崔维友
	 * @version：1.0.0
	 */
	public static Bitmap getMusicAlbum(Context ctx, long song_id, long album_id, boolean use_default) {
		//Log.e(TAG, "getMusicAlbum，songid:" + song_id + ",albumid:" + album_id + ",default:" + use_default);

		// 专辑id小于0，则从文件中获取图片
		if (album_id < 0) {
			if (song_id >= 0) {
				Bitmap bm = getAlbumFromFile(ctx, song_id, -1);
				if (bm != null) {
					return bm;
				}
			}

			if (use_default) {
				return getDefaultThumb(ctx);
			}

			return null;
		}

		// 否则，专辑图片可能已存在，从媒体库中取

		ContentResolver res = ctx.getContentResolver();
		Uri uri = ContentUris.withAppendedId(ALBUM_URI, album_id);
		if (uri != null) {
			InputStream in = null;
			try {
				in = res.openInputStream(uri);
				return BitmapFactory.decodeStream(in, null, new BitmapFactory.Options());

			} catch (FileNotFoundException ex) {
				Bitmap bm = getAlbumFromFile(ctx, song_id, album_id);
				if (bm != null) {
					if (bm.getConfig() == null) {
						bm = bm.copy(Bitmap.Config.RGB_565, false);
						if (bm == null && use_default) {
							return getDefaultThumb(ctx);
						}
					}
				} else if (use_default) {
					bm = getDefaultThumb(ctx);
				}
				return bm;
			} finally {
				try {
					if (in != null) {
						in.close();
					}
				} catch (IOException ex) {
				}
			}
		}

		return null;
	}

	/**
	 * 函数功能：从文件中获取专辑图片
	 *
	 * @author：崔维友
	 * @version：1.0.0
	 */
	private static Bitmap getAlbumFromFile(Context ctx, long songid, long albumid) {
		//Log.e(TAG, "getAlbumFromFile，songid:" + songid + ",albumid:" + albumid);

		Bitmap bm = null;

		if (albumid < 0 && songid < 0) {
			return bm;
		}

		try {
			if (albumid < 0) {
				Uri uri = Uri.parse("content://media/external/audio/media/" + songid + "/albumart");
				ParcelFileDescriptor pfd = ctx.getContentResolver().openFileDescriptor(uri, "r");

				if (pfd != null) {
					FileDescriptor fd = pfd.getFileDescriptor();
					bm = BitmapFactory.decodeFileDescriptor(fd);
				}
			} else {
				Uri uri = ContentUris.withAppendedId(ALBUM_URI, albumid);
				ParcelFileDescriptor pfd = ctx.getContentResolver().openFileDescriptor(uri, "r");

				if (pfd != null) {
					FileDescriptor fd = pfd.getFileDescriptor();
					bm = BitmapFactory.decodeFileDescriptor(fd);
				}
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();

			bm = getDefaultThumb(ctx);
		} catch (OutOfMemoryError e){
			e.printStackTrace();
		}

		return bm;
	}

	private static Bitmap getDefaultThumb(Context ctx) {
		Bitmap bitmap = null;

		try {
			bitmap =  BitmapFactory.decodeResource(ctx.getResources(), R.drawable.logo);
		} catch (OutOfMemoryError e){
			e.printStackTrace();
		}

		return bitmap;
	}
}
