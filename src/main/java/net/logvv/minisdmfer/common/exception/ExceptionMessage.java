package net.logvv.minisdmfer.common.exception;

import java.util.Date;

public class ExceptionMessage {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_common_exception_message.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_common_exception_message.product_code
     *
     * @mbggenerated
     */
    private String productCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_common_exception_message.version_name
     *
     * @mbggenerated
     */
    private String versionName;
    
    private String phoneNumber;
    
    private String userToken;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_common_exception_message.user_operation_desc
     *
     * @mbggenerated
     */
    private String userOperationDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_common_exception_message.exception_message
     *
     * @mbggenerated
     */
    private String exceptionMessage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_common_exception_message.exception_level
     *
     * @mbggenerated
     */
    private ExceptionLevel exceptionLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_common_exception_message.client_type
     *
     * @mbggenerated
     */
    private String clientType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_common_exception_message.occur_time
     *
     * @mbggenerated
     */
    private Date occurTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_common_exception_message.fixed_time
     *
     * @mbggenerated
     */
    private Date fixedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_common_exception_message.is_fixed
     *
     * @mbggenerated
     */
    private Boolean isFixed;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_common_exception_message.id
     *
     * @return the value of t_common_exception_message.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_common_exception_message.id
     *
     * @param id the value for t_common_exception_message.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_common_exception_message.product_code
     *
     * @return the value of t_common_exception_message.product_code
     *
     * @mbggenerated
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_common_exception_message.product_code
     *
     * @param productCode the value for t_common_exception_message.product_code
     *
     * @mbggenerated
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_common_exception_message.version_name
     *
     * @return the value of t_common_exception_message.version_name
     *
     * @mbggenerated
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_common_exception_message.version_name
     *
     * @param versionName the value for t_common_exception_message.version_name
     *
     * @mbggenerated
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName == null ? null : versionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_common_exception_message.user_operation_desc
     *
     * @return the value of t_common_exception_message.user_operation_desc
     *
     * @mbggenerated
     */
    public String getUserOperationDesc() {
        return userOperationDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_common_exception_message.user_operation_desc
     *
     * @param userOperationDesc the value for t_common_exception_message.user_operation_desc
     *
     * @mbggenerated
     */
    public void setUserOperationDesc(String userOperationDesc) {
        this.userOperationDesc = userOperationDesc == null ? null : userOperationDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_common_exception_message.exception_message
     *
     * @return the value of t_common_exception_message.exception_message
     *
     * @mbggenerated
     */
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_common_exception_message.exception_message
     *
     * @param exceptionMessage the value for t_common_exception_message.exception_message
     *
     * @mbggenerated
     */
    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage == null ? null : exceptionMessage.trim();
    }

   

    public ExceptionLevel getExceptionLevel()
	{
		return exceptionLevel;
	}

	public void setExceptionLevel(ExceptionLevel exceptionLevel)
	{
		this.exceptionLevel = exceptionLevel;
	}

//	/**
//     * This method was generated by MyBatis Generator.
//     * This method returns the value of the database column t_common_exception_message.client_type
//     *
//     * @return the value of t_common_exception_message.client_type
//     *
//     * @mbggenerated
//     */
//    public String getClientType() {
//        return clientType;
//    }
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method sets the value of the database column t_common_exception_message.client_type
//     *
//     * @param productEnd the value for t_common_exception_message.client_type
//     *
//     * @mbggenerated
//     */
//    public void setClientType(String clientType) {
//        this.clientType = clientType == null ? null : clientType.trim();
//    }

	
	
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_common_exception_message.occur_time
     *
     * @return the value of t_common_exception_message.occur_time
     *
     * @mbggenerated
     */
    public Date getOccurTime() {
        return occurTime;
    }

    public String getClientType()
	{
		return clientType;
	}

	public void setClientType(String clientType)
	{
		this.clientType = clientType;
	}

	public Boolean getIsFixed()
	{
		return isFixed;
	}

	public void setIsFixed(Boolean isFixed)
	{
		this.isFixed = isFixed;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_common_exception_message.occur_time
     *
     * @param occurTime the value for t_common_exception_message.occur_time
     *
     * @mbggenerated
     */
    public void setOccurTime(Date occurTime) {
        this.occurTime = occurTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_common_exception_message.fixed_time
     *
     * @return the value of t_common_exception_message.fixed_time
     *
     * @mbggenerated
     */
    public Date getFixedTime() {
        return fixedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_common_exception_message.fixed_time
     *
     * @param fixedTime the value for t_common_exception_message.fixed_time
     *
     * @mbggenerated
     */
    public void setFixedTime(Date fixedTime) {
        this.fixedTime = fixedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_common_exception_message.is_fixed
     *
     * @return the value of t_common_exception_message.is_fixed
     *
     * @mbggenerated
     */
    public Boolean IsFixed() {
        return isFixed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_common_exception_message.is_fixed
     *
     * @param isFixed the value for t_common_exception_message.is_fixed
     *
     * @mbggenerated
     */
    public void setFixed(Boolean isFixed) {
        this.isFixed = isFixed;
    }

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public String getUserToken()
	{
		return userToken;
	}

	public void setUserToken(String userToken)
	{
		this.userToken = userToken;
	}
    
    
}