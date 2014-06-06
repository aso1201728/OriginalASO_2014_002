package jp.ac.st.asojuku.original2014002;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		// ボタンをIDで探してボタン変数をつくる
		Button  btn_mente = (Button)findViewById(R.id.btn_mente);
		btn_mente.setOnClickListener(this);

		Button btn_touroku = (Button)findViewById(R.id.btn_touroku);
		btn_touroku.setOnClickListener(this);

		Button btn_check = (Button)findViewById(R.id.btn_check);
		btn_check.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ

		// 生成して代入用のIntentインスタンス変数を用意
		Intent intent = null;
		switch(v.getId()){	//どのボタンが押されたか判定
			case R.id.btn_mente:	// btn_menteが押された
				//	インテントのインスタンスを生成
				intent = new Intent(MainActivity.this, MaintenanceActivity.class);
				// 次画面のアクティビティ起動
				startActivity(intent);
				break;

			case R.id.btn_touroku:	// btn_tourokuが押された



				break;


			case R.id.btn_check:	// btn_checkが押された
				// インテントのインスタンスを生成
				intent = new Intent(MainActivity.this, HitokotoActivity.class);
				// 次画面のアクティビティ起動
				startActivity(intent);
				break;

		}


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
