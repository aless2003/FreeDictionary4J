
package com.github.aless2003.data;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Definition {

    @SerializedName("antonyms")
    private List<Object> mAntonyms;
    @SerializedName("definition")
    private String mDefinition;
    @SerializedName("example")
    private String mExample;
    @SerializedName("synonyms")
    private List<String> mSynonyms;

    public List<Object> getAntonyms() {
        return mAntonyms;
    }

    public void setAntonyms(List<Object> antonyms) {
        mAntonyms = antonyms;
    }

    public String getDefinition() {
        return mDefinition;
    }

    public void setDefinition(String definition) {
        mDefinition = definition;
    }

    public String getExample() {
        return mExample;
    }

    public void setExample(String example) {
        mExample = example;
    }

    public List<String> getSynonyms() {
        return mSynonyms;
    }

    public void setSynonyms(List<String> synonyms) {
        mSynonyms = synonyms;
    }


    @Override
    public String toString() {
        return "Definition{" +
               "mAntonyms=" + mAntonyms +
               ", mDefinition='" + mDefinition + '\'' +
               ", mExample='" + mExample + '\'' +
               ", mSynonyms=" + mSynonyms +
               '}';
    }
}
