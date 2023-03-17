package com.example.tripplanner;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;


public class TripAdapter extends RecyclerView.Adapter<TripAdapter.ViewHolder> {
    private List<Trip> tripList;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView startLocationTextView;
        private TextView endLocationTextView;
        private TextView dateTextView;

        public ViewHolder(View view) {
            super(view);
            startLocationTextView = view.findViewById(R.id.start_location_textview);
            endLocationTextView = view.findViewById(R.id.end_location_textview);
            dateTextView = view.findViewById(R.id.date_textview);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Trip trip = tripList.get(getAdapterPosition());
            Intent intent = new Intent(view.getContext(), SecondActivity.class);
            intent.putExtra("start_location", trip.getStartLocation());
            intent.putExtra("end_location", trip.getEndLocation());
            intent.putExtra("date", trip.getDate());
            Global.startLocation = trip.getStartLocation();
            Global.endLocation = trip.getEndLocation();
            Global.date = trip.getDate();
            view.getContext().startActivity(intent);
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
//wont commit unless this is here