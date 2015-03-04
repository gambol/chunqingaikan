package com.twocloo.base.alipay; class ResultChecker { void a() { int a;
a=0;// .class public Lcom/twocloo/base/alipay/ResultChecker;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ResultChecker.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final RESULT_CHECK_SIGN_FAILED:I = 0x1
a=0;// 
a=0;// .field public static final RESULT_CHECK_SIGN_SUCCEED:I = 0x2
a=0;// 
a=0;// .field public static final RESULT_INVALID_PARAM:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mContent:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "content"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 18
a=0;//     #p0=(Reference,Lcom/twocloo/base/alipay/ResultChecker;);
a=0;//     iput-object p1, p0, Lcom/twocloo/base/alipay/ResultChecker;->mContent:Ljava/lang/String;
a=0;// 
a=0;//     .line 19
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public checkSign()I
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     .line 53
a=0;//     .local v5, "retVal":I
a=0;//     :try_start_0
a=0;//     #v5=(PosByte);
a=0;//     iget-object v9, p0, Lcom/twocloo/base/alipay/ResultChecker;->mContent:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, ";"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v10}, Lcom/twocloo/base/alipay/BaseHelper;->string2JSON(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 54
a=0;//     .local v2, "objContent":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v9, "result"
a=0;// 
a=0;//     invoke-virtual {v2, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 55
a=0;//     .local v4, "result":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/lit8 v10, v10, -0x1
a=0;// 
a=0;//     invoke-virtual {v4, v9, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 57
a=0;//     const-string v9, "&sign_type="
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 58
a=0;//     .local v1, "iSignContentEnd":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {v4, v9, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 60
a=0;//     .local v7, "signContent":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "&"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v9}, Lcom/twocloo/base/alipay/BaseHelper;->string2JSON(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 61
a=0;//     .local v3, "objResult":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v9, "sign_type"
a=0;// 
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 62
a=0;//     .local v8, "signType":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "\""
a=0;// 
a=0;//     const-string v10, ""
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 64
a=0;//     const-string v9, "sign"
a=0;// 
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 65
a=0;//     .local v6, "sign":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "\""
a=0;// 
a=0;//     const-string v10, ""
a=0;// 
a=0;//     invoke-virtual {v6, v9, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 67
a=0;//     const-string v9, "RSA"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     const-string v9, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v6, v9}, Lcom/twocloo/base/alipay/Rsa;->doCheck(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_0
a=0;// 
a=0;//     .line 69
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 76
a=0;//     .end local v1    # "iSignContentEnd":I
a=0;//     .end local v2    # "objContent":Lorg/json/JSONObject;
a=0;//     .end local v3    # "objResult":Lorg/json/JSONObject;
a=0;//     .end local v4    # "result":Ljava/lang/String;
a=0;//     .end local v6    # "sign":Ljava/lang/String;
a=0;//     .end local v7    # "signContent":Ljava/lang/String;
a=0;//     .end local v8    # "signType":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return v5
a=0;// 
a=0;//     .line 71
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 72
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 73
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
