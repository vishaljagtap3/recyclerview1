package in.bitcode.recyclerview1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.CityViewHolder> {

    private String [] mArrCities;

    public CitiesAdapter(String [] arrCities) {
        mArrCities = arrCities;
    }



    @Override
    public int getItemCount() {
        Log.e("tag", "getItemcount()");
        if(mArrCities == null) {
            return 0;
        }

        return mArrCities.length;
    }

    class CityViewHolder extends RecyclerView.ViewHolder {

        public TextView mTxtCity;

        public CityViewHolder(@NonNull View itemView) {
            super(itemView);
            mTxtCity = (TextView) itemView;
        }
    }

    @NonNull
    @Override
    public CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Log.e("tag", "onCreateViewHolder()");

        //Create View
        TextView txtCity = new TextView(parent.getContext());
        txtCity.setTextSize(25);
        txtCity.setPadding(20, 10, 20, 10);

        //Create a VH and put the view in it
        CityViewHolder cityViewHolder = new CityViewHolder(txtCity);

        return cityViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CityViewHolder holder, int position) {
        Log.e("tag", "onBindViewHolder() " + position);
        holder.mTxtCity.setText(mArrCities[position]);
    }



}
