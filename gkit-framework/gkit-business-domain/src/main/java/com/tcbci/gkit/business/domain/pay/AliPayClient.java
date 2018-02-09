package com.tcbci.gkit.business.domain.pay;

import java.io.Serializable;

public class AliPayClient implements Serializable {

	private static final long serialVersionUID = 7954282821178404312L;

	private String URL;// 支付宝网关（固定）
	private String APP_ID;// APPID即创建应用后生成
	private String APP_PRIVATE_KEY;// 开发者应用私钥，由开发者自己生成
	private String FORMAT;// 参数返回格式，只支持json
	private String CHARSET;// 请求和签名使用的字符编码格式，支持GBK和UTF-8
	private String ALIPAY_PUBLIC_KEY;// 支付宝公钥，由支付宝生成
	private String SIGN_TYPE;// 商户生成签名字符串所使用的签名算法类型，目前支持RSA2和RSA，推荐使用RSA2

	public AliPayClient() {
		this.URL = "https://openapi.alipay.com/gateway.do";
		this.APP_ID = "2015120100894298";
		this.APP_PRIVATE_KEY = "MIIEwAIBADANBgkqhkiG9w0BAQEFAASCBKowggSmAgEAAoIBAQDOnG6xz9jI8+IeqlKnmn2V29Gno5FXVXZcpudkCraUes8tVMMVdmp0VjiAWdVgG432+ScAywNS+caf4p3jX4CmlDH3bUpC/IH4s+fpPywP26iuH5z1PaJUXEI0LikAWET1Yn8lLAg0kiZsI1ITeca3P5cIwA9PkrSHh+FI+g0XG82a8uWdh1kswyU5eo8qZPyHXrk+OK+mzX5CN92bDxs0I8njcQ2ZhC5Usi51C2Zx5cBQ8o0/w/GE+nJP9zWuQkWWfEa8CDW/2Vre+ZHjPg0VYo7M9jd+TY585THcDZuhWRUl+kT7VQ3RxbIeZLrPC4+YlF5ktjwPgWR+lDvSY5HTAgMBAAECggEBAMWuBns6UkByl7afX9XciqwHVeD/LuBQdJ7RUjL1zRrjJbZJkx3F3rTQid7EFNOPiZTzbc3kb5nEQbZYLJiPl5fJ0sTZXGQbFH/QIeOY/Z9um0V+Gb7K6bWtT+p8/93ElrXxN5VpO7CQ5RIx+SWJLgfGX8uPdxa7Vt8VswcPt9aSmxSVUiIHeB0swjvgPcYaTQH1GTbsz55IETCEOC/3X2pSz2eauexWcuFNrW45q8Bb3uL+zJudpa0WNrwB+ddDH90jS3yI+aSkDoiaF4qIH/xl9NlXy9lBtLa80DFx90EglZBWT6tSr4lM1V4PodZIxVNsksBSZqTZNzkip674GAECgYEA7nmhmRcNDrSf5ylDQNS/ClKo/lmRNM9ScDrlB9P/J7zIzRlCDiaiORHjBUjwRmL9gI1LTpCkADTtfjJL8uiexa6cvnlj1iCKd0HelPYfd4Nkw0h6LbOFkDkM56er5K/sN08oamUw1q76vPFt42P9S0rIyq6i9vSb7ABYzn8XsUECgYEA3ctZ5OSzA9YeBN7jIX9Ki/2zEk+xlALS2cz33sZpLzrKx8U+NjnJ/N9BSO+Wi2hvA1hnGXkPm03YrgP2KYUL/KvUIYIeHCdR0NB6r28+azj/W46fjXqCbsgeBru4wR7sWW0UOMZ4gLSsZGA44htiSjLPJQB09uJT0SBjZric6hMCgYEAuKDclry89Dyta/eLRP8xJNnYUoufmyZD6fX+6a+c5PQI9pluhawtfke13pqYw7XSFBvQSPQ8tJhFoqVoHZkxi1Tjr6glvlsVOL17iRKATDQi5/oN9aH+bylsL1GmCHiXRj73yF+tjxiLsYqtjBYWvZsZl6nbK503tmCSYNUOz8ECgYEAtyOpl8JsOve7k+QDgm5cPNoA2lbp18C5IFUKO25z/ia6uFgbNaVkLySeAL6s/XH/cLC3eSYoh+Gw0Ie+5KvSqRGtOPn7KN4ixZzQITpnPRw0ZwKOpsEJILanbIHnXbfOC01xjCv95rDJRJzbe4CHGaN4viHxcsaR1TW8Pl6kWvcCgYEA3CjpImafkxGoGFZMVBBcYqRYY44porU/ZXWM5BFkU/GJu9KAHtZnkDuYUigYrM+R9ZVmhUTIM6jAtjjDd0zOs/lEmU8+/NKtR0EUqJtZgb07X+LyEdvPQ4lAsRad7eETD+kQzgsSH/Q+MhvPhfFjZp/LmTlcSz6j1C+kyejlgBQ=";
		this.FORMAT = "json";
		this.CHARSET = "UTF-8";
		this.ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1CBqoelbYp1wjCcKd8ndTQug9WZFVJNxTAuhkjztWVCYxGovq3soC1JB9Ynr7g2gZJbGdTB0hEfP+o4PmvpvjQYzEuiv9uTXoqZDuI2MB4EijBBHTj2BhlBpcm/Ut7bG0NLHSdsazXmK8nTJ/blp70dAy/WyxsWnoMUBY704GyuxhD3bzhs4WileU/9V1lNcxrVrT3j+HTsSzbTUdHEa7BWToLVbvgzE5Jo1T5tgoRrdFewMp7u4k4fp8Z/9Wux0zL2YgFMeBFoFb45GtorVZ9zM/qNDkjq00yd9CPcHRO6uPuDtbAj00hnKwi22r48tGKEB2tAUDbnJ5Av4WTU+3wIDAQAB";
		this.SIGN_TYPE = "RSA2";
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getAPP_ID() {
		return APP_ID;
	}

	public void setAPP_ID(String aPP_ID) {
		APP_ID = aPP_ID;
	}

	public String getAPP_PRIVATE_KEY() {
		return APP_PRIVATE_KEY;
	}

	public void setAPP_PRIVATE_KEY(String aPP_PRIVATE_KEY) {
		APP_PRIVATE_KEY = aPP_PRIVATE_KEY;
	}

	public String getFORMAT() {
		return FORMAT;
	}

	public void setFORMAT(String fORMAT) {
		FORMAT = fORMAT;
	}

	public String getCHARSET() {
		return CHARSET;
	}

	public void setCHARSET(String cHARSET) {
		CHARSET = cHARSET;
	}

	public String getALIPAY_PUBLIC_KEY() {
		return ALIPAY_PUBLIC_KEY;
	}

	public void setALIPAY_PUBLIC_KEY(String aLIPAY_PUBLIC_KEY) {
		ALIPAY_PUBLIC_KEY = aLIPAY_PUBLIC_KEY;
	}

	public String getSIGN_TYPE() {
		return SIGN_TYPE;
	}

	public void setSIGN_TYPE(String sIGN_TYPE) {
		SIGN_TYPE = sIGN_TYPE;
	}

}
