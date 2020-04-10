/**
 * Demonstrating some read dependencies
 */
module bookshelfConsumer {
    requires bookshelf;

    /*
     * TODO alternative for optional dependencies: a static module is only required at compile-time - but optional at runtime
     *  requires static bookshelf; // this would not make a difference in this sample, because we use the module at compile-time and runtime
     */

    /*
     * TODO alternative for including all transitive dependencies: if bookshelf itself has some dependencies on other modules
     *  requires transitive bookshelf; // this would not make a difference in this sample, because there are no other dependencies on bookshelf
     */
}
