package in.bitcode.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerCities;
    private String[] mArrCities = {
            "Pune-0", "Mumbai-0", "Delhi-0", "Chennai-0", "Jaipur-0",
            "Pune-1", "Mumbai-1", "Delhi-1", "Chennai-1", "Jaipur-1",
            "Pune-2", "Mumbai-2", "Delhi-2", "Chennai-2", "Jaipur-2",
            "Pune-3", "Mumbai-3", "Delhi-3", "Chennai-3", "Jaipur-3",
            "Pune-4", "Mumbai-4", "Delhi-4", "Chennai-4", "Jaipur-4",
            "Pune-5", "Mumbai-5", "Delhi-5", "Chennai-5", "Jaipur-5",
            "Pune-6", "Mumbai-6", "Delhi-6", "Chennai-6", "Jaipur-6",
            "Pune-7", "Mumbai-7", "Delhi-7", "Chennai-7", "Jaipur-7",
            "Pune-8", "Mumbai-8", "Delhi-8", "Chennai-8", "Jaipur-8",
    };

    private CitiesAdapter mCitiesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerCities = findViewById(R.id.recyclerCities);
        mCitiesAdapter = new CitiesAdapter(mArrCities);
        mRecyclerCities.setAdapter(mCitiesAdapter);

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(
                        this,
                        LinearLayoutManager.VERTICAL,
                        false
                );
        mRecyclerCities.setLayoutManager(linearLayoutManager);

    }
}