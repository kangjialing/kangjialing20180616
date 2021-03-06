package kangjialing.com.bwei.kangjialing20180616.tuyi.api;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;


public interface ApiService {
    @GET
    Observable<ResponseBody> doGet(@Url String url, @QueryMap Map<String, String> map);
}
