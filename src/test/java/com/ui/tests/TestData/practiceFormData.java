package com.ui.tests.TestData;

import com.ui.models.practiceFormModel;

public class practiceFormData {

    public static practiceFormModel practiceFormData() {
        return new practiceFormModel.Builder()
                .firstName("firstName")
                .lastName("lastName")
                .date("01/01/2022")
                .uploadFileName("test_upload_0.doc")
                .build();
    }
}
