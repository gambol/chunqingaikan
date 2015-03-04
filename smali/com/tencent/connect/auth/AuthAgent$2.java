package com.tencent.connect.auth; class AuthAgent$2 { void a() { int a;
a=0;// .class Lcom/tencent/connect/auth/AuthAgent$2;
a=0;// .super Landroid/os/Handler;
a=0;// .source "ProGuard"
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
a=0;//     .line 367
a=0;//     iput-object p1, p0, Lcom/tencent/connect/auth/AuthAgent$2;->a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/auth/AuthAgent$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 370
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "OpenUi, handleMessage msg.what = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 372
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 374
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 376
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "ret"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 377
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 382
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 383
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$2;->a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->g(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 391
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 378
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 379
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     .line 380
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$2;->a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->e(Lcom/tencent/connect/auth/AuthAgent;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 385
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$2;->a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->e(Lcom/tencent/connect/auth/AuthAgent;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 389
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$2;->a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->g(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     iget v3, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {v2, v3, v0, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {v1, v2}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
