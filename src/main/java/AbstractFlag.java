/**
 * @author CaoYongCheng
 */
public abstract class AbstractFlag {

    protected Integer value;

    public static <T extends AbstractFlag> T parse(Integer value, Class<T> targetClass) {
        T result;
        try {
            result = targetClass.newInstance();
        } catch (Exception e) {
            return null;
        }
        result.value = value;
        return result;
    }

    public Integer valueOf() {
        return value;
    }

    public Boolean hasFlag(Integer value) {
        if (value == null) {
            return false;
        }
        return value == (this.value & value);
    }
}
