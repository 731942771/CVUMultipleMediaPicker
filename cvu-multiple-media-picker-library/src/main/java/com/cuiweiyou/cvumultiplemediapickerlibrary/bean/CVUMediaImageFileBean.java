package com.cuiweiyou.cvumultiplemediapickerlibrary.bean;

import com.cuiweiyou.cvumultiplemediapickerlibrary.flag.CVUMultipleMediaPickerFlags;

/**
 * 类的说明：对图片文件封装体
 *
 * @author：崔维友
 * @version：1.0.0
 * @created：2016/10/011,16/10/12
 */

public class CVUMediaImageFileBean extends CVUMediaBaseBean {
	/** 文件类型标记 */
	private String flag = CVUMultipleMediaPickerFlags.RESOURCE_IMAGE;
	/** 图片id */
	private String img_id;
	/** 容器名称，图片所在的文件夹名称 */
	private String bucket_display_name;
	/** 容器id **/
	private String bucket_id;
	/** 图片的绝对路径 **/
	private String data;
	/** 创建日期，1970.1.1以来的毫秒数 **/
	private String date_added;
	/** 修改日期，1970.1.1以来的毫秒数 **/
	private String date_modified;
	/** 照片拍摄日期 **/
	private String datetaken;
	/** 描述 **/
	private String description;
	/** 文件名 **/
	private String display_name;
	/** 高px **/
	private String height;
	/** 公开的还是私有的 **/
	private String isprivate;
	/** 拍摄位置维度 **/
	private String latitude;
	/** 拍摄位置经度 **/
	private String longitude;
	/** 文件的mime类型 **/
	private String mime_type;
	/** 缩略图 **/
	private String mini_thumb_magic;
	/** 方向角度 **/
	private String orientation;
	/** 在picase中的id **/
	private String picasa_id;
	/** 文件大小byte **/
	private String size;
	/** 图片标题 **/
	private String title;
	/** 宽px **/
	private String width;

	public CVUMediaImageFileBean() {
	}

	/**
	 * 函数功能：
	 *
	 * @param img_id 图片id
	 * @param bucket_display_name 图片所在的文件夹名称
	 * @param bucket_id 文件夹id
	 * @param data 文件绝对路径
	 * @param date_added 创建日期
	 * @param date_modified 修改日期
	 * @param datetaken 拍摄日期
	 * @param description 描述
	 * @param display_name 文件名
	 * @param height 高px
	 * @param isprivate 是否公开或私有
	 * @param latitude 拍摄地点纬度
	 * @param longitude 拍摄地点经度
	 * @param mime_type 文件的mime类型
	 * @param mini_thumb_magic 缩略图
	 * @param orientation 图片方向
	 * @param picasa_id 图片再picasa中的id
	 * @param size 文件大小byte
	 * @param title 图片标题
	 * @param width 宽px
	 *
	 * @author：崔维友
	 * @version：1.0.0
	 */
	public CVUMediaImageFileBean(String img_id, String bucket_display_name, String bucket_id, String data, String date_added, String date_modified, String datetaken, String description, String display_name, String height, String isprivate, String latitude, String longitude, String mime_type, String mini_thumb_magic, String orientation, String picasa_id, String size, String title, String width) {
		this.tag = CVUMultipleMediaPickerFlags.FLAG_IMAGE_ONLY;

		this.img_id = img_id;
		this.bucket_display_name = bucket_display_name;
		this.bucket_id = bucket_id;
		this.data = data;
		this.date_added = date_added;
		this.date_modified = date_modified;
		this.datetaken = datetaken;
		this.description = description;
		this.display_name = display_name;
		this.height = height;
		this.isprivate = isprivate;
		this.latitude = latitude;
		this.longitude = longitude;
		this.mime_type = mime_type;
		this.mini_thumb_magic = mini_thumb_magic;
		this.orientation = orientation;
		this.picasa_id = picasa_id;
		this.size = size;
		this.title = title;
		this.width = width;
	}

	/** 图片id */
	public String getImg_id() {
		return img_id;
	}

	/** 图片id */
	public void setImg_id(String img_id) {
		this.img_id = img_id;
	}

	/** 容器名 **/
	public String getBucket_display_name() {
		return bucket_display_name;
	}

