package com.ligq.study.mybatis.demo.model;

import java.time.LocalDateTime;
import javax.persistence.*;

@Table(name = "t_edi_match_config")
public class TEdiMatchConfig {
    /**
     * 主键
     */
    @Id
    @Column(name = "match_config_id")
    private Long matchConfigId;

    /**
     * 报文模板Id
     */
    @Column(name = "template_id")
    private Long templateId;

    /**
     * 通道Id
     */
    @Column(name = "channel_id")
    private Long channelId;

    /**
     * 配置名称
     */
    private String name;

    /**
     * 业务类型，取码表中的值 business_type
     */
    @Column(name = "business_type")
    private String businessType;

    /**
     * 业务类型
     */
    @Column(name = "business_type_name")
    private String businessTypeName;

    /**
     * 报文类型，取码表中的值 data_type
     */
    @Column(name = "message_type")
    private String messageType;

    /**
     * 报文类型，取码表中的值 message_type
     */
    @Column(name = "message_type_name")
    private String messageTypeName;

    /**
     * 报文类型
     */
    @Column(name = "message_type_code")
    private String messageTypeCode;

    /**
     * 订舱代理，取码表booking_agent
     */
    @Column(name = "booking_agent_code")
    private String bookingAgentCode;

    /**
     * 订舱代理名称
     */
    @Column(name = "booking_agent_name")
    private String bookingAgentName;

    /**
     * 起运港，取码表中的值start_shipment_port，有多个用逗号分隔
     */
    @Column(name = "start_shipment_port")
    private String startShipmentPort;

    /**
     * 起运港
     */
    @Column(name = "start_shipment_port_name")
    private String startShipmentPortName;

    /**
     * 承运人code
     */
    @Column(name = "transfer_company_code")
    private String transferCompanyCode;

    /**
     * 承运人
     */
    @Column(name = "transfer_company_name")
    private String transferCompanyName;

    /**
     * 船代类型，取码表中的值 shipping_agent
     */
    @Column(name = "shipping_agent_code")
    private String shippingAgentCode;

    /**
     * 船代类型
     */
    @Column(name = "shipping_agent_name")
    private String shippingAgentName;

    /**
     * 传输方式，取码表中的值transfer_type
     */
    @Column(name = "transfer_type")
    private String transferType;

    /**
     * 传输方式
     */
    @Column(name = "transfer_type_name")
    private String transferTypeName;

    /**
     * 外部系统，取码表 external_system
     */
    @Column(name = "external_system_code")
    private String externalSystemCode;

    /**
     * 外部系统名
     */
    @Column(name = "external_system_name")
    private String externalSystemName;

    /**
     * 客户名称，取码表customer
     */
    @Column(name = "customer_code")
    private String customerCode;

    /**
     * 发送方代码
     */
    @Column(name = "send_code")
    private String sendCode;

    /**
     * 发货方代码
     */
    @Column(name = "send_goods_code")
    private String sendGoodsCode;

    /**
     * 接收方代码
     */
    @Column(name = "receive_code")
    private String receiveCode;

    /**
     * 导出文件类型，取码表中的值export_type
     */
    @Column(name = "export_type")
    private String exportType;

    /**
     * 导出类型名称
     */
    @Column(name = "export_type_name")
    private String exportTypeName;

    /**
     * ftp地址
     */
    @Column(name = "ftp_address")
    private String ftpAddress;

    /**
     * ftp路径
     */
    @Column(name = "ftp_path")
    private String ftpPath;

    /**
     * FTP端口
     */
    @Column(name = "ftp_port")
    private Integer ftpPort;

    /**
     * FTP用户名
     */
    @Column(name = "ftp_username")
    private String ftpUsername;

    /**
     * FTP密码
     */
    @Column(name = "ftp_password")
    private String ftpPassword;

    /**
     * 船公司数据在主数据进行代码转换的appCode
     */
    @Column(name = "transfer_company_app_code")
    private String transferCompanyAppCode;

    /**
     * 转换源类型(1:本地数据,2:主数据数据)
     */
    @Column(name = "transform_resource_type")
    private Byte transformResourceType;

    /**
     * 是否允许输入中文
     */
    @Column(name = "is_allow_cn")
    private Boolean isAllowCn;

