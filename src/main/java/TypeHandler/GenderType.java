package TypeHandler;

import java.util.HashMap;
import java.util.Map;

public enum GenderType {
    男("1","男"),
    女("0","女");
    private java.lang.String value;
    private java.lang.String displayName;
    static Map<java.lang.String, GenderType> enumMap=new HashMap<java.lang.String, GenderType>();
    static {
        for(GenderType type:GenderType.values())
            enumMap.put(type.getValue(),type);
    }
    GenderType(java.lang.String value, java.lang.String name){
        this.value=value;
        this.displayName=name;
    }

    public java.lang.String getValue() {
        return value;
    }

    public void setValue(java.lang.String value) {
        this.value = value;
    }

    public java.lang.String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }
    public static GenderType getEnumType(java.lang.String value){
        return enumMap.get(value);
    }
}
