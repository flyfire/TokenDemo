package war3.pub.tokendemo.demo2.login;

import android.os.Bundle;

import war3.pub.tokendemo.R;
import war3.pub.tokendemo.base.BaseActivity;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_content, new LoginFragment()).commit();
    }
}
