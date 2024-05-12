package com.example.travel_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class travel_service extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_service);
        Button btn1=findViewById(R.id.btn_1);
        Button btn2=findViewById(R.id.btn_2);
        Button btn3=findViewById(R.id.btn_3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title="الخدمات العلاجية";
                String details="عندما يخطط المريض للسفر إلى ألمانيا من أجل السياحة العلاجية، فإن طلبه الأساسي هو الخضوع للعلاج في أفضل مستشفى.\n" +
                        "\n" +
                        "هناك 3 مؤسسات طبية معروفة بخدماتها الطبية عالية الجودة والأطباء المحترفين ومعدلات استشفاء تصل إلى 100%\n" +
                        "1.  Asklepios\n" +
                        "2.  Charité\n"+
                        "3.  Solingen ";
                Intent intent=new Intent(travel_service.this, details.class);
                intent.putExtra("title",title);
                intent.putExtra("details",details);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title="الخدمات السياحية";
                String details="بالنسبة للسياحة، يقوم المكتب بتصميم برامج سياحية مخصصة تتناسب مع احتياجات ورغبات العملاء. يمكن للعملاء اختيار وجهتهم المفضلة والأنشطة التي يرغبون في القيام بها، ويقوم المكتب بترتيب كل التفاصيل بدءًا من حجوزات الرحلات والإقامة وصولاً إلى ترتيب الجولات السياحية والمرشدين السياحيين.";
                Intent intent=new Intent(travel_service.this,details.class);
                intent.putExtra("title",title);
                intent.putExtra("details",details);
                startActivity(intent);
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title="الخدمات التعليمية";
                String details="بالنسبة للتعليم والابتعاث، يقدم المكتب خدمات للطلاب الذين يرغبون في الدراسة في الخارج أو الحصول على تأشيرة دراسية. يساعد المكتب الطلاب في اختيار الدولة والمؤسسة التعليمية المناسبة وترتيب القبول الأكاديمي وتأمين إقامة مريحة ومساعدة في إجراءات التأشيرة والسفر.";
                Intent intent=new Intent(travel_service.this,details.class);
                intent.putExtra("title",title);
                intent.putExtra("details",details);
                startActivity(intent);
            }
        });
    }
}