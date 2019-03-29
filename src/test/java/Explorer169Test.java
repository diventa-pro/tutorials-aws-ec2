import org.junit.jupiter.api.Test;
import spark.utils.IOUtils;

import java.net.URL;

class Explorer169Test {

    @Test
    void ko() throws Exception {
        Explorer169 sut = new Explorer169();
        sut.dodo("/latest/meta-data/");
    }

    static class Explorer169 {

        void dodo(String path) throws Exception {

            // /latest/meta-data/block-device-mapping/

            String lines = IOUtils.toString(new URL("http://169.254.169.254" + path).openStream());

            String[] theLines = lines.split("\n");

        }
    }

}
