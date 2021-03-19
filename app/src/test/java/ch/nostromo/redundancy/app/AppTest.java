package ch.nostromo.redundancy.app;


import ch.nostromo.redundancy.annotation.MarkerAnnotation;
import ch.nostromo.redundancy.library.LibraryObject;
import org.junit.Test;

import java.lang.annotation.Annotation;

import static junit.framework.TestCase.assertTrue;

public class AppTest {

    @Test
    public void testAnnotation() {

        AppObject appo = new AppObject();
        LibraryObject libo = new LibraryObject();

        assertTrue(appo.getClass().isAnnotationPresent(MarkerAnnotation.class));
        assertTrue(libo.getClass().isAnnotationPresent(MarkerAnnotation.class));

        Annotation appoAnnotation = appo.getClass().getAnnotation(MarkerAnnotation.class);
        Annotation liboAnnotation = libo.getClass().getAnnotation(MarkerAnnotation.class);

        assertTrue(appoAnnotation.equals(liboAnnotation));
    }

}
