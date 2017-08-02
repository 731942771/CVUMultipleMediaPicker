package com.cuiweiyou.cvumultiplemediapickerlibrary.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import com.cuiweiyou.cvumultiplemediapickerlibrary.R;
import com.cuiweiyou.cvumultiplemediapickerlibrary.adapter.CVUMultipleMediaPickerAdapter;
import com.cuiweiyou.cvumultiplemediapickerlibrary.back.CVUMultipleMediaBack;
import com.cuiweiyou.cvumultiplemediapickerlibrary.bean.CVUMediaBaseBean;
import com.cuiweiyou.cvumultiplemediapickerlibrary.flag.CVUMultipleMediaPickerFlags;
import com.cuiweiyou.cvumultiplemediapickerlibrary.task.CVUMultipleMediaPickerTask;

import java.util.ArrayList;
import java.util.Map;

public class CVUMultipleMediaPickerActivity extends Activity implements CVUMultipleMediaBack {

	/** 资源展示/选择器 */
	private GridView picker;
	private ProgressDialog progressDialog;
	private CVUMultipleMediaPickerFlags key;
	private CVUMultipleMediaPickerAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cvumultiple_media_picker);

		key = (CVUMultipleMediaPickerFlags) getIntent().getSerializableExtra(CVUMultipleMediaPickerFlags.FLAG_KEY);

		picker = (GridView) findViewById(R.id.picker);

		progressDialog = new ProgressDialog(this);
		progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
		progressDialog.setMessage("正在加载...");
		progressDialog.show();

		new CVUMultipleMediaPickerTask(this, this, key).execute();
	}

	@Override
	public void getMultipleMediaFiles(Map<String, ArrayList<CVUMediaBaseBean>> result) {
		progressDialog.dismiss();

		adapter = new CVUMultipleMediaPickerAdapter(this, result);
		picker.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(1, 1, 1, "确定").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // 添加选中事件
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				ArrayList<CVUMediaBaseBean> list = adapter.getSelected();

				Intent data = new Intent();
				data.putExtra("data", list);
				setResult(CVUMultipleMediaPickerFlags.RESULT_CODE, data);

				finish();

				return true;
			}
		});

		return super.onCreateOptionsMenu(menu);
	}
}
