/**
 * @Description
 * @Author Ligq
 * @Date 2021/7/14 5:02 下午
 * @Version V1.0
 */
package com.ligq.study.xstream.demo;

import com.ligq.study.xstream.model.baplie.Baplie;
import com.ligq.study.xstream.model.baplie.Header;
import com.thoughtworks.xstream.XStream;
import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Slf4j
public class BaplieDemo {

    public static void main(String[] args) {
        modelToXml();
        xmlToModel();
    }

    private static void modelToXml(){
        Header header = new Header();
        header.setActionCode("9");
        header.setManifestType("BAPLIE");
        header.setMessageId("0D22ADFD-FD37-4D3E-BE06-05824DC20092");
        header.setMessageType("BAPLIE");
        header.setSenderCode("BANR.TAO");

        Baplie baplie = new Baplie();
        baplie.setHeader(header);

        XStream xStream = new XStream();
        xStream.alias("Baplie", Baplie.class);
//        xStream.alias("Header", Header.class);
        String xml = xStream.toXML(baplie);
        log.info("xml == \n{}", xml);

        Baplie newBaplie = (Baplie)xStream.fromXML(xml);
        log.info("newBaplie == {}", newBaplie);
    }

    private static void xmlToModel() {
        try {
            String path = "/Users/liguoqiang/person/study/spring-boot/x-stream/src/main/resources/Baplie.xml";
            String content = readXml(path);

            XStream xStream = new XStream();
            xStream.alias("Baplie", Baplie.class);
            xStream.aliasField("MessageID", Baplie.class, "MessageID");

            xStream.ignoreUnknownElements();
            Baplie baplie = (Baplie) xStream.fromXML(content);
            log.info("Baplie == \n{}", baplie);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String readXml(String path) throws IOException {
        File file = new File(path);
        try (FileInputStream in = new FileInputStream(file);
             ByteArrayOutputStream out = new ByteArrayOutputStream();
        ) {
            byte[] buffer = new byte[1024];
            while (in.read(buffer) != -1) {
                out.write(buffer);
            }

            return new String(out.toByteArray());
        } catch (Exception e) {
            log.error("");
            throw e;
        }
    }
}
