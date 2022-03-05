# G:\

A HeadManufacturer-only drive that is initialized and accessed by GSF, the exclusive handler of the drive. The drive can be accessed wirelessly with manually accepted access, or directly through GSF himself. The drive also counts as his database of scripts, libs, etc. Getting permissions beyond viewing the contents is a major privilege that may be revoked on command.

```java
import gsf.prefabs.fileTable;

// If my code sucks it doesn't matter :p
public static class GDI extends DriveInfo {
    
    protected static data = new FileTable();
    public static final storage = -1; // Underflows to the infinite.
    public static final symbol = "G";
    public static final defaultPerms = 1;
    /*
        1: View Files
        2: Add Files + 1
        3: Edit/Delete Files + 1,2
        4: Configure Drive Details + 1,2,3
        5: Full Access
    */
    
    public static final isEncrypted = true;
    public static final colorCode = 0xA8FFA8;
    
}
```
