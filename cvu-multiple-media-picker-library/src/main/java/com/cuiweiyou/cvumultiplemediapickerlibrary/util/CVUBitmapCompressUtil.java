package com.cuiweiyou.cvumultiplemediapickerlibrary.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Build;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

/**
 * 类的说明：图片压缩工具<br/>
 * 有些手机不能通过系统api获取到缩略图，使用此工具动态创建，但对性能影响很大
 *
 * @author：崔维友
 * @version：1.0.0
 */

public class CVUBitmapCompressUtil {

	private static final String TAG = "CVU-Bitmap-Compress";

	private CVUBitmapCompressUtil() {
	}

	/**
	 * 函数功能：对传入的图片file生成缩略图bmp
	 *
	 * @author：崔维友
	 * @version：1.0.0
	 */
	public static Bitmap compress(File path) {

		return compresss(path.getAbsolutePath());
	}

	/**
	 * 函数功能：根据指定的宽高对传入的图片file生成缩略图bmp
	 *
	 * @author：崔维友
	 * @version：1.0.0
	 */
	public static Bitmap compresss(File path, int width, int height) {

		return compresss(path.getAbsolutePath(), width, height);
	}

	/**
	 * 函数功能：对传入本地绝对路径的图片生成缩略图bmp
	 *
	 * @author：崔维友
	 * @version：1.0.0
	 */
	public static Bitmap compresss(String path) {
		BitmapFactory.Options options = new BitmapFactory.Options();
		options.inJustDecodeBounds = true; // 临时不读取图片的bitmap数据。只获取其余的宽高等属性信息
		BitmapFactory.decodeFile(path, options);

		float width = options.outWidth;   // 图片的宽
		float height = options.outHeight; // 图片的高
		//Log.e(TAG, "原始宽：" + width + ",原始高：" + height + "，格式：" + options.outMimeType);

		float scale = 1;
		boolean isWidthMoreHeight = false;
		if(width > height) {
			scale = width / height;
			isWidthMoreHeight = true;
		} else {
			scale = height / width;
		}

		width = width / 100;

		if(width < 300)
			width = 300;

		if(isWidthMoreHeight) {
			height = width / scale;
		} else {
			height = scale * width;
		}

		//Log.e(TAG, "宽：" + width + ",高：" + height);

		return compresss(path, width, height);
	}

	/**
	 * 函数功能：根据指定的宽高对传入本地绝对路径的图片生成缩略图bmp
	 *
	 * @author：崔维友
	 * @version：1.0.0
	 */
	public static Bitmap compresss(String path, float width, float height) {
		Bitmap newbmp = Bitmap.createBitmap((int) width, (int) height, Bitmap.Config.RGB_565);

		try {
			Bitmap bm = BitmapFactory.decodeFile(path);

			Canvas cv = new Canvas(newbmp);
			cv.drawBitmap(bm, 0, 0, null);
			cv.save(Canvas.ALL_SAVE_FLAG);
			cv.restore();

			bm.recycle();

			int maxSize = 1000;// byte
			if (getBitmapSize(newbmp) > maxSize) {
				newbmp = loopCompress(newbmp, maxSize);
			}
		} catch (OutOfMemoryError e){
			e.printStackTrace();
		}

		return newbmp;
	}

	private static Bitmap loopCompress(Bitmap newbmp, int maxSize) {
		int options = 60;

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		newbmp.compress(Bitmap.CompressFormat.JPEG, options, baos);                                 // png图片是无损的，不能进行压缩

		while (baos.toByteArray().length > maxSize) {
			baos.reset();
			newbmp.compress(Bitmap.CompressFormat.JPEG, options, baos);

			options -= 1;

			if(options < 0)
				break;
		}

		newbmp.recycle();

		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		Bitmap bitmap = BitmapFactory.decodeStream(bais, null, null);

		baos.reset();
		bais.reset();

		return bitmap;
	}

	private static int getBitmapSize(Bitmap bitmap){
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){         // API 19
			return bitmap.getAllocationByteCount();
		}

		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR1){  // API 12
			return bitmap.getByteCount();
		}

		return bitmap.getRowBytes() * bitmap.getHeight();                 // 更早
	}
}
