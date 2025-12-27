package finalKeyword;



final class FinalClass {
    public void showMessage() {
        System.out.println("This is a final class, and it cannot be subclassed.");
    }
}

// If you try to extend the final class, it results in a compilation error:
/*
class SubClass extends FinalClass { // ERROR: cannot inherit from final FinalClass
    // ...
}
*/

