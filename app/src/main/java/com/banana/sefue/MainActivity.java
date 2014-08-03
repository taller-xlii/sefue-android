package com.banana.sefue;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * This Activity holds different fragments
 */
public class MainActivity extends Activity {

    private DrawerLayout _drawerLayout;
    private ActionBarDrawerToggle _drawerToggle;

    @Override
    protected void onCreate(Bundle savedStateBundle) {
        super.onCreate(savedStateBundle);
        setContentView(R.layout.activity_main);

        initDrawerLayout();
    }

    private void initDrawerLayout() {
        _drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        _drawerLayout.setDrawerShadow(android.R.drawable.divider_horizontal_dark, GravityCompat.START);
        _drawerToggle = new ActionBarDrawerToggle(this, _drawerLayout,
                R.drawable.ic_launcher, R.string.abc_action_bar_home_description,
                R.string.abc_action_mode_done) {
            @Override
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                invalidateOptionsMenu();
            }

            @Override
            public void onDrawerOpened(View view) {
                super.onDrawerOpened(view);
                invalidateOptionsMenu();
            }
        };

        _drawerLayout.setDrawerListener(_drawerToggle);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        _drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggle
        _drawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Pass the event to ActionBarDrawerToggle, if it returns
        // true, then it has handled the app icon touch event
        if (_drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

