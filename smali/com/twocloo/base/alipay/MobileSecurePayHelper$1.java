package com.twocloo.base.alipay; class MobileSecurePayHelper$1 { void a() { int a;
a=0;// .class Lcom/twocloo/base/alipay/MobileSecurePayHelper$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "MobileSecurePayHelper.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/base/alipay/MobileSecurePayHelper;
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
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/base/alipay/MobileSecurePayHelper;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$1;->this$0:Lcom/twocloo/base/alipay/MobileSecurePayHelper;
a=0;// 
a=0;//     .line 320
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayHelper$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 4
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     .line 323
a=0;//     :try_start_0
a=0;//     iget v2, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     .line 334
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 338
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 326
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);v3=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$1;->this$0:Lcom/twocloo/base/alipay/MobileSecurePayHelper;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayHelper;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->closeProgress()V
a=0;// 
a=0;//     .line 327
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 329
a=0;//     .local v0, "cachePath":Ljava/lang/String;
a=0;//     iget-object v2, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$1;->this$0:Lcom/twocloo/base/alipay/MobileSecurePayHelper;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$1;->this$0:Lcom/twocloo/base/alipay/MobileSecurePayHelper;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayHelper;);
a=0;//     iget-object v3, v3, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Lcom/twocloo/base/alipay/MobileSecurePayHelper;->showInstallConfirmDialog(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 335
a=0;//     .end local v0    # "cachePath":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 336
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 323
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
}}
