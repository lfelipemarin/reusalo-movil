package com.reusalo.app.reusalo.activities;


import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.reusalo.app.reusalo.R;
import com.reusalo.app.reusalo.fragments.AboutFragment;
import com.reusalo.app.reusalo.fragments.BalanzaFragment;
import com.reusalo.app.reusalo.fragments.ConfigFragment;
import com.reusalo.app.reusalo.fragments.CuentaFragment;
import com.reusalo.app.reusalo.fragments.FavsFragment;
import com.reusalo.app.reusalo.fragments.MsjsFragment;
import com.reusalo.app.reusalo.fragments.TopFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
    NavigationView navigationView;
    private MenuItem currentItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close) {
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                invalidateOptionsMenu();
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                invalidateOptionsMenu();
            }
        };
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        if (savedInstanceState == null) {
            Fragment fragment = new TopFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
            navigationView.setCheckedItem(R.id.nav_inicio);
        }

        getSupportFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
            @Override
            public void onBackStackChanged() {
                FragmentManager fm = getSupportFragmentManager();
                String stackName = null;
//                int backCount = fm.getBackStackEntryCount();
//                if (backCount == 0) {
//                    finish();
//                }
                for (int entry = 0; entry < fm.getBackStackEntryCount(); entry++) {
                    stackName = fm.getBackStackEntryAt(entry).getName();
                    Log.i("BC", "stackEntry" + entry);
                }
                if (stackName != null) {
                    if (stackName.equals("CuentaFragment")) {
                        navigationView.setCheckedItem(R.id.nav_cuenta);
                    } else if (stackName.equals("BalanzaFragment")) {
                        navigationView.setCheckedItem(R.id.nav_balanza);
                    } else if (stackName.equals("FavsFragment")) {
                        navigationView.setCheckedItem(R.id.nav_favs);
                    } else if (stackName.equals("MsjsFragment")) {
                        navigationView.setCheckedItem(R.id.nav_msjs);
                    } else if (stackName.equals("ConfigFragment")) {
                        navigationView.setCheckedItem(R.id.nav_conf);
                    } else if (stackName.equals("AboutFragment")) {
                        navigationView.setCheckedItem(R.id.nav_about);
                    } else {
                        navigationView.setCheckedItem(R.id.nav_inicio);
                    }
                } else {
                    navigationView.setCheckedItem(R.id.nav_inicio);
                }
            }
        });
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean drawerOpen = drawer.isDrawerOpen(navigationView);
        menu.findItem(R.id.action_settings).setVisible(!drawerOpen);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        Fragment fragment = null;

        Class fragmentClass;
        switch (item.getItemId()) {
            case R.id.nav_cuenta:
                fragmentClass = CuentaFragment.class;
                break;
            case R.id.nav_balanza:
                fragmentClass = BalanzaFragment.class;
                break;
            case R.id.nav_favs:
                fragmentClass = FavsFragment.class;
                break;
            case R.id.nav_msjs:
                fragmentClass = MsjsFragment.class;
                break;
            case R.id.nav_conf:
                fragmentClass = ConfigFragment.class;
                break;
            case R.id.nav_about:
                fragmentClass = AboutFragment.class;
                break;
            default:
                fragmentClass = TopFragment.class;
        }

        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Insert the fragment by replacing any existing fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.addToBackStack(fragment.getClass().getSimpleName());
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.commit();


        // Highlight the selected item, update the title, and close the drawer
        // Highlight the selected item has been done by NavigationView
        // menuItem.setChecked(true);
        //setTitle(menuItem.getTitle());
        //mDrawer.closeDrawers();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}