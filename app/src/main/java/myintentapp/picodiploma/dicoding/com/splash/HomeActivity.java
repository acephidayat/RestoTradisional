package myintentapp.picodiploma.dicoding.com.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";


    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mDescripsi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    initImageBitmaps();


}
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://sifu.unileversolutions.com/image/id-ID/recipe-topvisual/2/1260-709/karedok-50417909.jpg");
        mNames.add("Karedok");
        mDescripsi.add("Karedok terbuat dari sayur sayuran dan bumbunya menggunakan bumbu kacang, proses pembuatannya diulek. Makanan ini populer di Jawa Barat ");

        mImageUrls.add("https://sifu.unileversolutions.com/image/id-ID/recipe-topvisual/2/1260-709/nasi-pecel-50417934.jpg");
        mNames.add("Nasi Pecel");
        mDescripsi.add("Pecel atau pecal merupakan makanan yang dikombinasikan dengan bumbu sambal kacang sebagai bahan utamanya dan dicampur dengan aneka jenis sayuran." +
                " Makanan ini populer terutama di wilayah DI Yogyakarta, Jawa Tengah, dan Jawa Timur. ");

        mImageUrls.add("https://www.netralnews.com/foto/2017/06/09/261-nasi_liwet_yang_sedang_trend_di_kalangan_masyaraat_saat_ini_dok_wisataku.jpg");
        mNames.add("Nasi Liwet");
        mDescripsi.add("Nasi liwet adalah makanan khas kota Solo dan merupakan kuliner asli daerah Baki, Kabupaten Sukoharjo. Nasi liwet adalah nasi gurih mirip nasi uduk, " +
                "yang disajikan dengan sayur labu siam, suwiran ayam dan areh ");

        mImageUrls.add("https://uniek88.files.wordpress.com/2015/12/img-20151223-wa0004.jpg");
        mNames.add("Tahu Gejrot");
        mDescripsi.add("Tahu gejrot adalah makanan khas Cirebon, Indonesia. Tahu gejrot terdiri dari tahu yang sudah digoreng kemudian dipotong agak kecil lalu dimakan " +
                "dengan kuah yang bumbunya cabe, bawang putih, bawang merah, gula. Biasanya disajikan di layah kecil ");

        mImageUrls.add("http://resephariini.com/wp-content/uploads/2015/03/ayam-4.jpg");
        mNames.add("Ayam Goreng");
        mDescripsi.add("Ayam goreng Nusantara adalah hidangan Asia Tenggara yang merupakan ayam yang digoreng dalam minyak goreng. Dalam dunia internasional, " +
                "istilah ayam goreng merujuk kepada ayam goreng gaya Nusantara.");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/0/03/Gurame_Goreng_Kipas_1.JPG");
        mNames.add("Ikan Goreng");
        mDescripsi.add("Ikan goreng adalah istilah umum yang merujuk pada berbagai jenis hidangan Indonesia dan Malaysia yang dibuat dengan cara menggoreng" +
                " ikan atau makanan laut lainnya. Ikan goreng sangat terkenal di Indonesia ");

        mImageUrls.add("http://3.bp.blogspot.com/-zZsp_8bjUPs/UtLY51qI-2I/AAAAAAAAAGM/-GmK5SXcfLc/s1600/Nasi+kuning.JPG");
        mNames.add("Nasi Kuning");
        mDescripsi.add("Nasi kuning adalah makanan khas Indonesia. Makanan ini terbuat dari beras yang dimasak bersama dengan kunyit serta santan dan rempah-rempah. " +
                "Dengan ditambahkannya bumbu-bumbu dan santan, nasi kuning memiliki rasa yang lebih gurih daripada nasi putih. ");

        mImageUrls.add("http://baresto.co.id/wp-content/uploads/2017/11/batagor.jpg");
        mNames.add("Batagor");
        mDescripsi.add("merupakan jajanan khas Bandung yang mengadaptasi gaya Tionghoa-Indonesia dan kini sudah dikenal hampir di seluruh wilayah Indonesia.\n" +
                "\n" +
                "Secara umum, batagor dibuat dari tahu yang dilembutkan dan diisi dengan adonan berbahan Ikan tenggiri dan tepung tapioka lalu dibentuk menyerupai " +
                "bola yang digoreng dalam minyak panas selama beberapa menit hingga matang. ");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Seblak_2.jpg/1024px-Seblak_2.jpg");
        mNames.add("Seblak");
        mDescripsi.add("Seblak adalah makanan Indonesia, umumnya adalah makanan khas dari Sunda, Jawa Barat yang bercita rasa gurih dan pedas yang terbuat dari kerupuk" +
                " basah yang dimasak dengan sayuran dan sumber protein seperti telur, ayam, boga bahari atau olahan daging sapi, dimasak dengan bumbu tertentu. ");

        mImageUrls.add("https://img.qraved.co/v2/image/data/2016/06/23/0-l.jpg");
        mNames.add("Pepes Ikan");
        mDescripsi.add("Pepes atau Pais merupakan suatu cara khas dari Jawa Barat untuk mengolah bahan makanan dengan bantuan daun pisang untuk membungkus ikan beserta bumbunya. " +
                "Cara membuatnya adalah bumbu dan rempah dihaluskan dan ditambah daun kemangi, tomat, dan cabai dibalur/dibalut bersama ikan mas yang sudah dibersihkan ");


        initRecyclerView();

    }
    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview");
        RecyclerView recyclerView = findViewById(R.id.recyclev_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mDescripsi);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
