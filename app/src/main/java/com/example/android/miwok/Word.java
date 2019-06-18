package com.example.android.miwok;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mDefaultTranslation;

    private String mRomanianTranslation;

    private int mImageResourceID = Word.NO_IMAGE_PROVIDED;

    private int mAudioResourceID;

    public Word(String defaultTranslation, String romanianTranslation, int audioResourceID) {
        this.mDefaultTranslation = defaultTranslation;
        this.mRomanianTranslation = romanianTranslation;
        this.mAudioResourceID = audioResourceID;
    }

    public Word(String defaultTranslation, String romanianTranslation, int imageResourceID, int audioResourceID) {
        this.mDefaultTranslation = defaultTranslation;
        this.mRomanianTranslation = romanianTranslation;
        this.mImageResourceID = imageResourceID;
        this.mAudioResourceID = audioResourceID;
    }


    public String getDefaultTranslation() {
        return this.mDefaultTranslation;
    }

    public String getRomanianTranslation() {
        return this.mRomanianTranslation;
    }

    public int getImageResourceID() {
        return this.mImageResourceID;
    }

    public boolean hasImage() {
        return this.mImageResourceID != Word.NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceID() {
        return this.mAudioResourceID;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mRomanianTranslation='" + mRomanianTranslation + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                ", mAudioResourceID=" + mAudioResourceID +
                '}';
    }
}
