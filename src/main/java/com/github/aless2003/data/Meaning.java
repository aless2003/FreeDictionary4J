
package com.github.aless2003.data;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Meaning {

    @SerializedName("definitions")
    private List<Definition> mDefinitions;
    @SerializedName("partOfSpeech")
    private String mPartOfSpeech;

    public List<Definition> getDefinitions() {
        return mDefinitions;
    }

    public void setDefinitions(List<Definition> definitions) {
        mDefinitions = definitions;
    }

    public String getPartOfSpeech() {
        return mPartOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        mPartOfSpeech = partOfSpeech;
    }

    @Override
    public String toString() {
        return "Meaning{" +
               "mDefinitions=" + mDefinitions +
               ", mPartOfSpeech='" + mPartOfSpeech + '\'' +
               '}';
    }
}
