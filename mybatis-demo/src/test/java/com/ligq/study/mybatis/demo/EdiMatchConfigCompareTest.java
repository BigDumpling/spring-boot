/**
 * @Description
 * @Author Ligq
 * @Date 2021/3/1 10:09 上午
 * @Version V1.0
 */
package com.ligq.study.mybatis.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ligq.study.mybatis.demo.dao.TEdiMatchConfigMapper;
import com.ligq.study.mybatis.demo.model.TEdiMatchConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EdiMatchConfigCompareTest {

    private final static Logger logger = LoggerFactory.getLogger("EdiMatchConfigCompareTest");

    @Autowired
    private TEdiMatchConfigMapper tEdiMatchConfigMapper;

    @Test
    public void compareTest() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        StringBuilder builder = new StringBuilder();

        List<TEdiMatchConfig> list = tEdiMatchConfigMapper.selectListByGroup();
        TEdiMatchConfig query = new TEdiMatchConfig();
        query.setIsDeleted(false);
        for (TEdiMatchConfig config : list) {
            query.setOrgId(config.getOrgId());
            query.setMessageType(config.getMessageType());
            query.setTransferCompanyCode(config.getTransferCompanyCode());
            query.setBookingAgentCode(config.getBookingAgentCode());
            query.setExternalSystemCode(config.getExternalSystemCode());
            List<TEdiMatchConfig> configs = tEdiMatchConfigMapper.select(query);
            if (configs.size() > 2) {
                logger.info("数量大于两条, query == {}", objectMapper.writeValueAsString(query));
                continue;
            }

            logger.info("------------------------------------------------------------------------------------------------------------------------------------------");
            builder.append("------------------------------------------------------------------------------------------------------------------------------------------").append("\n");
            logger.info("重复配置数据比对：机构号=={}, 外部系统=={}, 报文类型=={}, 船公司=={}, 订舱代理=={}",
                    query.getOrgId(), query.getExternalSystemCode(), query.getMessageType(), query.getTransferCompanyCode(), query.getBookingAgentCode());
            builder.append("重复配置数据比对：机构号==").append(query.getOrgId())
                    .append(", 外部系统==").append(query.getExternalSystemCode())
                    .append(", 报文类型==").append(query.getMessageType())
                    .append(", 船公司==").append(query.getTransferCompanyCode())
                    .append(", 订舱代理==").append(query.getBookingAgentCode())
                    .append("\n");
            doCompare(configs.get(0), configs.get(1), builder);
        }

        try (FileOutputStream outputStream = new FileOutputStream(new File("/Users/liguoqiang/Desktop/match_config_compare.txt"))) {
            outputStream.write(builder.toString().getBytes(StandardCharsets.UTF_8));
        }
    }

    private void doCompare(TEdiMatchConfig source, TEdiMatchConfig target, StringBuilder builder) {
        if (!Objects.equals(source.getChannelId(), target.getChannelId())) {
            logger.info("通道不同：{} 和 {}", source.getChannelId(), target.getChannelId());
            builder.append("通道不同: ").append(source.getChannelId()).append("和 ").append(target.getChannelId()).append("\n");
        }
        if (!Objects.equals(source.getName(), target.getName())) {
            logger.info("名称不同：{} 和 {}", source.getName(), target.getName());
            builder.append("名称不同: ").append(source.getName()).append("和 ").append(target.getName()).append("\n");
        }
        if (!Objects.equals(source.getBusinessType(), target.getBusinessType())) {
            logger.info("业务类型不同：{} 和 {}", source.getBusinessType(), target.getBusinessType());
            builder.append("业务类型不同: ").append(source.getBusinessType()).append("和 ").append(target.getBusinessType()).append("\n");
        }
        if (!Objects.equals(source.getStartShipmentPort(), target.getStartShipmentPort())) {
            logger.info("起运港不同：{} 和 {}", source.getStartShipmentPort(), target.getStartShipmentPort());
            builder.append("起运港不同: ").append(source.getStartShipmentPort()).append("和 ").append(target.getStartShipmentPort()).append("\n");
        }
        if (!Objects.equals(source.getShippingAgentCode(), target.getShippingAgentCode())) {
            logger.info("船代类型不同：{} 和 {}", source.getShippingAgentCode(), target.getShippingAgentCode());
            builder.append("船代类型不同: ").append(source.getShippingAgentCode()).append("和 ").append(target.getShippingAgentCode()).append("\n");
        }
        if (!Objects.equals(source.getTransferType(), target.getTransferType())) {
            logger.info("传输方式不同：{} 和 {}", source.getTransferType(), target.getTransferType());
            builder.append("传输方式不同: ").append(source.getTransferType()).append("和 ").append(target.getTransferType()).append("\n");
        }
        if (!Objects.equals(source.getCustomerCode(), target.getCustomerCode())) {
            logger.info("客户名称不同：{} 和 {}", source.getCustomerCode(), target.getCustomerCode());
            builder.append("客户名称不同: ").append(source.getCustomerCode()).append("和 ").append(target.getCustomerCode()).append("\n");
        }
        if (!Objects.equals(source.getSendCode(), target.getSendCode())) {
            logger.info("发送方代码名称不同：{} 和 {}", source.getSendCode(), target.getSendCode());
            builder.append("发送方代码名称不同: ").append(source.getSendCode()).append("和 ").append(target.getSendCode()).append("\n");
        }
        if (!Objects.equals(source.getSendGoodsCode(), target.getSendGoodsCode())) {
            logger.info("发货方代码不同：{} 和 {}", source.getSendGoodsCode(), target.getSendGoodsCode());
            builder.append("发货方代码不同: ").append(source.getSendGoodsCode()).append("和 ").append(target.getSendGoodsCode()).append("\n");
        }
        if (!Objects.equals(source.getReceiveCode(), target.getReceiveCode())) {
            logger.info("接收方代码不同：{} 和 {}", source.getReceiveCode(), target.getReceiveCode());
            builder.append("接收方代码不同: ").append(source.getReceiveCode()).append("和 ").append(target.getReceiveCode()).append("\n");
        }
        if (!Objects.equals(source.getExportType(), target.getExportType())) {
            logger.info("导出文件类型不同：{} 和 {}", source.getExportType(), target.getExportType());
            builder.append("导出文件类型不同: ").append(source.getExportType()).append("和 ").append(target.getExportType()).append("\n");
        }
        if (!Objects.equals(source.getFtpAddress(), target.getFtpAddress())) {
            logger.info("ftp地址不同：{} 和 {}", source.getFtpAddress(), target.getFtpAddress());
            builder.append("ftp地址不同: ").append(source.getFtpAddress()).append("和 ").append(target.getFtpAddress()).append("\n");
        }
        if (!Objects.equals(source.getFtpPort(), target.getFtpPort())) {
            logger.info("FTP端口：{} 和 {}", source.getFtpPort(), target.getFtpPort());
            builder.append("FTP端口: ").append(source.getFtpPort()).append("和 ").append(target.getFtpPort()).append("\n");
        }
        if (!Objects.equals(source.getFtpPath(), target.getFtpPath())) {
            logger.info("ftp路径不同：{} 和 {}", source.getFtpPath(), target.getFtpPath());
            builder.append("ftp路径不同: ").append(source.getFtpPath()).append("和 ").append(target.getFtpPath()).append("\n");
        }
        if (!Objects.equals(source.getFtpUsername(), target.getFtpUsername())) {
            logger.info("FTP用户名：{} 和 {}", source.getFtpUsername(), target.getFtpUsername());
            builder.append("FTP用户名: ").append(source.getFtpUsername()).append("和 ").append(target.getFtpUsername()).append("\n");
        }
        if (!Objects.equals(source.getFtpPassword(), target.getFtpPassword())) {
            logger.info("FTP密码：{} 和 {}", source.getFtpPassword(), target.getFtpPassword());
            builder.append("FTP密码: ").append(source.getFtpPassword()).append("和 ").append(target.getFtpPassword()).append("\n");
        }
    }
}
