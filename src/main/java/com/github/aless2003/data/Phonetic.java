
package com.github.aless2003.data;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Phonetic {

    @SerializedName("audio")
    private String mAudio;
    @SerializedName("text")
    private String mText;

    public String getAudio() {
        return mAudio;
    }

    public void setAudio(String audio) {
        mAudio = audio;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    @Override
    public String toString() {
        return "Phonetic{" +
               "mAudio='" + mAudio + '\'' +
               ", mText='" + mText + '\'' +
               '}';
    }
}
