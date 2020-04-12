package com.github.ptrifonoff.java9.jigsaw.internal;

import com.github.ptrifonoff.java9.jigsaw.BookShelfApi;

/*
 * TODO within module-info.java in source root you can hide packages like this
 *  implementation for external use. You can try it out with maven module java9-module-consumer:
 *  walk through code in this module and try out different behaviour.
 */
public class WeHaveEverythingBookShelfInternalImpl implements BookShelfApi {

    public boolean isBookAvailable(String isbn) {
        return true;
    }

}
