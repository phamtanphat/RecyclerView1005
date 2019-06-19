package khoapham.ptp.phamtanphat.recyclerview1005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MonanAdapter monanAdapter;
    ArrayList<Monan> mangmonan = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);

        mangmonan.add(new Monan(0,R.drawable.comsuon));
        mangmonan.add(new Monan(1,R.drawable.trangmien));
        mangmonan.add(new Monan(2,R.drawable.trasuasocola));
        mangmonan.add(new Monan(3,R.drawable.trasuatraxanh));

        monanAdapter = new MonanAdapter(mangmonan);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(monanAdapter);
    }
}
