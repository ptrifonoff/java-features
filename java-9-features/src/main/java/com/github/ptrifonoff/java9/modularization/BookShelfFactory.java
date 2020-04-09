package com.github.ptrifonoff.java9.modularization;

import com.github.ptrifonoff.java9.modularization.internal.WeHaveEverythingBookShelfInternalImpl;

public class BookShelfFactory {

    public static BookShelfApi produceBookShelf() {
        return new WeHaveEverythingBookShelfInternalImpl();
    }

}
