import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class StringUtilsTest {

    /**
     * 前処理
     */
    @Before
    public void setUp() {
    }

    /**
     * 後処理
     */
    @After
    public void tearDown() {
    }

    /**
     * toSnakeCase関数のテスト
     */
    @Test
    public void happyPath1() {
        assertEquals(StringUtils.toSnakeCase("SampleClass"), "sample_class");
    }

    @Test
    public void abnormal1() {
        assertNotEquals(StringUtils.toSnakeCase("SampleClass"), "SampleClass");
    }
}