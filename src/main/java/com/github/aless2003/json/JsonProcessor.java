package com.github.aless2003.json;

import com.github.aless2003.data.DictEntry;
import com.google.gson.Gson;
import org.jetbrains.annotations.Nullable;

public class JsonProcessor {

  private JsonProcessor() {

  }

  @Nullable
  public static DictEntry[] parseEntries(String json) {

    Gson gson = new Gson();

    return gson.fromJson(json, DictEntry[].class);
  }

}
