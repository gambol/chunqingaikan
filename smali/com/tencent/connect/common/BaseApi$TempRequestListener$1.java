package com.tencent.connect.common; class BaseApi$TempRequestListener$1 { void a() { int a;
a=0;// .class Lcom/tencent/connect/common/BaseApi$TempRequestListener$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$1:Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;// .field final synthetic val$this$0:Lcom/tencent/connect/common/BaseApi;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/connect/common/BaseApi$TempRequestListener;Landroid/os/Looper;Lcom/tencent/connect/common/BaseApi;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 319
a=0;//     iput-object p1, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener$1;->this$1:Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener$1;->val$this$0:Lcom/tencent/connect/common/BaseApi;
a=0;// 
a=0;//     invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 322
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 323
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener$1;->this$1:Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->access$000(Lcom/tencent/connect/common/BaseApi$TempRequestListener;)Lcom/tencent/tauth/IUiListener;
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
a=0;//     .line 327
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 325
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener$1;->this$1:Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->access$000(Lcom/tencent/connect/common/BaseApi$TempRequestListener;)Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/IUiListener;);
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
a=0;//     goto :goto_0
a=0;// .end method
}}
