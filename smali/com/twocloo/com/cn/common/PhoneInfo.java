package com.twocloo.com.cn.common; class PhoneInfo { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PhoneInfo.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final TAG:Ljava/lang/String; = "PhoneInfo"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private activity:Landroid/app/Activity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;)V
a=0;//     .locals 0
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 27
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/PhoneInfo;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 28
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCurrentVersion()I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 83
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v3}, Landroid/app/Application;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v4}, Landroid/app/Application;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 84
a=0;//     .local v1, "info":Landroid/content/pm/PackageInfo;
a=0;//     #v1=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     iget v2, v1, Landroid/content/pm/PackageInfo;->versionCode:I
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 88
a=0;//     .end local v1    # "info":Landroid/content/pm/PackageInfo;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 85
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Null);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 86
a=0;//     .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getImei()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/common/PhoneInfo;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     const-string v2, "000000000000000"
a=0;// 
a=0;//     .line 59
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/common/PhoneInfo;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     const-string v3, "phone"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 55
a=0;//     .local v1, "telMan":Landroid/telephony/TelephonyManager;
a=0;//     invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 56
a=0;//     .local v0, "imei":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 57
a=0;//     const-string v2, "000000000000000"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 59
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getMac()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 69
a=0;//     .local v1, "mac":Ljava/lang/String;
a=0;//     #v1=(Null);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/PhoneInfo;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     const-string v4, "wifi"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     .line 70
a=0;//     .local v2, "wifi":Landroid/net/wifi/WifiManager;
a=0;//     invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 71
a=0;//     .local v0, "info":Landroid/net/wifi/WifiInfo;
a=0;//     #v0=(Reference,Landroid/net/wifi/WifiInfo;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 72
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 74
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public getModel()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getScreenH()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     new-instance v0, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     .line 40
a=0;//     .local v0, "dm":Landroid/util/DisplayMetrics;
a=0;//     #v0=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/PhoneInfo;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     .line 41
a=0;//     iget v1, v0, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public getScreenPix()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     new-instance v0, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     .line 33
a=0;//     .local v0, "dm":Landroid/util/DisplayMetrics;
a=0;//     #v0=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/PhoneInfo;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     .line 34
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "*"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
}}
