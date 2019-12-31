package com.example.firebasedatabase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //keyhash và sha1
        //node: chỉ có key thôi(Cha)
        // và child : đủ 1 cặp key và value(con)

        //1: gửi lên là string
//        myRef.child("trungtam").setValue("Khoa Pham training").addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()) {
//                    Toast.makeText(MainActivity.this, "Thanh Cong", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(MainActivity.this, "That bai", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
        //object
//        Sinhvien sinhvien = new Sinhvien("Nguyễn Văn A", "20");
//        myRef.child("sinhvien")
//                .setValue(sinhvien)
//                .addOnCompleteListener(new OnCompleteListener<Void>() {
//                    @Override
//                    public void onComplete(@NonNull Task<Void> task) {
//                        if (task.isSuccessful()) {
//                            Toast.makeText(MainActivity.this, "Thanh Cong", Toast.LENGTH_SHORT).show();
//                        } else {
//                            Toast.makeText(MainActivity.this, "That bai", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
        //hashmap
        HashMap<String, String> map = new HashMap<>();
        map.put("xe 2 banh", "xe dap");
        map.put("xe 4 banh", "xe hoi");
        myRef.child("xe hoi")
                .setValue(map)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(MainActivity.this, "Thanh Cong", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, "That bai", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
