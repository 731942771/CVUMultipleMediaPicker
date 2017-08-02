package com.cuiweiyou.cvumultiplemediapickerlibrary.util;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;

import com.cuiweiyou.cvumultiplemediapickerlibrary.bean.CVUMediaAudioFileBean;
import com.cuiweiyou.cvumultiplemediapickerlibrary.bean.CVUMediaBaseBean;
import com.cuiweiyou.cvumultiplemediapickerlibrary.bean.CVUMediaImageFileBean;
import com.cuiweiyou.cvumultiplemediapickerlibrary.bean.CVUMediaVideoFileBean;

import java.util.ArrayList;

/**
 * <br/>
 * 多媒体文件操作工具<br/>
 * <br/>
 * 以MediaStore为基础实现<br/>
 * <br/>
 * getAudioFiles() 遍历手机上的全部音频文件<br/>
 * getImageFiles() 遍历手机上的全部图片文件<br/>
 * getVideoFiles() 遍历手机上的全部视频文件<br/>
 * <br/>
 * author 崔维友 <br/>
 * email vigiles@163.com <br/>
 * website cuiweiyou.com <br/>
 * <br/>
 **/
public class CVUMultipleMediaUtil {
    public static Context ctx;
    private static final String TAG = "CVU-MMP-Library"; // tag最长23个字符
    private static final Uri URI_AUDIO = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;          //音频
    private static final Uri URI_IMAGE = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;         //图片
    private static final Uri URI_VEDIO = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;          //视频

    private CVUMultipleMediaUtil(){}

    /**
     * 函数功能：获取全部音频文件
     *
     * @author：崔维友
     * @version：1.0.0
     */
    public static ArrayList<CVUMediaBaseBean> getAudioFiles(Context ctx) {
        CVUMultipleMediaUtil.ctx = ctx;

        String[] projections = new String[]{ // 要获取的每个文件的属性
                MediaStore.Audio.AudioColumns.ALBUM,// 专辑
                MediaStore.Audio.AudioColumns.ALBUM_ID,// 专辑id
                MediaStore.Audio.AudioColumns.ALBUM_KEY,// 专辑key
                MediaStore.Audio.AudioColumns.ARTIST,// 艺术家-演唱者-歌手
                MediaStore.Audio.AudioColumns.ARTIST_ID,// 歌手id
                MediaStore.Audio.AudioColumns.ARTIST_KEY,// 歌手key
                MediaStore.Audio.AudioColumns.BOOKMARK,// 书签
                MediaStore.Audio.AudioColumns.COMPOSER,// 作曲者
                MediaStore.Audio.AudioColumns.DATA,// 文件路径
                MediaStore.Audio.AudioColumns.DATE_ADDED,// 创建日期
                MediaStore.Audio.AudioColumns.DATE_MODIFIED,// 修改日期
                MediaStore.Audio.AudioColumns.DISPLAY_NAME,// 文件名
                MediaStore.Audio.AudioColumns.DURATION,// 时长
                MediaStore.Audio.AudioColumns.IS_ALARM,// 是否为提示铃声
                MediaStore.Audio.AudioColumns.IS_MUSIC,// 是否为音乐文件
                MediaStore.Audio.AudioColumns.IS_NOTIFICATION,// 是否为通知铃声
                MediaStore.Audio.AudioColumns.IS_PODCAST,// 是否为播客音频
                MediaStore.Audio.AudioColumns.IS_RINGTONE,// 是否为来电铃声
                MediaStore.Audio.AudioColumns.SIZE,// 文件大小
                MediaStore.Audio.AudioColumns.TITLE,// 歌曲标题
                MediaStore.Audio.AudioColumns.TITLE_KEY,// 歌曲标题key
                MediaStore.Audio.AudioColumns.TRACK,// 音轨
                MediaStore.Audio.AudioColumns.MIME_TYPE,// mime类型
                MediaStore.Audio.AudioColumns.YEAR,// = "year";
                MediaStore.Audio.AudioColumns._ID,// 歌曲id
        };

        // 查找全部的音频文件，及需要的属性信息
        Cursor cursor = ctx.getContentResolver().query(URI_AUDIO, projections, null, null, null);
		Log.e(TAG, "音频文件数量：" + cursor.getCount());

        // 属性的位置
        int album  = cursor.getColumnIndexOrThrow(projections[0]);
        int album_id = cursor.getColumnIndexOrThrow(projections[1]);
        int album_key = cursor.getColumnIndexOrThrow(projections[2]);
        int artist = cursor.getColumnIndexOrThrow(projections[3]);
        int artist_id = cursor.getColumnIndexOrThrow(projections[4]);
        int artist_key = cursor.getColumnIndexOrThrow(projections[5]);
        int bookmark = cursor.getColumnIndexOrThrow(projections[6]);
        int composer = cursor.getColumnIndexOrThrow(projections[7]);
        int data = cursor.getColumnIndexOrThrow(projections[8]);
        int date_added = cursor.getColumnIndexOrThrow(projections[9]);
        int date_modified = cursor.getColumnIndexOrThrow(projections[10]);
        int display_name = cursor.getColumnIndexOrThrow(projections[11]);
        int duration = cursor.getColumnIndexOrThrow(projections[12]);
        int is_alarm = cursor.getColumnIndexOrThrow(projections[13]);
        int is_music = cursor.getColumnIndexOrThrow(projections[14]);
        int is_notification = cursor.getColumnIndexOrThrow(projections[15]);
        int is_podcast = cursor.getColumnIndexOrThrow(projections[16]);
        int is_ringtone = cursor.getColumnIndexOrThrow(projections[17]);
        int size = cursor.getColumnIndexOrThrow(projections[18]);
        int title = cursor.getColumnIndexOrThrow(projections[19]);
        int title_key = cursor.getColumnIndexOrThrow(projections[20]);
        int track = cursor.getColumnIndexOrThrow(projections[21]);
        int mime_type = cursor.getColumnIndexOrThrow(projections[22]);
        int year = cursor.getColumnIndexOrThrow(projections[23]);
        int song_id = cursor.getColumnIndexOrThrow(MediaStore.Audio.AudioColumns._ID);

        ArrayList<CVUMediaBaseBean> list = new ArrayList<CVUMediaBaseBean>();

        while (cursor.moveToNext()) {
            String song_id_s = cursor.getString(song_id);
            String album_s = cursor.getString(album);
            String album_id_s = cursor.getString(album_id);
            String album_key_s = cursor.getString(album_key);
            String artist_s = cursor.getString(artist);
            String artist_id_s = cursor.getString(artist_id);
            String artist_key_s = cursor.getString(artist_key);
            String bookmark_s = cursor.getString(bookmark);
            String composer_s = cursor.getString(composer);
            String data_s = cursor.getString(data);
            String date_added_s = cursor.getString(date_added);
            String date_modified_s = cursor.getString(date_modified);
            String display_name_s = cursor.getString(display_name);
            String duration_s = cursor.getString(duration);
            String is_alarm_s = cursor.getString(is_alarm);
            String is_music_s = cursor.getString(is_music);
            String is_notification_s = cursor.getString(is_notification);
            String is_podcast_s = cursor.getString(is_podcast);
            String is_ringtone_s = cursor.getString(is_ringtone);
            String size_s = cursor.getString(size);
            String title_s = cursor.getString(title);
            String title_key_s = cursor.getString(title_key);
            String track_s = cursor.getString(track);
            String mime_type_s = cursor.getString(mime_type);
            String year_s = cursor.getString(year);

            list.add(new CVUMediaAudioFileBean(song_id_s, album_s , album_id_s, album_key_s, artist_s , artist_id_s , artist_key_s, bookmark_s , composer_s ,  data_s, date_added_s, date_modified_s, display_name_s,  duration_s , is_alarm_s, is_music_s, is_notification_s, is_podcast_s, is_ringtone_s, size_s, title_s, title_key_s, track_s, mime_type_s, year_s));
        }

        cursor.close();

		return list;
    }

