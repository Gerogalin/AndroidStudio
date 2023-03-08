package com.example.insertrecord;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.insertrecord.JSONParser;
import com.example.insertrecord.R;

import org.json.JSONException;
import org.json.JSONObject;

public class CreateNewCostumer extends AppCompatActivity {
    private static Button btnQuery;
    private static EditText edtitemcode;
    private static JSONParser jparser = new JSONParser();
    private static String urlHost = "http://192.168.254.115/ancuin/InsertTeams.php";
    private static String TAG_MESSAGE = "message", TAG_SUCCESS = "success";
    private static String online_dataset = "";
    private static String fullname = "";
    public static String Gender = "";

    RadioButton male, female;
    View.OnClickListener MaleandFemale;

    Spinner status;
    public String StatusofUser = "";
    String StringStatus[] = {"Single", "Married", "Widow", "divorced"};
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_costumer);
        btnQuery = (Button) findViewById(R.id.btnQuery);
        edtitemcode = (EditText) findViewById(R.id.edtitemcode);
        male = (RadioButton) findViewById(R.id.male);
        female = (RadioButton) findViewById(R.id.female);
        status = (Spinner) findViewById(R.id.status);

        btnQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fullname = edtitemcode.getText().toString();
                new uploadDataToURL().execute();
            }
        });
        MaleandFemale = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton rdolist = (RadioButton) view;
                switch (rdolist.getId()) {
                    case R.id.male:
                        Gender = "Male";
                        break;
                    case R.id.female:
                        Gender = "Female";
                        break;
                }
            }
        };
        male.setOnClickListener(MaleandFemale);
        female.setOnClickListener(MaleandFemale);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, StringStatus);
        status.setAdapter(adapter);
        status.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int stats, long l) {

                switch (stats) {
                    case 0:
                        StatusofUser = "Single";
                        break;
                    case 1:
                        StatusofUser = "Married";
                        break;
                    case 2:
                        StatusofUser = "Widow";
                        break;
                    case 3:
                        StatusofUser = "divorced";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private class uploadDataToURL extends AsyncTask<String, String, String> {
        String cPOST = "", cPostSQL = "", cMessage = "Querying data...";
        int nPostValueindex;
        ProgressDialog pDialog = new ProgressDialog(CreateNewCostumer.this);

        public uploadDataToURL() {
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.setMessage(cMessage);
            pDialog.show();
        }

        @Override
        protected String doInBackground(String... params) {
            int nSuccess;
            try {
                ContentValues cv = new ContentValues();
                cPostSQL = " '" + fullname + "' , '" + Gender + "' , '" + StatusofUser + "' ";
                cv.put("code", cPostSQL);

                JSONObject json = jparser.makeHTTORequest(urlHost, "POST", cv);
                if (json != null) {
                    nSuccess = json.getInt(TAG_SUCCESS);
                    if (nSuccess == 1) {
                        online_dataset = json.getString(TAG_MESSAGE);
                        return online_dataset;
                    } else {
                        return json.getString(TAG_MESSAGE);
                    }
                } else {
                    return "HTTPSERVER_ERROR";
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            pDialog.dismiss();
            String isEmpty = "";
            AlertDialog.Builder alert = new AlertDialog.Builder(CreateNewCostumer.this);
            if (s != null) {
                if (isEmpty.equals("") && !s.equals("HTTPSERVER_ERROR")) {
                }
                Toast.makeText(CreateNewCostumer.this, s, Toast.LENGTH_SHORT).show();
            } else {
                alert.setMessage("Query Interupted... \nPlease Check Internet connection");
                alert.setTitle("Error");
                alert.show();
            }
        }
    }
}
