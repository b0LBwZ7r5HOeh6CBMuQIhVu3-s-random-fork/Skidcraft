package wtf.kiddo.skidcraft.value;

/**
 * Author: zcy
 * Created: 2022/5/1
 */
public abstract class Value<O> {
    protected O value;
    private final O defaultValue;
    private final String label;

    private Dependency visibility;

    public Value(final String label, O value) {
        this.value = value;
        this.defaultValue = value;
        this.label = label;
    }

    public Value(final String label, O value, Dependency visibility) {
        this.value = value;
        this.defaultValue = value;
        this.label = label;
        this.visibility = visibility;
    }

    public String getLabel() {
        return this.label;
    }

    public O getValue() {
        return this.value;
    }

    public O getDefaultValue() {
        return this.defaultValue;
    }

    public String getValueAsString() {
        return String.valueOf(value);
    }

    public abstract void setValue(O value);

    public boolean checkDependency() {
        if (visibility == null) {
            return false;
        } else {
            return !visibility.check();
        }
    }

}