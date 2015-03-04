package com.tencent.connect.auth; class AuthAgent$1 { void a() { int a;
a=0;// .class Lcom/tencent/connect/auth/AuthAgent$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/connect/auth/AuthAgent;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/connect/auth/AuthAgent;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 325
a=0;//     iput-object p1, p0, Lcom/tencent/connect/auth/AuthAgent$1;->a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/auth/AuthAgent$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCancel()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 364
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onComplete(Ljava/lang/Object;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 335
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 336
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$1;->a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->e(Lcom/tencent/connect/auth/AuthAgent;)V
a=0;// 
a=0;//     .line 359
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$1;->a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent$1;->a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/AuthAgent;);
a=0;//     invoke-static {v1}, Lcom/tencent/connect/auth/AuthAgent;->f(Lcom/tencent/connect/auth/AuthAgent;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/connect/auth/AuthAgent;->writeEncryToken(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 360
a=0;//     return-void
a=0;// 
a=0;//     .line 338
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     check-cast p1, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 339
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 341
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     const-string v1, "encry_token"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 349
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 350
a=0;//     const-string v1, "openSDK_LOG"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "OpenUi, EncrytokenListener() onComplete validToken"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 352
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent$1;->a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/tencent/connect/auth/AuthAgent;->a(Lcom/tencent/connect/auth/AuthAgent;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 342
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Uninit);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 343
a=0;//     #v1=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     .line 344
a=0;//     const-string v2, "openSDK_LOG"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "OpenUi, EncrytokenListener() onComplete error"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 354
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v1, "OpenUi, EncrytokenListener() onComplete relogin"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 356
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$1;->a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->e(Lcom/tencent/connect/auth/AuthAgent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onError(Lcom/tencent/tauth/UiError;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 328
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "AuthAgent, EncrytokenListener() onError relogin"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 330
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$1;->a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->e(Lcom/tencent/connect/auth/AuthAgent;)V
a=0;// 
a=0;//     .line 331
a=0;//     return-void
a=0;// .end method
}}
