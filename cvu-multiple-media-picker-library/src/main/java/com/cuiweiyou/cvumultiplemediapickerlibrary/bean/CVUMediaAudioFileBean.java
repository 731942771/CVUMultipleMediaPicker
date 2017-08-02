package com.cuiweiyou.cvumultiplemediapickerlibrary.bean;

import com.cuiweiyou.cvumultiplemediapickerlibrary.flag.CVUMultipleMediaPickerFlags;

/**
 * 类的说明：对音频文件封装体
 *
 * @author：崔维友
 * @version：1.0.0
 * @created：2016/10/011,16/10/11
 */

public class CVUMediaAudioFileBean extends CVUMediaBaseBean {

	/** 文件类型标记 */
	private String flag = CVUMultipleMediaPickerFlags.RESOURCE_AUDIO;
	/**
	 * 歌曲id
	 */
	private String song_id;
	/**
	 * 歌曲所属的专辑-唱片集
	 */
	private String album;
	/**
	 * 专辑的id
	 */
	private String album_id;
	/**
	 * 专辑的key
	 */
	private String album_key;
	/**
	 * 艺术家/歌手/作者
	 */
	private String artist;
	/**
	 * 艺术家id
	 */
	private String artist_id;
	/**
	 * 艺术家key
	 */
	private String artist_key;
	/**
	 * 书签
	 */
	private String bookmark;
	/**
	 * 作曲者
	 */
	private String composer;
	/**
	 * 文件地址/音频文件全路径
	 */
	private String data;
	/**
	 * 添加日期/加入日期/增加日期/上架日期。1970.1.1起的毫秒数
	 */
	private String date_added;
	/**
	 * 修改日期/最后修改变更日期。1970.1.1起的毫秒数
	 */
	private String date_modified;
	/**
	 * 文件名
	 */
	private String display_name;
	/**
	 * 毫秒时长
	 */
	private String duration;
	/**
	 * 是否是提示铃声。0=不是，1=是
	 */
	private String is_alarm;
	/**
	 * 是否为正常音乐文件。0=不是，1=是
	 */
	private String is_music;
	/**
	 * 是否是通知的提示音。0=不是，1=是
	 */
	private String is_notification;
	/**
	 * 是否是播客音频。0=不是，1=是
	 */
	private String is_podcast;
	/**
	 * 是否是手机来电铃声。0=不是，1=是
	 */
	private String is_ringtone;
	/**
	 * 文件大小，byte-字节
	 */
	private String size;
	/**
	 * 歌曲名称
	 */
	private String title;
	/**
	 * 歌曲名称key
	 */
	private String title_key;
	/**
	 * 音轨
	 */
	private String track;
	/**
	 * 音频文件的mime类型
	 */
	private String mime_type;
	/**
	 * 发行年
	 */
	private String year;

	public CVUMediaAudioFileBean() {
	}

