package com.twocloo.com.cn.threads; class SendLogRegInfo { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/SendLogRegInfo;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "SendLogRegInfo.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final TAG:Ljava/lang/String; = "SendLogRegInfo"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private flag:I
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;//     .param p3, "token"    # Ljava/lang/String;
a=0;//     .param p4, "flag"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/SendLogRegInfo;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/SendLogRegInfo;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 24
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/SendLogRegInfo;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 25
a=0;//     iput p4, p0, Lcom/twocloo/com/cn/threads/SendLogRegInfo;->flag:I
a=0;// 
a=0;//     .line 26
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/threads/SendLogRegInfo;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 27
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-super {p0}, Ljava/lang/Thread;->run()V
a=0;// 
a=0;//     .line 32
a=0;//     new-instance v10, Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;// 
a=0;//     #v10=(UninitRef,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SendLogRegInfo;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-direct {v10, v0}, Lcom/twocloo/com/cn/common/PhoneInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 33
a=0;//     .local v10, "phone":Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SendLogRegInfo;->context:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getChannel(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 34
a=0;//     .local v6, "channel":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SendLogRegInfo;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 35
a=0;//     .local v5, "imei":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SendLogRegInfo;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 36
a=0;//     .local v8, "pt":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "android"
a=0;// 
a=0;//     .line 37
a=0;//     .local v9, "ct":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/SendLogRegInfo;->context:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/SendLogRegInfo;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/threads/SendLogRegInfo;->token:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/common/PhoneInfo;->getScreenPix()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/common/PhoneInfo;->getModel()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/threads/SendLogRegInfo;->flag:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static/range {v0 .. v9}, Lcom/twocloo/com/cn/http/HttpImpl;->sendPhoneInfoFeedBack(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 39
a=0;//     return-void
a=0;// .end method
}}
