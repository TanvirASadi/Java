package finalKeyword;



class ParentClass {
    public final void displayMessage() {
        System.out.println("This is a final method and cannot be overridden.");
    }
}

class ChildClass extends ParentClass {
    // If you try to override the final method, it results in a compilation error:
    /*
    public void displayMessage() { // ERROR: displayMessage() in ChildClass cannot override displayMessage() in ParentClass
        System.out.println("Attempting to override the final method.");
    }
    */
}