	/**
	 * 函数功能：
	 *
	 * @param song_id 歌曲id
	 * @param album 歌曲所属的专辑-唱片集
	 * @param album_id 专辑的id
	 * @param album_key 专辑的key
	 * @param artist 艺术家/歌手/作者
	 * @param artist_id 艺术家id
	 * @param artist_key 艺术家key
	 * @param bookmark 书签
	 * @param composer 作曲者
	 * @param data 文件地址/音频文件全路径
	 * @param date_added 添加日期/加入日期/增加日期/上架日期。1970.1.1起的毫秒数
	 * @param date_modified 修改日期/最后修改变更日期。1970.1.1起的毫秒数
	 * @param display_name 文件名
	 * @param duration 毫秒时长
	 * @param is_alarm 是否是提示铃声。0=不是，1=是
	 * @param is_music 是否为正常音乐文件。0=不是，1=是
	 * @param is_notification 是否是通知的提示音。0=不是，1=是
	 * @param is_podcast 是否是播客音频。0=不是，1=是
	 * @param is_ringtone 是否是手机来电铃声。0=不是，1=是
	 * @param size 文件大小，byte-字节
	 * @param title 歌曲名称
	 * @param title_key 歌曲名称key
	 * @param track 音轨
	 * @param mime_type 音频文件的mime类型
	 * @param year 发行年
	 *
	 * @author：崔维友
	 * @version：1.0.0
	 */
	public CVUMediaAudioFileBean(String song_id, String album, String album_id, String album_key, String artist, String artist_id, String artist_key, String bookmark, String composer, String data, String date_added, String date_modified, String display_name, String duration, String is_alarm, String is_music, String is_notification, String is_podcast, String is_ringtone, String size, String title, String title_key, String track, String mime_type, String year) {
		this.tag = CVUMultipleMediaPickerFlags.FLAG_AUDIO_ONLY;

		this.song_id = song_id;
		this.album = album;
		this.album_id = album_id;
		this.album_key = album_key;
		this.artist = artist;
		this.artist_id = artist_id;
		this.artist_key = artist_key;
		this.bookmark = bookmark;
		this.composer = composer;
		this.data = data;
		this.date_added = date_added;
		this.date_modified = date_modified;
		this.display_name = display_name;
		this.duration = duration;
		this.is_alarm = is_alarm;
		this.is_music = is_music;
		this.is_notification = is_notification;
		this.is_podcast = is_podcast;
		this.is_ringtone = is_ringtone;
		this.size = size;
		this.title = title;
		this.title_key = title_key;
		this.track = track;
		this.mime_type = mime_type;
		this.year = year;
	}

	/** 歌曲id */
	public String getSong_id() {
		return song_id;
	}

	/** 歌曲id */
	public void setSong_id(String song_id) {
		this.song_id = song_id;
	}

	/** 专辑 */
	public String getAlbum() {
		return album;
	}

	/** 专辑 */
	public void setAlbum(String album) {
		this.album = album;
	}

	/** 专辑id */
	public String getAlbum_id() {
		return album_id;
	}

	/** 专辑id */
	public void setAlbum_id(String album_id) {
		this.album_id = album_id;
	}

	/** 专辑key */
	public String getAlbum_key() {
		return album_key;
	}

	/** 专辑key */
	public void setAlbum_key(String album_key) {
		this.album_key = album_key;
	}

	/** 艺术家-演唱者-歌手 */
	public String getArtist() {
		return artist;
	}

	/** 艺术家-演唱者-歌手 */
	public void setArtist(String artist) {
		this.artist = artist;
	}

	/** 歌手id */
	public String getArtist_id() {
		return artist_id;
	}

	/** 歌手id */
	public void setArtist_id(String artist_id) {
		this.artist_id = artist_id;
	}

	/** 歌手key */
	public String getArtist_key() {
		return artist_key;
	}

	/** 歌手key */
	public void setArtist_key(String artist_key) {
		this.artist_key = artist_key;
	}

	/** 书签 */
	public String getBookmark() {
		return bookmark;
	}

	/** 书签 */
	public void setBookmark(String bookmark) {
		this.bookmark = bookmark;
	}

	/** 作曲者 */
	public String getComposer() {
		return composer;
	}

	/** 作曲者 */
	public void setComposer(String composer) {
		this.composer = composer;
	}

	/** 文件路径 */
	public String getData() {
		return data;
	}

	/** 文件路径 */
	public void setData(String data) {
		this.data = data;
	}

	/** 创建日期。1970.1.1起的毫秒数 */
	public String getDate_added() {
		return date_added;
	}

