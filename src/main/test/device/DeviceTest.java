package device;

import static org.junit.jupiter.api.Assertions.*;
class DeviceTest {

    @org.junit.jupiter.api.Test
    void testToString() {
        Device.DeviceBuilder de = Device.builder().id(1).name("反应釜");
        System.out.println(de.toString());
    }
}