    /**
     * 是否登录校验：1：是 2：否
     */
    private Byte login;

    /**
     * 提交方式：1：post 2：get
     */
    @Column(name = "submit_type")
    private Byte submitType;

    /**
     * 参数值格式：1：json 2：text
     */
    @Column(name = "content_type")
    private Byte contentType;

    /**
     * 发送方式：1：body 2：form
     */
    @Column(name = "send_type")
    private Byte sendType;

    /**
     * 请求头信息
     */
    private String header;

    /**
     * 签名字符串
     */
    private String sign;

    /**
     * 是否启用，1：启用，0：禁用
     */
    private Boolean enabled;

    /**
     * 客户ID
     */
    @Column(name = "org_id")
    private Long orgId;

    /**
     * 客户名称
     */
    @Column(name = "org_name")
    private String orgName;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private Long createBy;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private LocalDateTime modifyTime;

    /**
     * 修改人
     */
    @Column(name = "modify_by")
    private Long modifyBy;

    /**
     * 版本
     */
    private String version;

    /**
     * 是否删除 1：是，0：否
     */
    @Column(name = "is_deleted")
    private Boolean isDeleted;

    /**
     * 获取主键
     *
     * @return match_config_id - 主键
     */
    public Long getMatchConfigId() {
        return matchConfigId;
    }

    /**
     * 设置主键
     *
     * @param matchConfigId 主键
     */
    public void setMatchConfigId(Long matchConfigId) {
        this.matchConfigId = matchConfigId;
    }

    /**
     * 获取报文模板Id
     *
     * @return template_id - 报文模板Id
     */
    public Long getTemplateId() {
        return templateId;
    }

    /**
     * 设置报文模板Id
     *
     * @param templateId 报文模板Id
     */
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    /**
     * 获取通道Id
     *
     * @return channel_id - 通道Id
     */
    public Long getChannelId() {
        return channelId;
    }

    /**
     * 设置通道Id
     *
     * @param channelId 通道Id
     */
    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取配置名称
     *
     * @return name - 配置名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置配置名称
     *
     * @param name 配置名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取业务类型，取码表中的值 business_type
     *
     * @return business_type - 业务类型，取码表中的值 business_type
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * 设置业务类型，取码表中的值 business_type
     *
     * @param businessType 业务类型，取码表中的值 business_type
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    /**
     * 获取业务类型
     *
     * @return business_type_name - 业务类型
     */
    public String getBusinessTypeName() {
        return businessTypeName;
    }

    /**
     * 设置业务类型
     *
     * @param businessTypeName 业务类型
     */
    public void setBusinessTypeName(String businessTypeName) {
        this.businessTypeName = businessTypeName;
    }

    /**
     * 获取报文类型，取码表中的值 data_type
     *
     * @return message_type - 报文类型，取码表中的值 data_type
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * 设置报文类型，取码表中的值 data_type
     *
     * @param messageType 报文类型，取码表中的值 data_type
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * 获取报文类型，取码表中的值 message_type
     *
     * @return message_type_name - 报文类型，取码表中的值 message_type
     */
    public String getMessageTypeName() {
        return messageTypeName;
    }

    /**
     * 设置报文类型，取码表中的值 message_type
     *
     * @param messageTypeName 报文类型，取码表中的值 message_type
     */
    public void setMessageTypeName(String messageTypeName) {
        this.messageTypeName = messageTypeName;
    }

    /**
     * 获取报文类型
     *
     * @return message_type_code - 报文类型
     */
    public String getMessageTypeCode() {
        return messageTypeCode;
    }

    /**
     * 设置报文类型
     *
     * @param messageTypeCode 报文类型
     */
    public void setMessageTypeCode(String messageTypeCode) {
        this.messageTypeCode = messageTypeCode;
    }

    /**
     * 获取订舱代理，取码表booking_agent
     *
     * @return booking_agent_code - 订舱代理，取码表booking_agent
     */
    public String getBookingAgentCode() {
        return bookingAgentCode;
    }

    /**
     * 设置订舱代理，取码表booking_agent
     *
     * @param bookingAgentCode 订舱代理，取码表booking_agent
     */
    public void setBookingAgentCode(String bookingAgentCode) {
        this.bookingAgentCode = bookingAgentCode;
    }

