package com.tencent.connect.a; class a { void a() { int a;
a=0;// .class public Lcom/tencent/connect/a/a;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static varargs a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;[Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     invoke-static {p0, p1}, Lcom/tencent/connect/a/a;->b(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 66
a=0;//     invoke-static {p0, p2, p3}, Lcom/tencent/stat/StatService;->trackCustomEvent(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 67
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-virtual {p1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/tencent/utils/OpenConfig;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/utils/OpenConfig;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "Common_ta_enable"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/utils/OpenConfig;->getBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 28
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     invoke-static {p0, p1}, Lcom/tencent/connect/a/a;->a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 33
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {v0}, Lcom/tencent/stat/StatConfig;->setEnableStatService(Z)V
a=0;// 
a=0;//     .line 37
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     .line 35
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Lcom/tencent/stat/StatConfig;->setEnableStatService(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static c(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-static {p0, p1}, Lcom/tencent/connect/a/a;->b(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 41
a=0;//     invoke-virtual {p1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 42
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Aqc"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 43
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Lcom/tencent/stat/StatConfig;->setAutoExceptionCaught(Z)V
a=0;// 
a=0;//     .line 44
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v1}, Lcom/tencent/stat/StatConfig;->setEnableSmartReporting(Z)V
a=0;// 
a=0;//     .line 45
a=0;//     const/16 v1, 0x5a0
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v1}, Lcom/tencent/stat/StatConfig;->setSendPeriodMinutes(I)V
a=0;// 
a=0;//     .line 46
a=0;//     sget-object v1, Lcom/tencent/stat/StatReportStrategy;->PERIOD:Lcom/tencent/stat/StatReportStrategy;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/StatReportStrategy;);
a=0;//     invoke-static {v1}, Lcom/tencent/stat/StatConfig;->setStatSendStrategy(Lcom/tencent/stat/StatReportStrategy;)V
a=0;// 
a=0;//     .line 47
a=0;//     const-string v1, "http://cgi.connect.qq.com/qqconnectutil/sdk"
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/stat/StatConfig;->setStatReportUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 50
a=0;//     :try_start_0
a=0;//     const-string v1, "1.0.0"
a=0;// 
a=0;//     invoke-static {p0, v0, v1}, Lcom/tencent/stat/StatService;->startStatService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catch Lcom/tencent/stat/MtaSDkException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 54
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 51
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 52
a=0;//     const-string v0, "DEBUG"
a=0;// 
a=0;//     const-string v1, "MTA init Failed."
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static d(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     invoke-static {p0, p1}, Lcom/tencent/connect/a/a;->b(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 58
a=0;//     invoke-virtual {p1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     invoke-virtual {p1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->reportQQ(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
