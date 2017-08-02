package com.cuiweiyou.cvumultiplemediapickerlibrary.bean;

import com.cuiweiyou.cvumultiplemediapickerlibrary.flag.CVUMultipleMediaPickerFlags;

/**
 * 类的说明：对视频文件封装体
 *
 * @author：崔维友
 * @version：1.0.0
 * @created：2016/10/011,16/10/12
 */

public class CVUMediaVideoFileBean extends CVUMediaBaseBean {
	/** 文件类型标记 */
	private String flag = CVUMultipleMediaPickerFlags.RESOURCE_VIDEO;
	/** 文件名 */
	private String album;
	/** 艺术家 */
	private String artist;
	/** 书签 */
	private String bookmark;
	/** 容器，文件所在文件夹名称 */
	private String bucket_display_name;
	/** 容器id */
	private String bucket_id;
	/** 类别 */
	private String category;
	/** 文件路径 */
	private String data;
	/** 创建日期 1970.1.1以来的毫秒数 */
	private String date_added;
	/** 修改日期 1970.1.1以来的毫秒数 */
	private String date_modified;
	/** 拍摄日期 */
	private String date_taken;
	/** 描述 */
	private String description;
	/** 时长 */
	private String duration;
	/** 文件名 */
	private String display_name;
	/** 高 */
	private String height;
	/** 公开还是私有 */
	private String is_private;
	/** 语言 */
	private String language;
	/** 拍摄地纬度 */
	private String latitude;
	/** 拍摄地经度 */
	private String longitude;
	/**  */
	private String mini_thumb_magic;
	/**  */
	private String mime_type;
	/**  */
	private String resolution;
	/**  */
	private String size;
	/**  */
	private String tags;
	/**  */
	private String title;
	/**  */
	private String width;
	/**  */
	private String video_id;

	public CVUMediaVideoFileBean() {}

	/**
	 * 函数功能：
	 *
	 * @param album='null',
	 * @param artist='null',
	 * @param bookmark='null',
	 * @param bucket_display_name='Camera',
	 * @param bucket_id='-1739773001',
	 * @param category='null',
	 * @param data='/storage/emulated/0/DCIM/Camera/VID_20161012_134849.mp4',
	 * @param date_added='1476251329',
	 * @param date_modified='1476251329',
	 * @param date_taken='1476251329936',
	 * @param description='null',
	 * @param duration='8754',
	 * @param display_name='VID_20161012_134849.mp4',
	 * @param height='null',
	 * @param is_private='null',
	 * @param language='null',
	 * @param latitude='null',
	 * @param longitude='null',
	 * @param mini_thumb_magic='-1603196920537815166',
	 * @param mime_type='video/mp4',
	 * @param resolution='1920x1080',
	 * @param size='8663264',
	 * @param tags='null',
	 * @param title='VID_20161012_134849',
	 * @param width='null'
	 * @param video_id='5652',
	 *
	 * @author：崔维友
	 * @version：1.0.0
	 */
	public CVUMediaVideoFileBean(String album, String artist, String bookmark, String bucket_display_name, String bucket_id, String category, String data, String date_added, String date_modified, String date_taken, String description, String duration, String display_name, String height, String is_private, String language, String latitude, String longitude, String mini_thumb_magic, String mime_type, String resolution, String size, String tags, String title, String width, String video_id) {
		this.tag = CVUMultipleMediaPickerFlags.FLAG_VIDEO_ONLY;

		this.album = album;
		this.artist = artist;
		this.bookmark = bookmark;
		this.bucket_display_name = bucket_display_name;
		this.bucket_id = bucket_id;
		this.category = category;
		this.data = data;
		this.date_added = date_added;
		this.date_modified = date_modified;
		this.date_taken = date_taken;
		this.description = description;
		this.duration = duration;
		this.display_name = display_name;
		this.height = height;
		this.is_private = is_private;
		this.language = language;
		this.latitude = latitude;
		this.longitude = longitude;
		this.mini_thumb_magic = mini_thumb_magic;
		this.mime_type = mime_type;
		this.resolution = resolution;
		this.size = size;
		this.tags = tags;
		this.title = title;
		this.width = width;
		this.video_id = video_id;
	}

	/**  */
	public String getAlbum() {
		return album;
	}

	/**  */
	public void setAlbum(String album) {
		this.album = album;
	}

	/**  */
	public String getArtist() {
		return artist;
	}

	/**  */
	public void setArtist(String artist) {
		this.artist = artist;
	}

	/**  */
	public String getBookmark() {
		return bookmark;
	}

