package com.github.aless2003.http;

import com.github.aless2003.data.DictEntry;
import com.github.aless2003.json.JsonProcessor;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class DictAPI {

  private static final String baseURL = "https://api.dictionaryapi.dev/api/v2/entries/";
  private static final OkHttpClient client = new OkHttpClient();

  private DictAPI() {

  }

  public static DictEntry[] getWord(String word, String lang) {
    if (lang == null) {
      lang = "en";
    }

    word = cleanWord(word);

    String url = String.format("%s%s/%s", baseURL, lang, word);

    Request request = new Request.Builder().url(url).build();

    try (Response response = client.newCall(request).execute()) {

      if (response.isSuccessful()) {
        String json = response.body().string();

        return JsonProcessor.parseEntries(json);

      }

    } catch (IOException e) {
      e.printStackTrace();
    }

    return null;
  }

  private static String cleanWord(String word) {

    return word.replaceAll("\\s", "");

  }

}
