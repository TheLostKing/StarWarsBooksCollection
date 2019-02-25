package com.example.starwarsbookscollection;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] starWarsBooks = {"Star Wars FAD: Core Rulebook", "Star Wars FAD: Keeping the Peace", "Star Wars FAD: Endless Vigil", "Star Wars FAD: Disciples of Harmony", "Star Wars FAD: Savage Spirits", "Star Wars FAD: Knights of Fate", "Star Wars FAD: Unlimited Power"};

        setListAdapter(new ArrayAdapter<>(this, R.layout.activity_main, R.id.book, starWarsBooks));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch (position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.fantasyflightgames.com/en/products/star-wars-force-and-destiny/products/star-wars-force-and-destiny-core-rulebook/")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.fantasyflightgames.com/en/products/star-wars-force-and-destiny/products/keeping-peace/")));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.fantasyflightgames.com/en/products/star-wars-force-and-destiny/products/endless-vigil/")));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.fantasyflightgames.com/en/products/star-wars-force-and-destiny/products/disciples-of-harmony/")));
                break;
            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.fantasyflightgames.com/en/products/star-wars-force-and-destiny/products/savage-spirits/")));
                break;
            case 5:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.fantasyflightgames.com/en/products/star-wars-force-and-destiny/products/knights-fate/")));
                break;
            case 6:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.fantasyflightgames.com/en/products/star-wars-force-and-destiny/products/unlimited-power/")));
                break;
        }
    }
}
