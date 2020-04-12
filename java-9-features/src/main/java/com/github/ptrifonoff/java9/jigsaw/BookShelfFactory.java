package com.github.ptrifonoff.java9.jigsaw;

import com.github.ptrifonoff.java9.jigsaw.internal.WeHaveEverythingBookShelfInternalImpl;

public class BookShelfFactory {

    /**
     * You are not able to instantiate the {@link WeHaveEverythingBookShelfInternalImpl} directly
     * from modules consuming this module.
     *
     * @return the internal implementation of this module
     */
    public static BookShelfApi produceBookShelf() {
        return new WeHaveEverythingBookShelfInternalImpl();
    }

}
