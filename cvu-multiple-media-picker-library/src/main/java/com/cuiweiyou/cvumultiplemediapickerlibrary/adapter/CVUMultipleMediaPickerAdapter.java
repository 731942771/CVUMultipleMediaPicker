package com.cuiweiyou.cvumultiplemediapickerlibrary.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cuiweiyou.cvumultiplemediapickerlibrary.R;
import com.cuiweiyou.cvumultiplemediapickerlibrary.bean.CVUMediaAudioFileBean;
import com.cuiweiyou.cvumultiplemediapickerlibrary.bean.CVUMediaBaseBean;
import com.cuiweiyou.cvumultiplemediapickerlibrary.bean.CVUMediaImageFileBean;
import com.cuiweiyou.cvumultiplemediapickerlibrary.bean.CVUMediaVideoFileBean;
import com.cuiweiyou.cvumultiplemediapickerlibrary.flag.CVUMultipleMediaPickerFlags;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * 类的说明：文件展示格子控件的适配器
 *
 * @author：崔维友
 * @version：1.0.0
 */

public class CVUMultipleMediaPickerAdapter extends BaseAdapter implements View.OnClickListener {
	private Context ctx;
	private ArrayList<CVUMediaBaseBean> list;
	private ArrayList<CVUMediaBaseBean> selected;

	public CVUMultipleMediaPickerAdapter(Context ctx, Map<String, ArrayList<CVUMediaBaseBean>> files) {
		this.ctx = ctx;
		this.list = new ArrayList<CVUMediaBaseBean>();
		this.selected = new ArrayList<CVUMediaBaseBean>();

		Collection<ArrayList<CVUMediaBaseBean>> values = files.values();
		for (List v : values) {
			list.addAll(v);
		}
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public int getItemViewType(int position) {
		if (CVUMultipleMediaPickerFlags.FLAG_IMAGE_ONLY == list.get(position).tag) {
			return 1; // 图片
		} else if (CVUMultipleMediaPickerFlags.FLAG_AUDIO_ONLY == list.get(position).tag) {
			return 2; // 音频
		} else if (CVUMultipleMediaPickerFlags.FLAG_VIDEO_ONLY == list.get(position).tag) {
			return 3; // 视频
		}

		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Holder holder = null;
		if(null == convertView) {
			holder = new Holder();

			convertView = View.inflate(ctx, R.layout.item_cvumultiple_media_picker, null);
			holder.vTitle = (TextView) convertView.findViewById(R.id.title);
			holder.vImg = (ImageView) convertView.findViewById(R.id.img);
			holder.vCheck = (ImageView) convertView.findViewById(R.id.chk);

			holder.vImg.setOnClickListener(this);
			holder.vCheck.setOnClickListener(this);

			convertView.setTag(holder);
		} else {
			holder = (Holder) convertView.getTag();
		}

		holder.vImg.setTag(position);
		holder.vCheck.setTag(position);

		int type = getItemViewType(position);

		CVUMediaBaseBean baseb = list.get(position);
		if(selected.contains(baseb)){
			Picasso.with(ctx).load(R.drawable.chked).into(holder.vCheck);
		} else {
			Picasso.with(ctx).load(R.drawable.unchk).into(holder.vCheck);
		}

		switch (type) {
			case 1: { // 图片
				CVUMediaImageFileBean bean = (CVUMediaImageFileBean) baseb;
				holder.vTitle.setText(bean.getTitle());

				Picasso
						.with(ctx)
						.load(new File(bean.getData()))
						.error(R.drawable.thumb_image)
						.resize(200, 200)
						.config(Bitmap.Config.RGB_565)
						.memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE)
						.into(holder.vImg);
				break;
			}
			case 2: { // 音频
				CVUMediaAudioFileBean bean = (CVUMediaAudioFileBean) baseb;
				holder.vTitle.setText(bean.getDisplay_name());

				Picasso
						.with(ctx)
						.load(R.drawable.thumb_audio)
						.resize(200, 200)
						.config(Bitmap.Config.RGB_565)
						.memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE)
						.into(holder.vImg);
				break;
			}
			case 3: { // 视频
				CVUMediaVideoFileBean bean = (CVUMediaVideoFileBean) baseb;
				holder.vTitle.setText(bean.getDisplay_name());

				Picasso
						.with(ctx)
						.load(R.drawable.thumb_video)
						.resize(200, 200)
						.config(Bitmap.Config.RGB_565)
						.memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE)
						.into(holder.vImg);
				break;
			}
		}

		return convertView;
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		int position = (int) v.getTag();

		if(id == R.id.img || id == R.id.chk){
			if(selected.contains(list.get(position))){
				selected.remove(list.get(position));
			} else {
				selected.add(list.get(position));
			}

			notifyDataSetChanged();
		}

	}

	public ArrayList<CVUMediaBaseBean> getSelected(){
		ArrayList<CVUMediaBaseBean> lt = new ArrayList<CVUMediaBaseBean>();

		// 深拷贝
		Collections.addAll(lt,  new CVUMediaBaseBean[selected.size()]);
		Collections.copy(lt, selected);

		this.list.clear();
		this.list = null;
		this.selected.clear();
		this.selected = null;

		return lt;
	}

	class Holder {
		TextView vTitle;
		ImageView vImg;
		ImageView vCheck;
	}
}
