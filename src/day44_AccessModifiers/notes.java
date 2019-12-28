package day44_AccessModifiers;

public class notes {
/*
 import statements:
        import:
                import PackageName.className;
                    // imports a single class from the package
                        Ex: import java.util.ArrayList;
                import PackageName.*;
                    // imports all the classes from the package
                        Ex: import java.util.*;
        static import: used for importing the class members, we can access them directly without using class name
                import static PackageName.ClassName.StaticName;
                    // imports a single static member from the class
                import static Packagename.ClassName.*;
                    // imports all the static members from the class
Access Modifiers: public, protected, private, default
        public: open for the world, visible at everywhere
                ex: public int num =100;
        private: only visible within the class
                not visible outside the class
                ex: private int num=100;
        default: only visible to the classes in the same package
                not visible outside the package
                ex: int num = 100;
        protected: only visible to the classes in the same package.
                not visible outside package
                but it's inheritable outside the package
                ex: protected int num =100;
    Public is the only access modifier that's visible outrside package
 */
}