    /**
     * 获取订舱代理名称
     *
     * @return booking_agent_name - 订舱代理名称
     */
    public String getBookingAgentName() {
        return bookingAgentName;
    }

    /**
     * 设置订舱代理名称
     *
     * @param bookingAgentName 订舱代理名称
     */
    public void setBookingAgentName(String bookingAgentName) {
        this.bookingAgentName = bookingAgentName;
    }

    /**
     * 获取起运港，取码表中的值start_shipment_port，有多个用逗号分隔
     *
     * @return start_shipment_port - 起运港，取码表中的值start_shipment_port，有多个用逗号分隔
     */
    public String getStartShipmentPort() {
        return startShipmentPort;
    }

    /**
     * 设置起运港，取码表中的值start_shipment_port，有多个用逗号分隔
     *
     * @param startShipmentPort 起运港，取码表中的值start_shipment_port，有多个用逗号分隔
     */
    public void setStartShipmentPort(String startShipmentPort) {
        this.startShipmentPort = startShipmentPort;
    }

    /**
     * 获取起运港
     *
     * @return start_shipment_port_name - 起运港
     */
    public String getStartShipmentPortName() {
        return startShipmentPortName;
    }

    /**
     * 设置起运港
     *
     * @param startShipmentPortName 起运港
     */
    public void setStartShipmentPortName(String startShipmentPortName) {
        this.startShipmentPortName = startShipmentPortName;
    }

    /**
     * 获取承运人code
     *
     * @return transfer_company_code - 承运人code
     */
    public String getTransferCompanyCode() {
        return transferCompanyCode;
    }

    /**
     * 设置承运人code
     *
     * @param transferCompanyCode 承运人code
     */
    public void setTransferCompanyCode(String transferCompanyCode) {
        this.transferCompanyCode = transferCompanyCode;
    }

    /**
     * 获取承运人
     *
     * @return transfer_company_name - 承运人
     */
    public String getTransferCompanyName() {
        return transferCompanyName;
    }

    /**
     * 设置承运人
     *
     * @param transferCompanyName 承运人
     */
    public void setTransferCompanyName(String transferCompanyName) {
        this.transferCompanyName = transferCompanyName;
    }

    /**
     * 获取船代类型，取码表中的值 shipping_agent
     *
     * @return shipping_agent_code - 船代类型，取码表中的值 shipping_agent
     */
    public String getShippingAgentCode() {
        return shippingAgentCode;
    }

    /**
     * 设置船代类型，取码表中的值 shipping_agent
     *
     * @param shippingAgentCode 船代类型，取码表中的值 shipping_agent
     */
    public void setShippingAgentCode(String shippingAgentCode) {
        this.shippingAgentCode = shippingAgentCode;
    }

    /**
     * 获取船代类型
     *
     * @return shipping_agent_name - 船代类型
     */
    public String getShippingAgentName() {
        return shippingAgentName;
    }

    /**
     * 设置船代类型
     *
     * @param shippingAgentName 船代类型
     */
    public void setShippingAgentName(String shippingAgentName) {
        this.shippingAgentName = shippingAgentName;
    }

    /**
     * 获取传输方式，取码表中的值transfer_type
     *
     * @return transfer_type - 传输方式，取码表中的值transfer_type
     */
    public String getTransferType() {
        return transferType;
    }

    /**
     * 设置传输方式，取码表中的值transfer_type
     *
     * @param transferType 传输方式，取码表中的值transfer_type
     */
    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    /**
     * 获取传输方式
     *
     * @return transfer_type_name - 传输方式
     */
    public String getTransferTypeName() {
        return transferTypeName;
    }

    /**
     * 设置传输方式
     *
     * @param transferTypeName 传输方式
     */
    public void setTransferTypeName(String transferTypeName) {
        this.transferTypeName = transferTypeName;
    }

    /**
     * 获取外部系统，取码表 external_system
     *
     * @return external_system_code - 外部系统，取码表 external_system
     */
    public String getExternalSystemCode() {
        return externalSystemCode;
    }

    /**
     * 设置外部系统，取码表 external_system
     *
     * @param externalSystemCode 外部系统，取码表 external_system
     */
    public void setExternalSystemCode(String externalSystemCode) {
        this.externalSystemCode = externalSystemCode;
    }