    /**
     * 函数功能：获取全部图片文件
     *
     * @author：崔维友
     * @version：1.0.0
     */
    public static ArrayList<CVUMediaBaseBean> getImageFiles(Context ctx) {
        CVUMultipleMediaUtil.ctx = ctx;

        String[] projections = new String[]{
                MediaStore.Images.ImageColumns.BUCKET_DISPLAY_NAME,// bucket_display_name; 容器，图片所在文件夹
                MediaStore.Images.ImageColumns.BUCKET_ID,// bucket_id; 容器名称
                MediaStore.Images.ImageColumns.DATA,// _data; 文件路径
                MediaStore.Images.ImageColumns.DATE_ADDED,// date_added; 创建日期
                MediaStore.Images.ImageColumns.DATE_MODIFIED,// date_modified; 修改日期
                MediaStore.Images.ImageColumns.DATE_TAKEN,// datetaken; 拍摄日期
                MediaStore.Images.ImageColumns.DESCRIPTION,// description; 描述
                MediaStore.Images.ImageColumns.DISPLAY_NAME,// _display_name; 文件名
                MediaStore.Images.ImageColumns.HEIGHT,// height; 高
                MediaStore.Images.ImageColumns.IS_PRIVATE,// isprivate; 公开还是私有
                MediaStore.Images.ImageColumns.LATITUDE,// latitude; 拍摄地纬度
                MediaStore.Images.ImageColumns.LONGITUDE,// longitude; 拍摄地经度
                MediaStore.Images.ImageColumns.MIME_TYPE,// mime_type; 文件的mime类型
                MediaStore.Images.ImageColumns.MINI_THUMB_MAGIC,// mini_thumb_magic; 缩略图
                MediaStore.Images.ImageColumns.ORIENTATION,// orientation; 图片方向
                MediaStore.Images.ImageColumns.PICASA_ID,// picasa_id; 在picase系统中的id
                MediaStore.Images.ImageColumns.SIZE,// _size; 大小
                MediaStore.Images.ImageColumns.TITLE,// title; 图片标题-文件名
                MediaStore.Images.ImageColumns.WIDTH,// width; 宽
                MediaStore.Images.ImageColumns._ID,// 图片id
        };

        Cursor cursor = ctx.getContentResolver().query(URI_IMAGE, projections, null, null, null);
        Log.e(TAG, "图片文件数量：" + cursor.getCount());

        int bucket_display_name = cursor.getColumnIndexOrThrow(projections[0]);
        int bucket_id = cursor.getColumnIndexOrThrow(projections[1]);
        int data = cursor.getColumnIndexOrThrow(projections[2]);
        int date_added = cursor.getColumnIndexOrThrow(projections[3]);
        int date_modified = cursor.getColumnIndexOrThrow(projections[4]);
        int datetaken = cursor.getColumnIndexOrThrow(projections[5]);
        int description = cursor.getColumnIndexOrThrow(projections[6]);
        int display_name = cursor.getColumnIndexOrThrow(projections[7]);
        int height = cursor.getColumnIndexOrThrow(projections[8]);
        int isprivate = cursor.getColumnIndexOrThrow(projections[9]);
        int latitude = cursor.getColumnIndexOrThrow(projections[10]);
        int longitude = cursor.getColumnIndexOrThrow(projections[11]);
        int mime_type = cursor.getColumnIndexOrThrow(projections[12]);
        int mini_thumb_magic = cursor.getColumnIndexOrThrow(projections[13]);
        int orientation = cursor.getColumnIndexOrThrow(projections[14]);
        int picasa_id = cursor.getColumnIndexOrThrow(projections[15]);
        int size = cursor.getColumnIndexOrThrow(projections[16]);
        int title = cursor.getColumnIndexOrThrow(projections[17]);
        int width = cursor.getColumnIndexOrThrow(projections[18]);
        int img_id = cursor.getColumnIndexOrThrow(MediaStore.Images.ImageColumns._ID);

        ArrayList<CVUMediaBaseBean> list = new ArrayList<CVUMediaBaseBean>();

        while (cursor.moveToNext()) {
            String bucket_display_name_s = cursor.getString(bucket_display_name);
            String bucket_id_s = cursor.getString(bucket_id);
            String data_s = cursor.getString(data);
            String date_added_s = cursor.getString(date_added);
            String date_modified_s = cursor.getString(date_modified);
            String datetaken_s = cursor.getString(datetaken);
            String description_s = cursor.getString(description);
            String display_name_s = cursor.getString(display_name);
            String height_s = cursor.getString(height);
            String isprivate_s = cursor.getString(isprivate);
            String latitude_s = cursor.getString(latitude);
            String longitude_s = cursor.getString(longitude);
            String mime_type_s = cursor.getString(mime_type);
            String mini_thumb_magic_s = cursor.getString(mini_thumb_magic);
            String orientation_s = cursor.getString(orientation);
            String picasa_id_s = cursor.getString(picasa_id);
            String size_s = cursor.getString(size);
            String title_s = cursor.getString(title);
            String width_s = cursor.getString(width);
            String img_id_s = cursor.getString(img_id);

            list.add(new CVUMediaImageFileBean(img_id_s, bucket_display_name_s,  bucket_id_s , data_s ,  date_added_s,  date_modified_s, datetaken_s , description_s , display_name_s , height_s, isprivate_s , latitude_s ,  longitude_s ,  mime_type_s ,  mini_thumb_magic_s,  orientation_s, picasa_id_s, size_s, title_s, width_s));
        }

        cursor.close();

        return list;
    }

