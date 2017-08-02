package com.cuiweiyou.cvumultiplemediapickertest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.cuiweiyou.cvumultiplemediapickerlibrary.activity.CVUMultipleMediaPickerActivity;
import com.cuiweiyou.cvumultiplemediapickerlibrary.bean.CVUMediaBaseBean;
import com.cuiweiyou.cvumultiplemediapickerlibrary.flag.CVUMultipleMediaPickerFlags;

import java.util.ArrayList;

public class MainActivity extends Activity {

	private final int PERMISSION_CODE = 1000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void select(View view) {
		Intent i = new Intent(this, CVUMultipleMediaPickerActivity.class);
		i.putExtra(CVUMultipleMediaPickerFlags.FLAG_KEY, CVUMultipleMediaPickerFlags.FLAG_ALL);
		startActivityForResult(i, CVUMultipleMediaPickerFlags.REQUEST_CODE);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		if (requestCode == CVUMultipleMediaPickerFlags.REQUEST_CODE && resultCode == CVUMultipleMediaPickerFlags.RESULT_CODE) {
			ArrayList<CVUMediaBaseBean> list = (ArrayList<CVUMediaBaseBean>) data.getSerializableExtra("data");

			Log.e("ard", "多媒体数量：" + list.size());
			Toast.makeText(this, "多媒体数量：" + list.size(), Toast.LENGTH_LONG).show();
		}
	}
}
