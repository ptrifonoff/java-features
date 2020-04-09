module bookshelfConsumer {
    requires bookshelf;

    // alternative: requires static bookshelf -> this means require at compile-time
    // alternative: requires transitive module.name -> all transitive dependencies included
}
