package com.example.mealchooser2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.Toast;


public class ProductSetter extends AppCompatActivity
{

    private LinearLayout mProductEditTextContainer;
    private static final int maxEditTextNum = 10;
    private EditText etProductsSetter[];
    private TextView mTextMessage;
    private static int llID;
    private Button mAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_setter);

        etProductsSetter = new EditText[maxEditTextNum];
        llID = R.id.llProductEditTextContainer;


        for(int i=0; i < maxEditTextNum; ++i)
        {
            etProductsSetter[i] = new EditText(this);
            mProductEditTextContainer = (LinearLayout) findViewById(R.id.llProductEditTextContainer);
            //EditText etProductsSetter = new EditText(ProductSetter.this.getApplicationContext());

            etProductsSetter[i].setLayoutParams(new
                    ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT,
                    ActionBar.LayoutParams.WRAP_CONTENT));

            etProductsSetter[i].setText(i+"");
            etProductsSetter[i].setId(llID+1 + i);
            //etProductsSetter[i].setTag("etProductsSetter"+i);
            etProductsSetter[i].setMaxLines(1);
            etProductsSetter[i].setTextColor(Color.BLACK);
            mProductEditTextContainer.addView(etProductsSetter[i]);
        }

        /*mAccept = (Button) findViewById(R.id.bAccept);
        mAccept.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Toast.makeText(ProductSetter.this, "2345", Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}
