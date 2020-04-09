package com.github.ptrifonoff.java9.moduleimport;

import com.github.ptrifonoff.java9.modularization.BookShelfApi;
import com.github.ptrifonoff.java9.modularization.BookShelfFactory;

public class BookShelfConsumer {

    public void useBookShelf() {
        BookShelfApi bookShelf = BookShelfFactory.produceBookShelf();
        bookShelf.isBookAvailable("12345");
        // TODO try it out: internal implementation of WeHaveEverythingBookShelfInternalImpl is not available because of limited module-info export in library
    }

}
