package com.github.ptrifonoff.java9.jigsaw.moduleimport;

import com.github.ptrifonoff.java9.jigsaw.BookShelfApi;
import com.github.ptrifonoff.java9.jigsaw.BookShelfFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BookShelfConsumer {

    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        System.out.println("my favorite book availability is " + new BookShelfConsumer().isMyFavoriteBookAvailable());
        System.out.println("my favorite book availability with reflective call is " + new BookShelfConsumer()
                .isMyFavoriteBookAvailableWithReflection());
    }

    private boolean isMyFavoriteBookAvailable() {
        BookShelfApi bookShelf = BookShelfFactory.produceBookShelf();
        /*
         * TODO try it out:
         *  1) internal implementation of WeHaveEverythingBookShelfInternalImpl is not available because of limited module-info export in library
         *  2) if you expose the internal package in module-info.java of maven module java-9-features, you would have access
         */
        return bookShelf.isBookAvailable("12345");
    }

    private boolean isMyFavoriteBookAvailableWithReflection()
            throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method bookshelfProducerMethod = Class.forName("com.github.ptrifonoff.java9.jigsaw.BookShelfFactory")
                .getMethod("produceBookShelf");

        Object bookShelf = bookshelfProducerMethod.invoke(null);
        /*
         * TODO try it out:
         *  1) if you use keyword "opens" instead of "exports" in module bookshelf, you will not be able to call classes of the Bookshelf-API directly, but with reflection
         *  2) you won't be able to call a method even with reflection, if you don't export anything
         */
        return (boolean) Class.forName("com.github.ptrifonoff.java9.jigsaw.BookShelfApi")
                .getMethod("isBookAvailable", String.class).invoke(bookShelf, "12345");
    }

}
