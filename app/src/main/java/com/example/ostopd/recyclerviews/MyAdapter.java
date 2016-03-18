package com.example.ostopd.recyclerviews;

import java.util.ArrayList;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<String> values;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14;
        public EditText e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14;
//        public TextView t;
//        public EditText e;
        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            t1 = (TextView) v.findViewById(R.id.companyNameT);
            t2 = (TextView) v.findViewById(R.id.companyAddressT);
            t3 = (TextView) v.findViewById(R.id.companyRegistrationNumberT);
            t4 = (TextView) v.findViewById(R.id.yearOfInceptionT);
            t5 = (TextView) v.findViewById(R.id.revenueT);
            t6 = (TextView) v.findViewById(R.id.netProfitAnnualT);
            t7 = (TextView) v.findViewById(R.id.numberOfEmployeesT);
            t8 = (TextView) v.findViewById(R.id.businessDomainAreaT);
            t9 = (TextView) v.findViewById(R.id.businessWebsiteT);
            t10 = (TextView) v.findViewById(R.id.businessAchievementsT);
            t11 = (TextView) v.findViewById(R.id.partnershipInfoT);
            t12 = (TextView) v.findViewById(R.id.gapsBetweenBusinessesT);
            t13 = (TextView) v.findViewById(R.id.productNameT);
            t14 = (TextView) v.findViewById(R.id.serviceNameT);

            e1 = (EditText) v.findViewById(R.id.companyName);
            e2 = (EditText) v.findViewById(R.id.companyAddress);
            e3 = (EditText) v.findViewById(R.id.companyRegistrationNumber);
            e4 = (EditText) v.findViewById(R.id.yearOfInception);
            e5 = (EditText) v.findViewById(R.id.revenue);
            e6 = (EditText) v.findViewById(R.id.netProfitAnnual);
            e7 = (EditText) v.findViewById(R.id.numberOfEmployees);
            e8 = (EditText) v.findViewById(R.id.businessDomainArea);
            e9 = (EditText) v.findViewById(R.id.businessWebsite);
            e10 = (EditText) v.findViewById(R.id.businessAchievements);
            e11 = (EditText) v.findViewById(R.id.partnershipInfo);
            e12 = (EditText) v.findViewById(R.id.gapsBetweenBusinesses);
            e13 = (EditText) v.findViewById(R.id.productName);
            e14 = (EditText) v.findViewById(R.id.serviceName);

//            t = (TextView) v.findViewById(R.id.tv);
//            e = (EditText) v.findViewById(R.id.ed);
        }
    }

    public void add(int position, String item) {
        values.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(int position) {
        values.remove(position);
        notifyItemRemoved(position);
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(ArrayList<String> myDataset) {
        values = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.rowlayout, parent, false);

        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final String name = values.get(position);
     /*   holder.t1.setText(name);
        holder.t2.setText(name);
        holder.t3.setText(name);
        holder.t4.setText(name);
        holder.t5.setText(name);
        holder.t6.setText(name);
        holder.t7.setText(name);
        holder.t8.setText(name);
        holder.t9.setText(name);
        holder.t10.setText(name);
        holder.t11.setText(name);
        holder.t12.setText(name);
        holder.t13.setText(name);
        holder.t14.setText(name);*/

        holder.e1.setText("asd");
        holder.e2.setText("asd");
        holder.e3.setText("asd");
        holder.e4.setText("asd");
        holder.e5.setText("asd");
        holder.e6.setText("asd");
        holder.e7.setText("asd");
        holder.e8.setText("asd");
        holder.e9.setText("asd");
        holder.e10.setText("asd");
        holder.e11.setText("asd");
        holder.e12.setText("asd");
        holder.e13.setText("asd");
        holder.e14.setText("asd");
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return values.size();
    }

}