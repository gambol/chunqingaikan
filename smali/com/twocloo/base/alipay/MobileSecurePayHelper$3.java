package com.twocloo.base.alipay; class MobileSecurePayHelper$3 { void a() { int a;
a=0;// .class Lcom/twocloo/base/alipay/MobileSecurePayHelper$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MobileSecurePayHelper.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/base/alipay/MobileSecurePayHelper;->showInstallConfirmDialog(Landroid/content/Context;Ljava/lang/String;)V
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
a=0;// .field private final synthetic val$context:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/base/alipay/MobileSecurePayHelper;Ljava/lang/String;Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$3;->this$0:Lcom/twocloo/base/alipay/MobileSecurePayHelper;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$3;->val$cachePath:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$3;->val$context:Landroid/content/Context;
a=0;// 
a=0;//     .line 102
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/alipay/MobileSecurePayHelper$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/content/DialogInterface;I)V
a=0;//     .locals 3
a=0;//     .param p1, "dialog"    # Landroid/content/DialogInterface;
a=0;//     .param p2, "which"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     const-string v1, "777"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$3;->val$cachePath:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/base/alipay/BaseHelper;->chmod(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 111
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 112
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 113
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "file://"
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$3;->val$cachePath:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "application/vnd.android.package-archive"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v1, p0, Lcom/twocloo/base/alipay/MobileSecurePayHelper$3;->val$context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 115
a=0;//     return-void
a=0;// .end method
}}
