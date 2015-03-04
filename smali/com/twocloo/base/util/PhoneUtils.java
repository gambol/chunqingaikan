package com.twocloo.base.util; class PhoneUtils { void a() { int a;
a=0;// .class public Lcom/twocloo/base/util/PhoneUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PhoneUtils.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/util/PhoneUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static addShortcutToDesktop(Landroid/app/Activity;II)V
a=0;//     .locals 4
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "iconResourceId"    # I
a=0;//     .param p2, "appNameResourceId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "com.android.launcher.action.INSTALL_SHORTCUT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 122
a=0;//     .local v0, "shortcut":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "duplicate"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
a=0;// 
a=0;//     .line 126
a=0;//     const-string v1, "android.intent.extra.shortcut.NAME"
a=0;// 
a=0;//     invoke-virtual {p0, p2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 129
a=0;//     const-string v1, "android.intent.extra.shortcut.ICON_RESOURCE"
a=0;// 
a=0;//     invoke-static {p0, p1}, Landroid/content/Intent$ShortcutIconResource;->fromContext(Landroid/content/Context;I)Landroid/content/Intent$ShortcutIconResource;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 133
a=0;//     const-string v1, "android.intent.extra.shortcut.INTENT"
a=0;// 
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "android.intent.action.MAIN"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 137
a=0;//     invoke-virtual {p0, v0}, Landroid/app/Activity;->sendBroadcast(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 139
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getAirplaneMode(Landroid/content/Context;)Z
a=0;//     .locals 5
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 191
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/ContentResolver;);
a=0;//     const-string v4, "airplane_mode_on"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v2}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 192
a=0;//     .local v0, "isAirplaneMode":I
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(One);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getCurActivity(Landroid/app/Activity;)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     const-string v3, "activity"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/app/ActivityManager;
a=0;// 
a=0;//     .line 183
a=0;//     .local v1, "manager":Landroid/app/ActivityManager;
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v1, v3}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/ActivityManager$RunningTaskInfo;
a=0;// 
a=0;//     .line 184
a=0;//     .local v0, "info":Landroid/app/ActivityManager$RunningTaskInfo;
a=0;//     iget-object v3, v0, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/ComponentName;->getShortClassName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 186
a=0;//     .local v2, "shortClassName":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public static getMacAddress(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 66
a=0;//     .local v1, "mac":Ljava/lang/String;
a=0;//     #v1=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     const-string v3, "wifi"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     .line 68
a=0;//     .local v2, "wifi":Landroid/net/wifi/WifiManager;
a=0;//     invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 69
a=0;//     .local v0, "info":Landroid/net/wifi/WifiInfo;
a=0;//     #v0=(Reference,Landroid/net/wifi/WifiInfo;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 73
a=0;//     .end local v0    # "info":Landroid/net/wifi/WifiInfo;
a=0;//     .end local v2    # "wifi":Landroid/net/wifi/WifiManager;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static final getMessagesFromIntent(Landroid/content/Intent;)[Landroid/telephony/SmsMessage;
a=0;//     .locals 7
a=0;//     .param p0, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     const-string v6, "pdus"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/Serializable;);
a=0;//     check-cast v1, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 150
a=0;//     .local v1, "messages":[Ljava/lang/Object;
a=0;//     array-length v6, v1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     new-array v4, v6, [[B
a=0;// 
a=0;//     .line 152
a=0;//     .local v4, "pduObjs":[[B
a=0;//     #v4=(Reference,[[B);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v6=(Conflicted);
a=0;//     array-length v6, v1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lt v0, v6, :cond_0
a=0;// 
a=0;//     .line 160
a=0;//     array-length v6, v4
a=0;// 
a=0;//     new-array v5, v6, [[B
a=0;// 
a=0;//     .line 162
a=0;//     .local v5, "pdus":[[B
a=0;//     #v5=(Reference,[[B);
a=0;//     array-length v3, v5
a=0;// 
a=0;//     .line 164
a=0;//     .local v3, "pduCount":I
a=0;//     #v3=(Integer);
a=0;//     new-array v2, v3, [Landroid/telephony/SmsMessage;
a=0;// 
a=0;//     .line 166
a=0;//     .local v2, "msgs":[Landroid/telephony/SmsMessage;
a=0;//     #v2=(Reference,[Landroid/telephony/SmsMessage;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v6=(Conflicted);
a=0;//     if-lt v0, v3, :cond_1
a=0;// 
a=0;//     .line 176
a=0;//     return-object v2
a=0;// 
a=0;//     .line 156
a=0;//     .end local v2    # "msgs":[Landroid/telephony/SmsMessage;
a=0;//     .end local v3    # "pduCount":I
a=0;//     .end local v5    # "pdus":[[B
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Integer);
a=0;//     aget-object v6, v1, v0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     check-cast v6, [B
a=0;// 
a=0;//     #v6=(Reference,[B);
a=0;//     aput-object v6, v4, v0
a=0;// 
a=0;//     .line 152
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 170
a=0;//     .restart local v2    # "msgs":[Landroid/telephony/SmsMessage;
a=0;//     .restart local v3    # "pduCount":I
a=0;//     .restart local v5    # "pdus":[[B
a=0;//     :cond_1
a=0;//     #v2=(Reference,[Landroid/telephony/SmsMessage;);v3=(Integer);v5=(Reference,[[B);v6=(Conflicted);
a=0;//     aget-object v6, v4, v0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     aput-object v6, v5, v0
a=0;// 
a=0;//     .line 172
a=0;//     aget-object v6, v5, v0
a=0;// 
a=0;//     invoke-static {v6}, Landroid/telephony/SmsMessage;->createFromPdu([B)Landroid/telephony/SmsMessage;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/telephony/SmsMessage;);
a=0;//     aput-object v6, v2, v0
a=0;// 
a=0;//     .line 166
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static getPackageInfo(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;
a=0;//     .locals 5
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "packageName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 200
a=0;//     .local v1, "manager":Landroid/content/pm/PackageManager;
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v4}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 202
a=0;//     .local v3, "pkgList":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/PackageInfo;>;"
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v4=(Boolean);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lt v0, v4, :cond_1
a=0;// 
a=0;//     .line 209
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 203
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     .line 205
a=0;//     .local v2, "pI":Landroid/content/pm/PackageInfo;
a=0;//     iget-object v4, v2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 202
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 50
a=0;//     .local v0, "imei":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     const-string v2, "phone"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 52
a=0;//     .local v1, "telMan":Landroid/telephony/TelephonyManager;
a=0;//     invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 53
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 54
a=0;//     const-string v2, "000000000000000"
a=0;// 
a=0;//     .line 57
a=0;//     .end local v1    # "telMan":Landroid/telephony/TelephonyManager;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getPhoneModel()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     :try_start_0
a=0;//     sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 40
a=0;//     .local v0, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 36
a=0;//     .end local v0    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 37
a=0;//     .restart local v0    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 40
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getScreenPix(Landroid/app/Activity;)[I
a=0;//     .locals 4
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     new-instance v0, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     .line 84
a=0;//     .local v0, "dm":Landroid/util/DisplayMetrics;
a=0;//     #v0=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/WindowManager;);
a=0;//     invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     .line 85
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v1, v2, [I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget v3, v0, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aput v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iget v3, v0, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     aput v3, v1, v2
a=0;// 
a=0;//     .line 87
a=0;//     .local v1, "pixs":[I
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static getSystemVersionCode()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 97
a=0;//     .local v1, "version":I
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 101
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 98
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 99
a=0;//     .local v0, "e":Ljava/lang/NumberFormatException;
a=0;//     #v0=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