    /**
     * 获取外部系统名
     *
     * @return external_system_name - 外部系统名
     */
    public String getExternalSystemName() {
        return externalSystemName;
    }

    /**
     * 设置外部系统名
     *
     * @param externalSystemName 外部系统名
     */
    public void setExternalSystemName(String externalSystemName) {
        this.externalSystemName = externalSystemName;
    }

    /**
     * 获取客户名称，取码表customer
     *
     * @return customer_code - 客户名称，取码表customer
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * 设置客户名称，取码表customer
     *
     * @param customerCode 客户名称，取码表customer
     */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    /**
     * 获取发送方代码
     *
     * @return send_code - 发送方代码
     */
    public String getSendCode() {
        return sendCode;
    }

    /**
     * 设置发送方代码
     *
     * @param sendCode 发送方代码
     */
    public void setSendCode(String sendCode) {
        this.sendCode = sendCode;
    }

    /**
     * 获取发货方代码
     *
     * @return send_goods_code - 发货方代码
     */
    public String getSendGoodsCode() {
        return sendGoodsCode;
    }

    /**
     * 设置发货方代码
     *
     * @param sendGoodsCode 发货方代码
     */
    public void setSendGoodsCode(String sendGoodsCode) {
        this.sendGoodsCode = sendGoodsCode;
    }

    /**
     * 获取接收方代码
     *
     * @return receive_code - 接收方代码
     */
    public String getReceiveCode() {
        return receiveCode;
    }

    /**
     * 设置接收方代码
     *
     * @param receiveCode 接收方代码
     */
    public void setReceiveCode(String receiveCode) {
        this.receiveCode = receiveCode;
    }

    /**
     * 获取导出文件类型，取码表中的值export_type
     *
     * @return export_type - 导出文件类型，取码表中的值export_type
     */
    public String getExportType() {
        return exportType;
    }

    /**
     * 设置导出文件类型，取码表中的值export_type
     *
     * @param exportType 导出文件类型，取码表中的值export_type
     */
    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    /**
     * 获取导出类型名称
     *
     * @return export_type_name - 导出类型名称
     */
    public String getExportTypeName() {
        return exportTypeName;
    }

    /**
     * 设置导出类型名称
     *
     * @param exportTypeName 导出类型名称
     */
    public void setExportTypeName(String exportTypeName) {
        this.exportTypeName = exportTypeName;
    }

    /**
     * 获取ftp地址
     *
     * @return ftp_address - ftp地址
     */
    public String getFtpAddress() {
        return ftpAddress;
    }

    /**
     * 设置ftp地址
     *
     * @param ftpAddress ftp地址
     */
    public void setFtpAddress(String ftpAddress) {
        this.ftpAddress = ftpAddress;
    }

    /**
     * 获取ftp路径
     *
     * @return ftp_path - ftp路径
     */
    public String getFtpPath() {
        return ftpPath;
    }

    /**
     * 设置ftp路径
     *
     * @param ftpPath ftp路径
     */
    public void setFtpPath(String ftpPath) {
        this.ftpPath = ftpPath;
    }

    /**
     * 获取FTP端口
     *
     * @return ftp_port - FTP端口
     */
    public Integer getFtpPort() {
        return ftpPort;
    }

    /**
     * 设置FTP端口
     *
     * @param ftpPort FTP端口
     */
    public void setFtpPort(Integer ftpPort) {
        this.ftpPort = ftpPort;
    }

    /**
     * 获取FTP用户名
     *
     * @return ftp_username - FTP用户名
     */
    public String getFtpUsername() {
        return ftpUsername;
    }

    /**
     * 设置FTP用户名
     *
     * @param ftpUsername FTP用户名
     */
    public void setFtpUsername(String ftpUsername) {
        this.ftpUsername = ftpUsername;
    }

    /**
     * 获取FTP密码
     *
     * @return ftp_password - FTP密码
     */
    public String getFtpPassword() {
        return ftpPassword;
    }

    /**
     * 设置FTP密码
     *
     * @param ftpPassword FTP密码
     */
    public void setFtpPassword(String ftpPassword) {
        this.ftpPassword = ftpPassword;
    }

    /**
     * 获取船公司数据在主数据进行代码转换的appCode
     *
     * @return transfer_company_app_code - 船公司数据在主数据进行代码转换的appCode
     */
    public String getTransferCompanyAppCode() {
        return transferCompanyAppCode;
    }

