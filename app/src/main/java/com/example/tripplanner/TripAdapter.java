package com.example.tripplanner;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;


public class TripAdapter extends RecyclerView.Adapter<TripAdapter.ViewHolder> {
    private List<Trip> tripList;

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView startLocationTextView;
        private TextView endLocationTextView;
        private TextView dateTextView;

        public ViewHolder(View view) {
            super(view);
            startLocationTextView = view.findViewById(R.id.start_location_textview);
            endLocationTextView = view.findViewById(R.id.end_location_textview);
            dateTextView = view.findViewById(R.id.date_textview);
        }
    }

    public TripAdapter(List<Trip> tripList) {
        this.tripList = tripList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.trip_list_row, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Trip trip = tripList.get(position);
        holder.startLocationTextView.setText(trip.getStartLocation());
        holder.endLocationTextView.setText(trip.getEndLocation());
        holder.dateTextView.setText(trip.getDate());
    }

    @Override
    public int getItemCount() {
        return tripList.size();
    }
}
