package com.tencent.connect.auth; class AuthDialog$OnTimeListener { void a() { int a;
a=0;// .class Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/connect/auth/AuthDialog;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "OnTimeListener"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Ljava/lang/String;
a=0;// 
a=0;// .field b:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic c:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;// .field private d:Ljava/lang/String;
a=0;// 
a=0;// .field private e:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/connect/auth/AuthDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     iput-object p1, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->c:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 143
a=0;//     #p0=(Reference,Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;);
a=0;//     iput-object p2, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 144
a=0;//     iput-object p3, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 145
a=0;//     iput-object p4, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 146
a=0;//     iput-object p5, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 147
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     :try_start_0
a=0;//     invoke-static {p1}, Lcom/tencent/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 152
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->onComplete(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 158
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 153
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 154
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     .line 155
a=0;//     new-instance v0, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const/4 v1, -0x4
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const-string v2, "\u670d\u52a1\u5668\u8fd4\u56de\u6570\u636e\u683c\u5f0f\u6709\u8bef!"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, p1}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCancel()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/tencent/tauth/IUiListener;->onCancel()V
a=0;// 
a=0;//     .line 184
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 186
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onComplete(Ljava/lang/Object;)V
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     .line 162
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     check-cast p1, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 163
a=0;//     invoke-static {}, Lcom/tencent/open/a/c;->a()Lcom/tencent/open/a/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/a/c;);
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthDialog;->a()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/content/Context;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "_H5"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const-string v7, "ret"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, -0x6
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     invoke-virtual {p1, v7, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iget-object v10, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     iget-object v11, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const-string v12, "1000067"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-wide v7, v5
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-virtual/range {v0 .. v12}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 166
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 168
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onError(Lcom/tencent/tauth/UiError;)V
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     .line 172
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     iget-object v0, p1, Lcom/tencent/tauth/UiError;->errorMessage:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p1, Lcom/tencent/tauth/UiError;->errorMessage:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 173
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/tencent/open/a/c;->a()Lcom/tencent/open/a/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthDialog;->a()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/content/Context;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "_H5"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     iget v9, p1, Lcom/tencent/tauth/UiError;->errorCode:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iget-object v10, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const-string v12, "1000067"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-wide v7, v5
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-virtual/range {v0 .. v12}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 176
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 178
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     return-void
a=0;// 
a=0;//     .line 172
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     iget-object v11, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
}}