	/**  */
	public void setBookmark(String bookmark) {
		this.bookmark = bookmark;
	}

	/**  */
	public String getBucket_display_name() {
		return bucket_display_name;
	}

	/**  */
	public void setBucket_display_name(String bucket_display_name) {
		this.bucket_display_name = bucket_display_name;
	}

	/**  */
	public String getBucket_id() {
		return bucket_id;
	}

	/**  */
	public void setBucket_id(String bucket_id) {
		this.bucket_id = bucket_id;
	}

	/**  */
	public String getCategory() {
		return category;
	}

	/**  */
	public void setCategory(String category) {
		this.category = category;
	}

	/**  */
	public String getData() {
		return data;
	}

	/**  */
	public void setData(String data) {
		this.data = data;
	}

	/**  */
	public String getDate_added() {
		return date_added;
	}

	/**  */
	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}

	/**  */
	public String getDate_modified() {
		return date_modified;
	}

	/**  */
	public void setDate_modified(String date_modified) {
		this.date_modified = date_modified;
	}

	/**  */
	public String getDate_taken() {
		return date_taken;
	}

	/**  */
	public void setDate_taken(String date_taken) {
		this.date_taken = date_taken;
	}

	/**  */
	public String getDescription() {
		return description;
	}

	/**  */
	public void setDescription(String description) {
		this.description = description;
	}

	/**  */
	public String getDuration() {
		return duration;
	}

	/**  */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**  */
	public String getDisplay_name() {
		return display_name;
	}

	/**  */
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}

	/**  */
	public String getHeight() {
		return height;
	}

	/**  */
	public void setHeight(String height) {
		this.height = height;
	}

	/**  */
	public String getIs_private() {
		return is_private;
	}

	/**  */
	public void setIs_private(String is_private) {
		this.is_private = is_private;
	}

	/**  */
	public String getLanguage() {
		return language;
	}

	/**  */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**  */
	public String getLatitude() {
		return latitude;
	}

	/**  */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**  */
	public String getLongitude() {
		return longitude;
	}

	/**  */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**  */
	public String getMini_thumb_magic() {
		return mini_thumb_magic;
	}

	/**  */
	public void setMini_thumb_magic(String mini_thumb_magic) {
		this.mini_thumb_magic = mini_thumb_magic;
	}

	/**  */
	public String getMime_type() {
		return mime_type;
	}

	/**  */
	public void setMime_type(String mime_type) {
		this.mime_type = mime_type;
	}

	/**  */
	public String getResolution() {
		return resolution;
	}

	/**  */
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	/**  */
	public String getSize() {
		return size;
	}

	/**  */
	public void setSize(String size) {
		this.size = size;
	}

	/**  */
	public String getTags() {
		return tags;
	}

	/**  */
	public void setTags(String tags) {
		this.tags = tags;
	}

	/**  */
	public String getTitle() {
		return title;
	}

	/**  */
	public void setTitle(String title) {
		this.title = title;
	}

	/**  */
	public String getWidth() {
		return width;
	}

	/**  */
	public void setWidth(String width) {
		this.width = width;
	}

	/**  */
	public String getVideo_id() {
		return video_id;
	}

	/**  */
	public void setVideo_id(String video_id) {
		this.video_id = video_id;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "CVUMediaVideoFileBean{" +
				"video_id='" + video_id + '\'' +
				", album='" + album + '\'' +
				", artist='" + artist + '\'' +
				", bookmark='" + bookmark + '\'' +
				", bucket_display_name='" + bucket_display_name + '\'' +
				", bucket_id='" + bucket_id + '\'' +
				", category='" + category + '\'' +
				", data='" + data + '\'' +
				", date_added='" + date_added + '\'' +
				", date_modified='" + date_modified + '\'' +
				", date_taken='" + date_taken + '\'' +
				", description='" + description + '\'' +
				", duration='" + duration + '\'' +
				", display_name='" + display_name + '\'' +
				", height='" + height + '\'' +
				", is_private='" + is_private + '\'' +
				", language='" + language + '\'' +
				", latitude='" + latitude + '\'' +
				", longitude='" + longitude + '\'' +
				", mini_thumb_magic='" + mini_thumb_magic + '\'' +
				", mime_type='" + mime_type + '\'' +
				", resolution='" + resolution + '\'' +
				", size='" + size + '\'' +
				", tags='" + tags + '\'' +
				", title='" + title + '\'' +
				", width='" + width + '\'' +
				", flag='" + flag + '\'' +
				'}';
	}
}
