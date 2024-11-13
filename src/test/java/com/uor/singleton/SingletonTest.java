package com.uor.singleton;

import com.uor.creational.singleton.Singleton;
import com.uor.creational.singleton.inheritance.SubSingleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonTest {
  @AfterEach
  public void resetSingleton() throws Exception {
    // Reset the Singleton instance to null using reflection to isolate tests
    Field instanceField = Singleton.class.getDeclaredField("instance");
    instanceField.setAccessible(true);
    instanceField.set(null, null);

    Field subInstanceField = SubSingleton.class.getDeclaredField("instance");
    subInstanceField.setAccessible(true);
    subInstanceField.set(null, null);
  }

  @Test
  public void testSingletonInstance() {
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();

    // Verify that both references point to the same instance
    assertSame(instance1, instance2, "Both instances should be the same");
  }

  @Test
  public void testSubSingletonInstance() {
    SubSingleton instance1 = SubSingleton.getInstance();
    SubSingleton instance2 = SubSingleton.getInstance();

    // Verify that both references point to the same instance
    assertSame(instance1, instance2, "Both instances should be the same");
  }

  @Test
  public void testSingletonPrintMessage() {
    Singleton instance = Singleton.getInstance();
    instance.printMessage();
    // Add assertions here if necessary for capturing output (e.g., with System output capture libraries)
  }

  @Test
  public void testSubSingletonPrintMessage() {
    SubSingleton instance = SubSingleton.getInstance();
    instance.printMessage();
    // Add assertions here if necessary for capturing output
  }
}
