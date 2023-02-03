package jp.co.lbm.lisst_test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // リストデータの作成
        val dataList = arrayListOf<Data>()
        for (i in 0..100){
            dataList.add(Data().apply {
                title = "${i}番目のタイトル"
                text =  "${i}番目のテキスト"
            })
        }
        // アダプターをセット
        val adapter = CustomAdapter(this, dataList)
        val listView = findViewById<ListView>(R.id.custom_list_view)
        listView.adapter = adapter
    }
}