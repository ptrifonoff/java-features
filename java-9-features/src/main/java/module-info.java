/**
 * Demonstrating how to export modules
 * TODO In real world you should use a unique package name like module name
 */
module bookshelf {
    /*
     * Exports the API but not the internal implementation in sub-package internal
     */
    exports com.github.ptrifonoff.java9.jigsaw;

    /*
     * TODO try out to export the module only for reflective access instead of using "exports" - the BookShelfConsumer will only be able to call methods with reflection
     */
    // opens com.github.ptrifonoff.java9.jigsaw;
    
    /*
     * TODO try out an alternative configuration to allow access only for module "bookshelfConsumer":
     * if you export it to bookshelfConsumer, you can use the internal implementation in maven module java-9-module-consumer
     */
    exports com.github.ptrifonoff.java9.jigsaw.internal to nonExistingConsumer;
    
}
