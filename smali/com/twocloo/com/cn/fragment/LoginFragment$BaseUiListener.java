package com.twocloo.com.cn.fragment; class LoginFragment$BaseUiListener { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/LoginFragment$BaseUiListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LoginFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "BaseUiListener"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/twocloo/com/cn/fragment/LoginFragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 412
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$BaseUiListener;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment$BaseUiListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/twocloo/com/cn/fragment/LoginFragment;Lcom/twocloo/com/cn/fragment/LoginFragment$BaseUiListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 412
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/fragment/LoginFragment$BaseUiListener;-><init>(Lcom/twocloo/com/cn/fragment/LoginFragment;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment$BaseUiListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected doComplete(Lorg/json/JSONObject;)V
a=0;//     .locals 0
a=0;//     .param p1, "values"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     .line 432
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCancel()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 440
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onComplete(Ljava/lang/Object;)V
a=0;//     .locals 4
a=0;//     .param p1, "response"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 419
a=0;//     :try_start_0
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 420
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 421
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$BaseUiListener;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     const-string v3, "openid"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$17(Lcom/twocloo/com/cn/fragment/LoginFragment;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 426
a=0;//     .end local v1    # "json":Lorg/json/JSONObject;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     check-cast p1, Lorg/json/JSONObject;
a=0;// 
a=0;//     .end local p1    # "response":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/fragment/LoginFragment$BaseUiListener;->doComplete(Lorg/json/JSONObject;)V
a=0;// 
a=0;//     .line 428
a=0;//     return-void
a=0;// 
a=0;//     .line 423
a=0;//     .restart local p1    # "response":Ljava/lang/Object;
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 424
a=0;//     .local v0, "e":Lorg/json/JSONException;
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onError(Lcom/tencent/tauth/UiError;)V
a=0;//     .locals 0
a=0;//     .param p1, "e"    # Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     .prologue
a=0;//     .line 436
a=0;//     return-void
a=0;// .end method
}}
