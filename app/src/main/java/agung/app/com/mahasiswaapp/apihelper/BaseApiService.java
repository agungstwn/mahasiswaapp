package agung.app.com.mahasiswaapp.apihelper;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by agung on 12/6/2017.
 */

public interface BaseApiService {
    // Fungsi ini untuk memanggil API/mahasiswa/login.php
    @FormUrlEncoded
    @POST("login.php")
    Call<ResponseBody> loginRequest(@Field("email")String email,
                                    @Field("password")String password);

    @FormUrlEncoded
    @POST("register.php")
    Call<ResponseBody> registerRequest(@Field("nama")String nama,
                                       @Field("email")String email,
                                       @Field("password")String password);
}
