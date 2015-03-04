package com.twocloo.com.cn.utils; class SIMCardInfo { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/utils/SIMCardInfo;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SIMCardInfo.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private IMSI:Ljava/lang/String;
a=0;// 
a=0;// .field private telephonyManager:Landroid/telephony/TelephonyManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/SIMCardInfo;);
a=0;//     const-string v0, "phone"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/utils/SIMCardInfo;->telephonyManager:Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 29
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getProvidersName()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 52
a=0;//     .local v0, "ProvidersName":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/utils/SIMCardInfo;->telephonyManager:Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/telephony/TelephonyManager;);
a=0;//     invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/utils/SIMCardInfo;->IMSI:Ljava/lang/String;
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/utils/SIMCardInfo;->IMSI:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "46000"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/utils/SIMCardInfo;->IMSI:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "46002"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 55
a=0;//     :cond_0
a=0;//     const-string v0, "\u4e2d\u56fd\u79fb\u52a8"
a=0;// 
a=0;//     .line 61
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 56
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/utils/SIMCardInfo;->IMSI:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "46001"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 57
a=0;//     const-string v0, "\u4e2d\u56fd\u8054\u901a"
a=0;// 
a=0;//     .line 58
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/utils/SIMCardInfo;->IMSI:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "46003"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 59
a=0;//     const-string v0, "\u4e2d\u56fd\u7535\u4fe1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getSimSerialNumber()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/utils/SIMCardInfo;->telephonyManager:Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/telephony/TelephonyManager;);
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimSerialNumber()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
