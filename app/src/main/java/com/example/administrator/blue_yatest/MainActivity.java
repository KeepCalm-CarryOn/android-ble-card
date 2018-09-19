package com.example.administrator.blue_yatest;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private BluetoothAdapter mBluetoothAdapter;
    Context context;
    @Bind(R.id.button1)
    Button on;
    @Bind(R.id.button2)
    Button off;
    @Bind(R.id.button3)
    Button search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
    @OnClick(R.id.button1)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
    void OnClick(View view){
        //获得本地设备
        BluetoothManager bluetoothManager =
                (BluetoothManager) getSystemService(Context.BLUETOOTH_SERVICE);
        this. mBluetoothAdapter = bluetoothManager.getAdapter();
        //打开 蓝牙
        Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        startActivityForResult(turnOn, 0);//启动另一个 Activity


    }


    @OnClick(R.id.button2)
    void offClick(View view){
        Toast.makeText(getApplicationContext(),"Turned off",Toast.LENGTH_LONG).show();
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
    @OnClick(R.id.button3)
    void searchClick(View view){
        Toast.makeText(getApplicationContext(),"Turned search",Toast.LENGTH_LONG).show();
        BluetoothAdapter.LeScanCallback callback = new BluetoothAdapter.LeScanCallback() {
            @Override
            public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bytes) {

            }
        };
        // 横线 提示 此方法 已经过时了，不推荐使用了。
        mBluetoothAdapter.startLeScan(callback);
    }











}




