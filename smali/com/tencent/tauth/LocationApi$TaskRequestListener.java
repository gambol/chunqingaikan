package com.tencent.tauth; class LocationApi$TaskRequestListener { void a() { int a;
a=0;// .class Lcom/tencent/tauth/LocationApi$TaskRequestListener;
a=0;// .super Lcom/tencent/tauth/LocationApi$BaseRequestListener;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/tauth/LocationApi;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "TaskRequestListener"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private lis:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/tauth/LocationApi;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 259
a=0;//     iput-object p1, p0, Lcom/tencent/tauth/LocationApi$TaskRequestListener;->this$0:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/tencent/tauth/LocationApi$BaseRequestListener;-><init>(Lcom/tencent/tauth/LocationApi;Lcom/tencent/tauth/LocationApi$1;)V
a=0;// 
a=0;//     .line 260
a=0;//     #p0=(Reference,Lcom/tencent/tauth/LocationApi$TaskRequestListener;);
a=0;//     iput-object p2, p0, Lcom/tencent/tauth/LocationApi$TaskRequestListener;->lis:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 261
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected handleException(Ljava/lang/Exception;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi$TaskRequestListener;->lis:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 272
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi$TaskRequestListener;->lis:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {v1, v2, v3, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 274
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onComplete(Lorg/json/JSONObject;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 265
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi$TaskRequestListener;->lis:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 266
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi$TaskRequestListener;->lis:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 268
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