	/** 创建日期。1970.1.1起的毫秒数 */
	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}

	/** 修改日期。1970.1.1起的毫秒数 */
	public String getDate_modified() {
		return date_modified;
	}

	/** 修改日期。1970.1.1起的毫秒数 */
	public void setDate_modified(String date_modified) {
		this.date_modified = date_modified;
	}

	/** 文件名 */
	public String getDisplay_name() {
		return display_name;
	}

	/** 文件名 */
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}

	/** 时长毫秒 */
	public String getDuration() {
		return duration;
	}

	/** 时长毫秒 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/** 是否为提示音。0=不是，1=是 */
	public String getIs_alarm() {
		return is_alarm;
	}

	/** 是否为提示音。0=不是，1=是 */
	public void setIs_alarm(String is_alarm) {
		this.is_alarm = is_alarm;
	}

	/** 是否为音乐文件。0=不是，1=是 */
	public String getIs_music() {
		return is_music;
	}

	/** 是否为音乐文件。0=不是，1=是 */
	public void setIs_music(String is_music) {
		this.is_music = is_music;
	}

	/** 是否为通知铃声。0=不是，1=是 */
	public String getIs_notification() {
		return is_notification;
	}

	/** 是否为通知铃声。0=不是，1=是 */
	public void setIs_notification(String is_notification) {
		this.is_notification = is_notification;
	}

	/** 是否是播客音频。0=不是，1=是 */
	public String getIs_podcast() {
		return is_podcast;
	}

	/** 是否是播客音频。0=不是，1=是 */
	public void setIs_podcast(String is_podcast) {
		this.is_podcast = is_podcast;
	}

	/** 是否是来电铃声。0=不是，1=是 */
	public String getIs_ringtone() {
		return is_ringtone;
	}

	/** 是否是来电铃声。0=不是，1=是 */
	public void setIs_ringtone(String is_ringtone) {
		this.is_ringtone = is_ringtone;
	}

	/** 文件大小字节byte */
	public String getSize() {
		return size;
	}

	/** 文件大小字节byte */
	public void setSize(String size) {
		this.size = size;
	}

	/** 歌曲标题 */
	public String getTitle() {
		return title;
	}

	/** 歌曲标题 */
	public void setTitle(String title) {
		this.title = title;
	}

	/** 歌曲标题key */
	public String getTitle_key() {
		return title_key;
	}

	/** 歌曲标题key */
	public void setTitle_key(String title_key) {
		this.title_key = title_key;
	}

	/** 音轨 */
	public String getTrack() {
		return track;
	}

	/** 音轨 */
	public void setTrack(String track) {
		this.track = track;
	}

	/** 文件的mime类型 */
	public String getMime_type() {
		return mime_type;
	}

	/** 文件的mime类型 */
	public void setMime_type(String mime_type) {
		this.mime_type = mime_type;
	}

	/** 发行日期 */
	public String getYear() {
		return year;
	}

	/** 发行日期 */
	public void setYear(String year) {
		this.year = year;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "CVUMediaAudioFileBean{" +
				"song_id='" + song_id + '\'' +
				", album='" + album + '\'' +
				", album_id='" + album_id + '\'' +
				", album_key='" + album_key + '\'' +
				", artist='" + artist + '\'' +
				", artist_id='" + artist_id + '\'' +
				", artist_key='" + artist_key + '\'' +
				", bookmark='" + bookmark + '\'' +
				", composer='" + composer + '\'' +
				", data='" + data + '\'' +
				", date_added='" + date_added + '\'' +
				", date_modified='" + date_modified + '\'' +
				", display_name='" + display_name + '\'' +
				", duration='" + duration + '\'' +
				", is_alarm='" + is_alarm + '\'' +
				", is_music='" + is_music + '\'' +
				", is_notification='" + is_notification + '\'' +
				", is_podcast='" + is_podcast + '\'' +
				", is_ringtone='" + is_ringtone + '\'' +
				", size='" + size + '\'' +
				", title='" + title + '\'' +
				", title_key='" + title_key + '\'' +
				", track='" + track + '\'' +
				", mime_type='" + mime_type + '\'' +
				", year='" + year + '\'' +
				", flag='" + flag + '\'' +
				'}';
	}
}
