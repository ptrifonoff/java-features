package com.github.ptrifonoff.java9.jigsaw;

import com.github.ptrifonoff.java9.jigsaw.internal.WeHaveEverythingBookShelfInternalImpl;

public class BookShelfFactory {

    public static BookShelfApi produceBookShelf() {
        return new WeHaveEverythingBookShelfInternalImpl();
    }

}
