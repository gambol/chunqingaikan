package com.twocloo.base.alipay; class MobileSecurePayHelper$2 { void a() { int a;
a=0;// .class Lcom/twocloo/base/alipay/MobileSecurePayHelper$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MobileSecurePayHelper.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/base/alipay/MobileSecurePayHelper;->detectMobile_sp()Z
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/base/alipay/MobileSecurePayHelper;
a=0;// 
a=0;// .field private final synthetic val$cachePath:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/base/alipay/MobileSecurePayHelper;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$2;->this$0:Lcom/twocloo/base/alipay/MobileSecurePayHelper;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$2;->val$cachePath:Ljava/lang/String;
a=0;// 
a=0;//     .line 64
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayHelper$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     iget-object v3, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$2;->this$0:Lcom/twocloo/base/alipay/MobileSecurePayHelper;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayHelper;);
a=0;//     iget-object v3, v3, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$2;->val$cachePath:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->getApkInfo(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 68
a=0;//     .local v0, "apkInfo":Landroid/content/pm/PackageInfo;
a=0;//     #v0=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     iget-object v3, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$2;->this$0:Lcom/twocloo/base/alipay/MobileSecurePayHelper;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->checkNewUpdate(Landroid/content/pm/PackageInfo;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 71
a=0;//     .local v2, "newApkdlUrl":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v3, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$2;->this$0:Lcom/twocloo/base/alipay/MobileSecurePayHelper;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$2;->this$0:Lcom/twocloo/base/alipay/MobileSecurePayHelper;
a=0;// 
a=0;//     iget-object v4, v4, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$2;->val$cachePath:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v2, v5}, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->retrieveApkFromNet(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 76
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     new-instance v1, Landroid/os/Message;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v1}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 77
a=0;//     .local v1, "msg":Landroid/os/Message;
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iput v3, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v3, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$2;->val$cachePath:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iput-object v3, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v3, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$2;->this$0:Lcom/twocloo/base/alipay/MobileSecurePayHelper;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->access$0(Lcom/twocloo/base/alipay/MobileSecurePayHelper;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
}}