    /**
     * 函数功能：获取全部视频文件
     *
     * @author：崔维友
     * @version：1.0.0
     */
    public static ArrayList<CVUMediaBaseBean> getVideoFiles(Context ctx) {
        CVUMultipleMediaUtil.ctx = ctx;

        String[] projections = new String[]{
                MediaStore.Video.VideoColumns.ALBUM, // album";
                MediaStore.Video.VideoColumns.ARTIST, // artist";
                MediaStore.Video.VideoColumns.BOOKMARK, // bookmark";
                MediaStore.Video.VideoColumns.BUCKET_DISPLAY_NAME, // bucket_display_name";
                MediaStore.Video.VideoColumns.BUCKET_ID, // bucket_id";
                MediaStore.Video.VideoColumns.CATEGORY, // category";
                MediaStore.Video.VideoColumns.DATA, // _data";
                MediaStore.Video.VideoColumns.DATE_ADDED, // date_added
                MediaStore.Video.VideoColumns.DATE_MODIFIED, // date_modified
                MediaStore.Video.VideoColumns.DATE_TAKEN, // datetaken";
                MediaStore.Video.VideoColumns.DESCRIPTION, // description";
                MediaStore.Video.VideoColumns.DURATION, // duration";
                MediaStore.Video.VideoColumns.DISPLAY_NAME, // _display_name
                MediaStore.Video.VideoColumns.HEIGHT, // height";
                MediaStore.Video.VideoColumns.IS_PRIVATE, // isprivate";
                MediaStore.Video.VideoColumns.LANGUAGE, // language";
                MediaStore.Video.VideoColumns.LATITUDE, // latitude";
                MediaStore.Video.VideoColumns.LONGITUDE, // longitude";
                MediaStore.Video.VideoColumns.MINI_THUMB_MAGIC, // mini_thumb_magic";
                MediaStore.Video.VideoColumns.MIME_TYPE, // mini_type";
                MediaStore.Video.VideoColumns.RESOLUTION, // resolution";
                MediaStore.Video.VideoColumns.SIZE, // _size
                MediaStore.Video.VideoColumns.TAGS, // tags";
                MediaStore.Video.VideoColumns.TITLE, // title";
                MediaStore.Video.VideoColumns.WIDTH, // width";
                MediaStore.Video.VideoColumns._ID, // video_id";
        };

        Cursor cursor = ctx.getContentResolver().query(URI_VEDIO, projections, null, null, null);
        Log.e(TAG, "视频文件数量：" + cursor.getCount());

        int album = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.ALBUM);
        int artist = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.ARTIST);
        int bookmark = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.BOOKMARK);
        int bucket_display_name = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.BUCKET_DISPLAY_NAME);
        int bucket_id = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.BUCKET_ID);
        int category = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.CATEGORY);
        int data = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.DATA);
        int date_added = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.DATE_ADDED);
        int date_modified = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.DATE_MODIFIED);
        int date_taken = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.DATE_TAKEN);
        int description = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.DESCRIPTION);
        int duration = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.DURATION);
        int display_name = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.DISPLAY_NAME);
        int height = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.HEIGHT);
        int is_private = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.IS_PRIVATE);
        int language = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.LANGUAGE);
        int latitude = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.LATITUDE);
        int longitude = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.LONGITUDE);
        int mini_thumb_magic = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.MINI_THUMB_MAGIC);
        int mime_type = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.MIME_TYPE);
        int resolution = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.RESOLUTION);
        int size = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.SIZE);
        int tags = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.TAGS);
        int title = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.TITLE);
        int width = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns.WIDTH);
        int video_id = cursor.getColumnIndexOrThrow(MediaStore.Video.VideoColumns._ID);

        ArrayList<CVUMediaBaseBean> list = new ArrayList<CVUMediaBaseBean>();

        while (cursor.moveToNext()) {
            String album_s = cursor.getString(album);
            String artist_s = cursor.getString(artist);
            String bookmark_s = cursor.getString(bookmark);
            String bucket_display_name_s = cursor.getString(bucket_display_name);
            String bucket_id_s = cursor.getString(bucket_id);
            String category_s = cursor.getString(category);
            String data_s = cursor.getString(data);
            String date_added_s = cursor.getString(date_added);
            String date_modified_s = cursor.getString(date_modified);
            String date_taken_s = cursor.getString(date_taken);
            String description_s = cursor.getString(description);
            String duration_s = cursor.getString(duration);
            String display_name_s = cursor.getString(display_name);
            String height_s = cursor.getString(height);
            String is_private_s = cursor.getString(is_private);
            String language_s = cursor.getString(language);
            String latitude_s = cursor.getString(latitude);
            String longitude_s = cursor.getString(longitude);
            String mini_thumb_magic_s = cursor.getString(mini_thumb_magic);
            String mime_type_s = cursor.getString(mime_type);
            String resolution_s = cursor.getString(resolution);
            String size_s = cursor.getString(size);
            String tags_s = cursor.getString(tags);
            String title_s = cursor.getString(title);
            String width_s = cursor.getString(width);
            String video_id_s = cursor.getString(video_id);

            list.add(new CVUMediaVideoFileBean(album_s, artist_s, bookmark_s, bucket_display_name_s, bucket_id_s, category_s, data_s, date_added_s, date_modified_s, date_taken_s, description_s, duration_s, display_name_s, height_s, is_private_s, language_s, latitude_s, longitude_s, mini_thumb_magic_s, mime_type_s, resolution_s, size_s, tags_s, title_s, width_s, video_id_s));
        }

        cursor.close();

        return list;
    }
}
