
package com.github.aless2003.data;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

@SuppressWarnings("unused")
public class DictEntry {

    @SerializedName("meanings")
    private List<Meaning> mMeanings;
    @SerializedName("origin")
    private String mOrigin;
    @SerializedName("phonetic")
    private String mPhonetic;
    @SerializedName("phonetics")
    private List<Phonetic> mPhonetics;
    @SerializedName("word")
    private String mWord;

    public List<Meaning> getMeanings() {
        return mMeanings;
    }

    public void setMeanings(List<Meaning> meanings) {
        mMeanings = meanings;
    }

    public String getOrigin() {
        return mOrigin;
    }

    public void setOrigin(String origin) {
        mOrigin = origin;
    }

    public String getPhonetic() {
        return mPhonetic;
    }

    public void setPhonetic(String phonetic) {
        mPhonetic = phonetic;
    }

    public List<Phonetic> getPhonetics() {
        return mPhonetics;
    }

    public void setPhonetics(List<Phonetic> phonetics) {
        mPhonetics = phonetics;
    }

    public String getWord() {
        return mWord;
    }

    public void setWord(String word) {
        mWord = word;
    }

    @Override
    public String toString() {
        return "DictEntry{" +
               "mMeanings=" + mMeanings +
               ", mOrigin='" + mOrigin + '\'' +
               ", mPhonetic='" + mPhonetic + '\'' +
               ", mPhonetics=" + mPhonetics +
               ", mWord='" + mWord + '\'' +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DictEntry dictEntry = (DictEntry) o;
        return Objects.equals(mMeanings, dictEntry.mMeanings) && Objects.equals(
            mOrigin, dictEntry.mOrigin) && Objects.equals(mPhonetic, dictEntry.mPhonetic)
               && Objects.equals(mPhonetics, dictEntry.mPhonetics) && Objects.equals(
            mWord, dictEntry.mWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mMeanings, mOrigin, mPhonetic, mPhonetics, mWord);
    }
}
