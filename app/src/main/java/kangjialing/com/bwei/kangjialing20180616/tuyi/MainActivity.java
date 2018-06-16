package kangjialing.com.bwei.kangjialing20180616.tuyi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import kangjialing.com.bwei.kangjialing20180616.R;
import kangjialing.com.bwei.kangjialing20180616.tuer.TuEr;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.main_button01)
    Button mainButton01;
    @BindView(R.id.main_button02)
    Button mainButton02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.main_button01, R.id.main_button02})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.main_button01:
                startActivity(new Intent(this, TuYi.class));
                break;
            case R.id.main_button02:
                startActivity(new Intent(this, TuEr.class));
                break;
        }
    }
}
