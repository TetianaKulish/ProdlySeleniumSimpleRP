package com.ui.models;

public class practiceFormModel {
    private String firstName;
    private String lastName;
    private String date;
    private String uploadFileName;

    private practiceFormModel(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        date = builder.date;
        uploadFileName = builder.uploadFileName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDate() {
        return date;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public static final class Builder {
        private String firstName;
        private String lastName;
        private String date;
        private String uploadFileName;

        public Builder() {
        }

        public Builder firstName(String val) {
            firstName = val;
            return this;
        }

        public Builder lastName(String val) {
            lastName = val;
            return this;
        }

        public Builder date(String val) {
            date = val;
            return this;
        }

        public Builder uploadFileName(String val) {
            uploadFileName = val;
            return this;
        }

        public practiceFormModel build() {
            return new practiceFormModel(this);
        }
    }
}
