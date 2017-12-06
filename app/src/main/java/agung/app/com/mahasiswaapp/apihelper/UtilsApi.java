package agung.app.com.mahasiswaapp.apihelper;

/**
 * Created by agung on 12/6/2017.
 */

public class UtilsApi {
    public static final String BASE_URL_API = "http://10.0.2.2:81/mahasiswa/include/"; // 10.0.2.2 ini adalah localhost.

    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
