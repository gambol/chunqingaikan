package com.tencent.weiyun; class RecordManager$2 { void a() { int a;
a=0;// .class Lcom/tencent/weiyun/RecordManager$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/weiyun/RecordManager;->deleteRecord(Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// .field final synthetic b:Lcom/tencent/weiyun/RecordManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/weiyun/RecordManager;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iput-object p1, p0, Lcom/tencent/weiyun/RecordManager$2;->b:Lcom/tencent/weiyun/RecordManager;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/tencent/weiyun/RecordManager$2;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/weiyun/RecordManager$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCancel()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/RecordManager$2;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-interface {v0}, Lcom/tencent/tauth/IUiListener;->onCancel()V
a=0;// 
a=0;//     .line 111
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onComplete(Ljava/lang/Object;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v5, -0x4
a=0;// 
a=0;//     .line 95
a=0;//     #v5=(Byte);
a=0;//     check-cast p1, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 97
a=0;//     :try_start_0
a=0;//     const-string v0, "ret"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 98
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/RecordManager$2;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 106
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 101
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/RecordManager$2;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     new-instance v1, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const/4 v2, -0x4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
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
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 103
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 104
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/RecordManager$2;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     new-instance v2, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v5, v0, v6}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {v1, v2}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onError(Lcom/tencent/tauth/UiError;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/RecordManager$2;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-interface {v0, p1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 92
a=0;//     return-void
a=0;// .end method
}}
