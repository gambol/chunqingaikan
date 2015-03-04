package com.ccit.mmwlan.util; class GetDeviceInfo { void a() { int a;
a=0;// .class public Lcom/ccit/mmwlan/util/GetDeviceInfo;
a=0;// .super Ljava/lang/Object;
a=0;// .source "GetDeviceInfo.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ccit/mmwlan/util/GetDeviceInfo;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getSubscriberId(Z)Ljava/lang/String;
a=0;//     .locals 11
a=0;//     .param p0, "secondSIMCard"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 142
a=0;//     #v8=(Null);
a=0;//     const-string v4, "android.os.ServiceManager"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "getService"
a=0;// 
a=0;//     .line 143
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-array v6, v9, [Ljava/lang/Class;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Class;);
a=0;//     const-class v3, Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v3, v6, v8
a=0;// 
a=0;//     .line 144
a=0;//     new-array v7, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     const-string v3, "iphonesubinfo2"
a=0;// 
a=0;//     .line 145
a=0;//     :goto_0
a=0;//     aput-object v3, v7, v8
a=0;// 
a=0;//     .line 141
a=0;//     invoke-static {v4, v5, v6, v7}, Lcom/ccit/mmwlan/util/ReflectHelper;->callStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 148
a=0;//     .local v0, "phoneSubObj":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 150
a=0;//     const-string v3, "android.os.ServiceManager"
a=0;// 
a=0;//     const-string v4, "getService"
a=0;// 
a=0;//     .line 151
a=0;//     new-array v5, v9, [Ljava/lang/Class;
a=0;// 
a=0;//     const-class v6, Ljava/lang/String;
a=0;// 
a=0;//     aput-object v6, v5, v8
a=0;// 
a=0;//     .line 152
a=0;//     new-array v6, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     const-string v7, "iphonesubinfo"
a=0;// 
a=0;//     aput-object v7, v6, v8
a=0;// 
a=0;//     .line 149
a=0;//     invoke-static {v3, v4, v5, v6}, Lcom/ccit/mmwlan/util/ReflectHelper;->callStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 154
a=0;//     :cond_0
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     if-eqz p0, :cond_2
a=0;// 
a=0;//     .line 155
a=0;//     invoke-static {v8}, Lcom/ccit/mmwlan/util/GetDeviceInfo;->getSubscriberId(Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 175
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 145
a=0;//     .end local v0    # "phoneSubObj":Ljava/lang/Object;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     const-string v3, "iphonesubinfo1"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 157
a=0;//     .restart local v0    # "phoneSubObj":Ljava/lang/Object;
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 158
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 160
a=0;//     :cond_3
a=0;//     #v2=(Uninit);
a=0;//     const-string v3, "com.android.internal.telephony.IPhoneSubInfo$Stub"
a=0;// 
a=0;//     .line 161
a=0;//     const-string v4, "asInterface"
a=0;// 
a=0;//     new-array v5, v9, [Ljava/lang/Class;
a=0;// 
a=0;//     const-class v6, Landroid/os/IBinder;
a=0;// 
a=0;//     aput-object v6, v5, v8
a=0;// 
a=0;//     .line 162
a=0;//     new-array v6, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     aput-object v0, v6, v8
a=0;// 
a=0;//     .line 159
a=0;//     invoke-static {v3, v4, v5, v6}, Lcom/ccit/mmwlan/util/ReflectHelper;->callStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 163
a=0;//     .local v1, "subinfoObj":Ljava/lang/Object;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 164
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 166
a=0;//     :cond_4
a=0;//     #v2=(Uninit);
a=0;//     const-string v3, "getSubscriberId"
a=0;// 
a=0;//     .line 165
a=0;//     invoke-static {v1, v3, v10, v10}, Lcom/ccit/mmwlan/util/ReflectHelper;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     .line 167
a=0;//     .local v2, "val":Ljava/lang/String;
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 171
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "getSubscriberIdExt"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v9, [Ljava/lang/Class;
a=0;// 
a=0;//     sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v5, v4, v8
a=0;// 
a=0;//     .line 172
a=0;//     new-array v5, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v6, 0x5
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v5, v8
a=0;// 
a=0;//     .line 170
a=0;//     invoke-static {v1, v3, v4, v5}, Lcom/ccit/mmwlan/util/ReflectHelper;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .end local v2    # "val":Ljava/lang/String;
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     .line 174
a=0;//     .restart local v2    # "val":Ljava/lang/String;
a=0;//     :cond_6
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "MmClientSdk"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "getSubscriberId="
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getDeviceInfo(Landroid/content/Context;I)Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     .locals 16
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "cardSlot"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     new-instance v3, Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/ccit/mmwlan/vo/DeviceInfo;);
a=0;//     invoke-direct {v3}, Lcom/ccit/mmwlan/vo/DeviceInfo;-><init>()V
a=0;// 
a=0;//     .line 49
a=0;//     .local v3, "deviceInfo":Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     #v3=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 50
a=0;//     .local v6, "imsi":Ljava/lang/String;
a=0;//     #v6=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 51
a=0;//     .local v5, "imei":Ljava/lang/String;
a=0;//     #v5=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 52
a=0;//     .local v8, "mac":Ljava/lang/String;
a=0;//     #v8=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 54
a=0;//     .local v2, "certFilePath":Ljava/lang/String;
a=0;//     #v2=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 56
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v14, :cond_1
a=0;// 
a=0;//     const/4 v14, 0x2
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     if-eq v0, v14, :cond_1
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v14=(Conflicted);
a=0;//     new-instance v14, Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;// 
a=0;//     #v14=(UninitRef,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     const-string v15, "\u53c2\u6570\u9519\u8bef!"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Lcom/ccit/mmwlan/exception/ClientSDKException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 61
a=0;//     :cond_1
a=0;//     #v14=(Conflicted);v15=(Uninit);
a=0;//     const-string v14, "phone"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, v14}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 60
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 63
a=0;//     .local v7, "mTelephonyMgr":Landroid/telephony/TelephonyManager;
a=0;//     if-nez p2, :cond_6
a=0;// 
a=0;//     .line 65
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-static {v14}, Lcom/ccit/mmwlan/util/GetDeviceInfo;->getSubscriberId(Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 66
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 68
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     const-string v14, ""
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_3
a=0;// 
a=0;//     .line 69
a=0;//     :cond_2
a=0;//     const-string v5, "000000000000000"
a=0;// 
a=0;//     .line 72
a=0;//     :cond_3
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     const-string v14, ""
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_5
a=0;// 
a=0;//     .line 73
a=0;//     :cond_4
a=0;//     new-instance v14, Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;// 
a=0;//     #v14=(UninitRef,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     const-string v15, "\u83b7\u53d6\u8bbe\u5907\u4fe1\u606fimsi\u6216imei\u5931\u8d25!"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Lcom/ccit/mmwlan/exception/ClientSDKException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 76
a=0;//     :cond_5
a=0;//     #v14=(Boolean);v15=(Uninit);
a=0;//     invoke-virtual {v3, v6}, Lcom/ccit/mmwlan/vo/DeviceInfo;->setStrImsi(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 77
a=0;//     invoke-virtual {v3, v5}, Lcom/ccit/mmwlan/vo/DeviceInfo;->setStrImei(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 80
a=0;//     :cond_6
a=0;//     #v14=(Conflicted);
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v14, :cond_b
a=0;// 
a=0;//     .line 82
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     invoke-static {v14}, Lcom/ccit/mmwlan/util/GetDeviceInfo;->getSubscriberId(Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 83
a=0;//     invoke-virtual {v7}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 85
a=0;//     if-eqz v5, :cond_7
a=0;// 
a=0;//     const-string v14, ""
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_8
a=0;// 
a=0;//     .line 86
a=0;//     :cond_7
a=0;//     const-string v5, "000000000000000"
a=0;// 
a=0;//     .line 89
a=0;//     :cond_8
a=0;//     if-eqz v6, :cond_9
a=0;// 
a=0;//     const-string v14, ""
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_a
a=0;// 
a=0;//     .line 90
a=0;//     :cond_9
a=0;//     new-instance v14, Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;// 
a=0;//     #v14=(UninitRef,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     const-string v15, "\u83b7\u53d6\u8bbe\u5907\u4fe1\u606fimsi\u6216imei\u5931\u8d25!"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Lcom/ccit/mmwlan/exception/ClientSDKException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 93
a=0;//     :cond_a
a=0;//     #v14=(Boolean);v15=(Uninit);
a=0;//     invoke-virtual {v3, v6}, Lcom/ccit/mmwlan/vo/DeviceInfo;->setStrImsi(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 94
a=0;//     invoke-virtual {v3, v5}, Lcom/ccit/mmwlan/vo/DeviceInfo;->setStrImei(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 97
a=0;//     :cond_b
a=0;//     const/4 v14, 0x2
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     if-ne v0, v14, :cond_e
a=0;// 
a=0;//     .line 99
a=0;//     const-string v14, "wifi"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, v14}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 98
a=0;//     #v12=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v12, Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     .line 100
a=0;//     .local v12, "wifi":Landroid/net/wifi/WifiManager;
a=0;//     invoke-virtual {v12}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 101
a=0;//     .local v13, "wifiInfo":Landroid/net/wifi/WifiInfo;
a=0;//     #v13=(Reference,Landroid/net/wifi/WifiInfo;);
a=0;//     invoke-virtual {v13}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 103
a=0;//     .local v10, "macInfo":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v10, :cond_c
a=0;// 
a=0;//     const-string v14, ""
a=0;// 
a=0;//     invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_d
a=0;// 
a=0;//     .line 104
a=0;//     :cond_c
a=0;//     #v14=(Conflicted);
a=0;//     new-instance v14, Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;// 
a=0;//     #v14=(UninitRef,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     const-string v15, "\u83b7\u53d6\u8bbe\u5907\u4fe1\u606fmac\u5931\u8d25!"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Lcom/ccit/mmwlan/exception/ClientSDKException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 107
a=0;//     :cond_d
a=0;//     #v14=(Boolean);v15=(Uninit);
a=0;//     const-string v14, ":"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v14}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 108
a=0;//     .local v9, "macArr":[Ljava/lang/String;
a=0;//     #v9=(Reference,[Ljava/lang/String;);
a=0;//     const-string v11, ""
a=0;// 
a=0;//     .line 109
a=0;//     .local v11, "macStr":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i":I
a=0;//     :goto_0
a=0;//     #v4=(Integer);v15=(Conflicted);
a=0;//     array-length v14, v9
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     if-lt v4, v14, :cond_10
a=0;// 
a=0;//     .line 112
a=0;//     move-object v8, v11
a=0;// 
a=0;//     .line 114
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v8}, Lcom/ccit/mmwlan/vo/DeviceInfo;->setStrMac(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 118
a=0;//     .end local v4    # "i":I
a=0;//     .end local v9    # "macArr":[Ljava/lang/String;
a=0;//     .end local v10    # "macInfo":Ljava/lang/String;
a=0;//     .end local v11    # "macStr":Ljava/lang/String;
a=0;//     .end local v12    # "wifi":Landroid/net/wifi/WifiManager;
a=0;//     .end local v13    # "wifiInfo":Landroid/net/wifi/WifiInfo;
a=0;//     :cond_e
a=0;//     #v0=(Conflicted);v4=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 119
a=0;//     .local v1, "certFile":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 121
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_f
a=0;// 
a=0;//     const-string v14, ""
a=0;// 
a=0;//     invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_11
a=0;// 
a=0;//     .line 122
a=0;//     :cond_f
a=0;//     #v14=(Conflicted);
a=0;//     new-instance v14, Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;// 
a=0;//     #v14=(UninitRef,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     const-string v15, "\u83b7\u53d6\u5e94\u7528\u79c1\u6709\u8def\u5f84\u5931\u8d25!"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Lcom/ccit/mmwlan/exception/ClientSDKException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 110
a=0;//     .end local v1    # "certFile":Ljava/io/File;
a=0;//     .restart local v4    # "i":I
a=0;//     .restart local v9    # "macArr":[Ljava/lang/String;
a=0;//     .restart local v10    # "macInfo":Ljava/lang/String;
a=0;//     .restart local v11    # "macStr":Ljava/lang/String;
a=0;//     .restart local v12    # "wifi":Landroid/net/wifi/WifiManager;
a=0;//     .restart local v13    # "wifiInfo":Landroid/net/wifi/WifiInfo;
a=0;//     :cond_10
a=0;//     #v0=(Reference,Landroid/content/Context;);v1=(Uninit);v2=(Null);v4=(Integer);v8=(Null);v9=(Reference,[Ljava/lang/String;);v10=(Reference,Ljava/lang/String;);v11=(Reference,Ljava/lang/String;);v12=(Reference,Landroid/net/wifi/WifiManager;);v13=(Reference,Landroid/net/wifi/WifiInfo;);v14=(Integer);v15=(Conflicted);
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     aget-object v15, v9, v4
a=0;// 
a=0;//     #v15=(Null);
a=0;//     invoke-virtual {v15}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 109
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 125
a=0;//     .end local v4    # "i":I
a=0;//     .end local v9    # "macArr":[Ljava/lang/String;
a=0;//     .end local v10    # "macInfo":Ljava/lang/String;
a=0;//     .end local v11    # "macStr":Ljava/lang/String;
a=0;//     .end local v12    # "wifi":Landroid/net/wifi/WifiManager;
a=0;//     .end local v13    # "wifiInfo":Landroid/net/wifi/WifiInfo;
a=0;//     .restart local v1    # "certFile":Ljava/io/File;
a=0;//     :cond_11
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/File;);v2=(Reference,Ljava/lang/String;);v4=(Conflicted);v8=(Reference,Ljava/lang/String;);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Boolean);v15=(Conflicted);
a=0;//     invoke-virtual {v3, v2}, Lcom/ccit/mmwlan/vo/DeviceInfo;->setFilePath(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 128
a=0;//     const-string v14, "MmClientSdk"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Lcom/ccit/mmwlan/vo/DeviceInfo;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 131
a=0;//     return-object v3
a=0;// .end method
a=0;// 
a=0;// .method public getSubscriberId_old(Z)Ljava/lang/String;
a=0;//     .locals 11
a=0;//     .param p1, "secondSIMCard"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 189
a=0;//     #v8=(Null);
a=0;//     const-string v4, "android.os.ServiceManager"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "getService"
a=0;// 
a=0;//     .line 190
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-array v6, v9, [Ljava/lang/Class;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Class;);
a=0;//     const-class v3, Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v3, v6, v8
a=0;// 
a=0;//     .line 191
a=0;//     new-array v7, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const-string v3, "iphonesubinfo2"
a=0;// 
a=0;//     .line 192
a=0;//     :goto_0
a=0;//     aput-object v3, v7, v8
a=0;// 
a=0;//     .line 188
a=0;//     invoke-static {v4, v5, v6, v7}, Lcom/ccit/mmwlan/util/ReflectHelper;->callStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 194
a=0;//     .local v0, "phoneSubObj":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 195
a=0;//     invoke-static {v8}, Lcom/ccit/mmwlan/util/GetDeviceInfo;->getSubscriberId(Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 215
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 192
a=0;//     .end local v0    # "phoneSubObj":Ljava/lang/Object;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     const-string v3, "iphonesubinfo"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 198
a=0;//     .restart local v0    # "phoneSubObj":Ljava/lang/Object;
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 199
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 203
a=0;//     :cond_2
a=0;//     #v2=(Uninit);
a=0;//     const-string v3, "com.android.internal.telephony.IPhoneSubInfo$Stub"
a=0;// 
a=0;//     .line 204
a=0;//     const-string v4, "asInterface"
a=0;// 
a=0;//     new-array v5, v9, [Ljava/lang/Class;
a=0;// 
a=0;//     const-class v6, Landroid/os/IBinder;
a=0;// 
a=0;//     aput-object v6, v5, v8
a=0;// 
a=0;//     .line 205
a=0;//     new-array v6, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     aput-object v0, v6, v8
a=0;// 
a=0;//     .line 202
a=0;//     invoke-static {v3, v4, v5, v6}, Lcom/ccit/mmwlan/util/ReflectHelper;->callStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 206
a=0;//     .local v1, "subinfoObj":Ljava/lang/Object;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 207
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 211
a=0;//     :cond_3
a=0;//     #v2=(Uninit);
a=0;//     const-string v3, "getSubscriberId"
a=0;// 
a=0;//     .line 210
a=0;//     invoke-static {v1, v3, v10, v10}, Lcom/ccit/mmwlan/util/ReflectHelper;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     .line 213
a=0;//     .local v2, "val":Ljava/lang/String;
a=0;//     const-string v3, "MmClientSdk"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "getSubscriberId="
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
