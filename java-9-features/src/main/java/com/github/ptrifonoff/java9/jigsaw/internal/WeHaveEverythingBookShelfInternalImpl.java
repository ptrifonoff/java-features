package com.github.ptrifonoff.java9.jigsaw.internal;

import com.github.ptrifonoff.java9.jigsaw.BookShelfApi;

public class WeHaveEverythingBookShelfInternalImpl implements BookShelfApi {

    public boolean isBookAvailable(String isbn) {
        return true;
    }

}
