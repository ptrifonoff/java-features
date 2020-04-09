package com.github.ptrifonoff.java9.modularization.internal;

import com.github.ptrifonoff.java9.modularization.BookShelfApi;

public class WeHaveEverythingBookShelfInternalImpl implements BookShelfApi {

    public boolean isBookAvailable(String isbn) {
        return true;
    }

}
