package com.example.gilangk.aplikasiresepmasakan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Resep> resepList=new ArrayList<>();
    Resep resep;
    RecyclerView rv;
    ResepAdapter ra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=(RecyclerView)findViewById(R.id.tampilawal);
        ra=new ResepAdapter(resepList,this);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(ra);

        isiResep();
    }

    void isiResep() {
        for (int i=0; i<=5 ; i++) {
            resep = new Resep("Resep Daging Gulung Saus Tomat"
                    , "Bahan-bahan\n" +
                    "\n" +
                    "    2 sdm mentega\n" +
                    "    2 siung bawang putih, cincang\n" +
                    "    1 buah bawang bombai, cincang\n" +
                    "    1 sdm cabai merah, iris\n" +
                    "    150 gram daging, iris tipis dan gulung\n" +
                    "    1 sdm saus tomat\n" +
                    "    3 buah tomat, parut\n" +
                    "    ½ sdt garam\n" +
                    "    ½ sdt gula pasir\n" +
                    "    1 sdt merica bubuk\n" +
                    "    1 sdt kecap inggris\n" +
                    "    ½ sdt pala bubuk\n" +
                    "    ½ gelas air\n\n" +
                    "Cara membuat\n" +
                    "\n" +
                    "    Panaskan mentega, tumis bawang putih dan bawang bombai hingga harum. Tambahkan cabai merah, aduk hingga layu.\n" +
                    "    Masukkan daging gulung, saus tomat, tomat parut, garam, gula, merica, kecap inggris, dan pala, aduk perlahan. Tuang air, aduk dan masak hingga bumbu meresap dan daging matang. Hidangkan selagi panas."
                    , R.drawable.daging);
            resepList.add(resep);

            resep = new Resep("Tongseng Cumi Asin "
                    ,"\n" +
                    "Bahan-bahan\n" +
                    "\n" +
                    "    1 ons cumi asin *sy kukus terlebih dahulu baru di potong2\n" +
                    "    2 buah kentang *potong dadu\n" +
                    "    1 papan tempe ukr sedang *potong dadu\n" +
                    "    2 lembar daun salam\n" +
                    "    1 batang serai geprek\n" +
                    "    Merica *bila perlu\n" +
                    "    Secukupnya minyak goreng\n" +
                    "    Secukupnya gula + garam\n" +
                    "    Bahan iris-iris :\n" +
                    "    1 ons cabai campur (c.merah & c.hijau)\n" +
                    "    10 siung bwg merah\n" +
                    "    5 siung bwg putih\n" +
                    "    1 ruas jahe\n" +
                    "\n" +
                    "Langkah\n" +
                    "\n" +
                    "    Cuci bersih semua bahan, kemudian rajang2\n" +
                    "\n" +
                    "    Panaskan minyak lalu goreng kentang & tempe tiriskan lalu sisihkan\n" +
                    "\n" +
                    "    Kurangi minyak goreng sebelumnya (secukupnya utk menumis) tumis bwg merah & bwg putih smpi harum, lalu masukkan serai, daun salam tumis smpi harum\n" +
                    "\n" +
                    "    Setelah itu beri gula & garam aduk2 lalu masukkan kentang & tempe yg telah digoreng td beserta cuminya, aduk2 kembali sesekali koreksi rasa\n" +
                    "\n" +
                    "    Bila sdh pas matikan api dan siap di hidangkan"
                    ,R.drawable.tongseng);
            resepList.add(resep);

            resep = new Resep("Beef Stroganoff"
                    ,"\n" +
                    "Bahan-bahan\n" +
                    "\n" +
                    "    3 sdm olive oil\n" +
                    "    1 can jamur kancing (potong tipis)\n" +
                    "    7 buah jamur shitake (potong tipis)\n" +
                    "    1/2 kg daging cincang\n" +
                    "    1 sdt garam\n" +
                    "    1 sdt lada\n" +
                    "    1 bawang bombay (diced)\n" +
                    "    3 siung bawang putih (cincang)\n" +
                    "    3 sdm tepung terigu serba guna\n" +
                    "    2 sdm unsalted butter\n" +
                    "    2 sdt paprika bubuk\n" +
                    "    3 cups kaldu sapi\n" +
                    "    1/2 cup sour cream\n" +
                    "    50 gr macaroni keriting/fusilli\n" +
                    "\n" +
                    "Langkah\n" +
                    "\n" +
                    "    Siapkan pan besar dengan panas medium-high. Panaskan olive oil. Oseng jamur sampai halus dan airnya keluar (5-6 menit). Tiriskan kemudian sisihkan\n" +
                    "\n" +
                    "    Pada pan yang sama, masukkan daging cincang dan tambahkan garam. Masukkan bawang bombay lalu masak sampai rata (4-5 menit). Masukkan bawang putih, unsalted butter, terigu dan paprika bubuk. Aduk sampai rata dan mengental\n" +
                    "\n" +
                    "    Masukkan pastanya, kaldu sapi, jamur dan sour cream. Masak sampi mendidih. Turunkan pnas dan diamkan selama 10 menit\n" +
                    "\n" +
                    "    Sajikan\n"
                    ,R.drawable.beef);
        }

        ra.notifyDataSetChanged();
    }
}