    /**
     * 设置船公司数据在主数据进行代码转换的appCode
     *
     * @param transferCompanyAppCode 船公司数据在主数据进行代码转换的appCode
     */
    public void setTransferCompanyAppCode(String transferCompanyAppCode) {
        this.transferCompanyAppCode = transferCompanyAppCode;
    }

    /**
     * 获取转换源类型(1:本地数据,2:主数据数据)
     *
     * @return transform_resource_type - 转换源类型(1:本地数据,2:主数据数据)
     */
    public Byte getTransformResourceType() {
        return transformResourceType;
    }

    /**
     * 设置转换源类型(1:本地数据,2:主数据数据)
     *
     * @param transformResourceType 转换源类型(1:本地数据,2:主数据数据)
     */
    public void setTransformResourceType(Byte transformResourceType) {
        this.transformResourceType = transformResourceType;
    }

    /**
     * 获取是否允许输入中文
     *
     * @return is_allow_cn - 是否允许输入中文
     */
    public Boolean getIsAllowCn() {
        return isAllowCn;
    }

    /**
     * 设置是否允许输入中文
     *
     * @param isAllowCn 是否允许输入中文
     */
    public void setIsAllowCn(Boolean isAllowCn) {
        this.isAllowCn = isAllowCn;
    }

    /**
     * 获取是否登录校验：1：是 2：否
     *
     * @return login - 是否登录校验：1：是 2：否
     */
    public Byte getLogin() {
        return login;
    }

    /**
     * 设置是否登录校验：1：是 2：否
     *
     * @param login 是否登录校验：1：是 2：否
     */
    public void setLogin(Byte login) {
        this.login = login;
    }

    /**
     * 获取提交方式：1：post 2：get
     *
     * @return submit_type - 提交方式：1：post 2：get
     */
    public Byte getSubmitType() {
        return submitType;
    }

    /**
     * 设置提交方式：1：post 2：get
     *
     * @param submitType 提交方式：1：post 2：get
     */
    public void setSubmitType(Byte submitType) {
        this.submitType = submitType;
    }

    /**
     * 获取参数值格式：1：json 2：text
     *
     * @return content_type - 参数值格式：1：json 2：text
     */
    public Byte getContentType() {
        return contentType;
    }

    /**
     * 设置参数值格式：1：json 2：text
     *
     * @param contentType 参数值格式：1：json 2：text
     */
    public void setContentType(Byte contentType) {
        this.contentType = contentType;
    }

    /**
     * 获取发送方式：1：body 2：form
     *
     * @return send_type - 发送方式：1：body 2：form
     */
    public Byte getSendType() {
        return sendType;
    }

    /**
     * 设置发送方式：1：body 2：form
     *
     * @param sendType 发送方式：1：body 2：form
     */
    public void setSendType(Byte sendType) {
        this.sendType = sendType;
    }

    /**
     * 获取请求头信息
     *
     * @return header - 请求头信息
     */
    public String getHeader() {
        return header;
    }

    /**
     * 设置请求头信息
     *
     * @param header 请求头信息
     */
    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * 获取签名字符串
     *
     * @return sign - 签名字符串
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置签名字符串
     *
     * @param sign 签名字符串
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 获取是否启用，1：启用，0：禁用
     *
     * @return enabled - 是否启用，1：启用，0：禁用
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 设置是否启用，1：启用，0：禁用
     *
     * @param enabled 是否启用，1：启用，0：禁用
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取客户ID
     *
     * @return org_id - 客户ID
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * 设置客户ID
     *
     * @param orgId 客户ID
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取客户名称
     *
     * @return org_name - 客户名称
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置客户名称
     *
     * @param orgName 客户名称
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取修改人
     *
     * @return modify_by - 修改人
     */
    public Long getModifyBy() {
        return modifyBy;
    }

    /**
     * 设置修改人
     *
     * @param modifyBy 修改人
     */
    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    /**
     * 获取版本
     *
     * @return version - 版本
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置版本
     *
     * @param version 版本
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取是否删除 1：是，0：否
     *
     * @return is_deleted - 是否删除 1：是，0：否
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除 1：是，0：否
     *
     * @param isDeleted 是否删除 1：是，0：否
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}