	/** 容器名 **/
	public void setBucket_display_name(String bucket_display_name) {
		this.bucket_display_name = bucket_display_name;
	}

	/** 容器id **/
	public String getBucket_id() {
		return bucket_id;
	}

	/** 容器id **/
	public void setBucket_id(String bucket_id) {
		this.bucket_id = bucket_id;
	}

	/** 文件路径 **/
	public String getData() {
		return data;
	}

	/** 文件路径 **/
	public void setData(String data) {
		this.data = data;
	}

	/** 创建日期 **/
	public String getDate_added() {
		return date_added;
	}

	/** 创建日期 **/
	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}

	/** 修改日期 **/
	public String getDate_modified() {
		return date_modified;
	}

	/** 修改日期 **/
	public void setDate_modified(String date_modified) {
		this.date_modified = date_modified;
	}

	/** 拍摄日期 **/
	public String getDatetaken() {
		return datetaken;
	}

	/** 拍摄日期 **/
	public void setDatetaken(String datetaken) {
		this.datetaken = datetaken;
	}

	/** 描述 **/
	public String getDescription() {
		return description;
	}

	/** 描述 **/
	public void setDescription(String description) {
		this.description = description;
	}

	/** 文件名 **/
	public String getDisplay_name() {
		return display_name;
	}

	/** 文件名 **/
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}

	/** 高 **/
	public String getHeight() {
		return height;
	}

	/** 高 **/
	public void setHeight(String height) {
		this.height = height;
	}

	/** 公开还是私有 **/
	public String getIsprivate() {
		return isprivate;
	}

	/** 公开还是私有 **/
	public void setIsprivate(String isprivate) {
		this.isprivate = isprivate;
	}

	/** 拍摄地纬度 **/
	public String getLatitude() {
		return latitude;
	}

	/** 拍摄地纬度 **/
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/** 拍摄地经度 **/
	public String getLongitude() {
		return longitude;
	}

	/** 拍摄地经度 **/
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/** 文件的mime类型 **/
	public String getMime_type() {
		return mime_type;
	}

	/** 文件的mime类型 **/
	public void setMime_type(String mime_type) {
		this.mime_type = mime_type;
	}

	/** 缩略图 **/
	public String getMini_thumb_magic() {
		return mini_thumb_magic;
	}

	/** 缩略图 **/
	public void setMini_thumb_magic(String mini_thumb_magic) {
		this.mini_thumb_magic = mini_thumb_magic;
	}

	/** 图片方向 **/
	public String getOrientation() {
		return orientation;
	}

	/** 图片方向 **/
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	/** 图片在picase中的id **/
	public String getPicasa_id() {
		return picasa_id;
	}

	/** 图片在picase中的id **/
	public void setPicasa_id(String picasa_id) {
		this.picasa_id = picasa_id;
	}

	/** 图片大小 **/
	public String getSize() {
		return size;
	}

	/** 图片大小 **/
	public void setSize(String size) {
		this.size = size;
	}

	/** 图片标题 **/
	public String getTitle() {
		return title;
	}

	/** 图片标题 **/
	public void setTitle(String title) {
		this.title = title;
	}

	/** 宽 **/
	public String getWidth() {
		return width;
	}

	/** 宽 **/
	public void setWidth(String width) {
		this.width = width;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "CVUMediaImageFileBean{" +
				"img_id='" + img_id + '\'' +
				", bucket_display_name='" + bucket_display_name + '\'' +
				", bucket_id='" + bucket_id + '\'' +
				", data='" + data + '\'' +
				", date_added='" + date_added + '\'' +
				", date_modified='" + date_modified + '\'' +
				", datetaken='" + datetaken + '\'' +
				", description='" + description + '\'' +
				", display_name='" + display_name + '\'' +
				", height='" + height + '\'' +
				", isprivate='" + isprivate + '\'' +
				", latitude='" + latitude + '\'' +
				", longitude='" + longitude + '\'' +
				", mime_type='" + mime_type + '\'' +
				", mini_thumb_magic='" + mini_thumb_magic + '\'' +
				", orientation='" + orientation + '\'' +
				", picasa_id='" + picasa_id + '\'' +
				", size='" + size + '\'' +
				", title='" + title + '\'' +
				", width='" + width + '\'' +
				", flag='" + flag + '\'' +
				'}';
	}
}
