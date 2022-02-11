package ca.dal.csci3130.quickcash.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import ca.dal.csci3130.quickcash.MainActivity;
import ca.dal.csci3130.quickcash.R;
import ca.dal.csci3130.quickcash.usermanagement.LoginActivity;
import ca.dal.csci3130.quickcash.usermanagement.SessionManager;

public class EmployeeHomeActivity extends AppCompatActivity {

    @Override
    //Prevent user from using back button once logged in
    public void onBackPressed () {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_home);
    }

    /**
     * Deletes session and opens login screen
     *
     * @param view
     */

    public void logout(View view) {
        SessionManager session = new SessionManager(EmployeeHomeActivity.this);
        session.logoutUser();

        moveToLoginActivity();
    }

    private void moveToLoginActivity() {
        Intent intent = new Intent(EmployeeHomeActivity.this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}