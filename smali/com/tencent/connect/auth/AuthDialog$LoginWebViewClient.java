package com.tencent.connect.auth; class AuthDialog$LoginWebViewClient { void a() { int a;
a=0;// .class Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;
a=0;// .super Landroid/webkit/WebViewClient;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/connect/auth/AuthDialog;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "LoginWebViewClient"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/tencent/connect/auth/AuthDialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     iput-object p1, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/tencent/connect/auth/AuthDialog;Lcom/tencent/connect/auth/AuthDialog$1;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;-><init>(Lcom/tencent/connect/auth/AuthDialog;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 275
a=0;//     invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 276
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthDialog;->b()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthDialog;->b()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 277
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthDialog;->b()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 280
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthDialog;->d(Lcom/tencent/connect/auth/AuthDialog;)Landroid/webkit/WebView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V
a=0;// 
a=0;//     .line 281
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 265
a=0;//     const-string v0, "AuthDialog"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Webview loading URL: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/utils/Util;->logd(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 266
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 267
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthDialog;->b()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthDialog;->b()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 268
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthDialog;->b()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 271
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 250
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 251
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthDialog;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthDialog;->e(Lcom/tencent/connect/auth/AuthDialog;)Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-direct {v1, p2, p3, p4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 256
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthDialog;->a()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthDialog;->a()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 257
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthDialog;->a()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "\u7f51\u7edc\u8fde\u63a5\u5f02\u5e38\u6216\u7cfb\u7edf\u9519\u8bef"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 260
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/AuthDialog;->dismiss()V
a=0;// 
a=0;//     .line 261
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 193
a=0;//     #v1=(One);
a=0;//     const-string v0, "AuthDialog"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Redirect URL: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/tencent/utils/Util;->logd(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 194
a=0;//     const-string v0, "auth://browser"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 195
a=0;//     invoke-static {p2}, Lcom/tencent/utils/Util;->parseUrlToJson(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 198
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/tencent/connect/auth/AuthDialog;->a(Lcom/tencent/connect/auth/AuthDialog;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/connect/auth/AuthDialog;->a(Lcom/tencent/connect/auth/AuthDialog;Z)Z
a=0;// 
a=0;//     .line 200
a=0;//     iget-object v2, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/connect/auth/AuthDialog;->b(Lcom/tencent/connect/auth/AuthDialog;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 244
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 202
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);v2=(Boolean);v3=(Boolean);
a=0;//     const-string v2, "fail_cb"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v2, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     const-string v3, "fail_cb"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-virtual {v2, v0, v3}, Lcom/tencent/connect/auth/AuthDialog;->callJs(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 205
a=0;//     :cond_2
a=0;//     #v3=(Boolean);
a=0;//     const-string v2, "fall_to_wv"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v1, :cond_4
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v2, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/connect/auth/AuthDialog;);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthDialog;->c(Lcom/tencent/connect/auth/AuthDialog;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-le v0, v3, :cond_3
a=0;// 
a=0;//     const-string v0, "&"
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0}, Lcom/tencent/connect/auth/AuthDialog;->a(Lcom/tencent/connect/auth/AuthDialog;Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     .line 208
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     const-string v2, "browser_error=1"
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/tencent/connect/auth/AuthDialog;->a(Lcom/tencent/connect/auth/AuthDialog;Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthDialog;->d(Lcom/tencent/connect/auth/AuthDialog;)Landroid/webkit/WebView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/connect/auth/AuthDialog;->c(Lcom/tencent/connect/auth/AuthDialog;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 207
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "?"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 213
a=0;//     :cond_4
a=0;//     #v2=(Integer);v3=(Boolean);
a=0;//     const-string v2, "redir"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 214
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v2, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/connect/auth/AuthDialog;->d(Lcom/tencent/connect/auth/AuthDialog;)Landroid/webkit/WebView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 220
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/tencent/utils/ServerSetting;->getInstance()Lcom/tencent/utils/ServerSetting;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthDialog;->a()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     const-string v3, "auth://tauth.qq.com/"
a=0;// 
a=0;//     invoke-virtual {v2, v0, v3}, Lcom/tencent/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthDialog;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthDialog;->e(Lcom/tencent/connect/auth/AuthDialog;)Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p2}, Lcom/tencent/utils/Util;->parseUrlToJson(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/AuthDialog;->dismiss()V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 224
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 225
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "auth://cancel"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthDialog;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthDialog;->e(Lcom/tencent/connect/auth/AuthDialog;)Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->onCancel()V
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/AuthDialog;->dismiss()V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 228
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 229
a=0;//     :cond_7
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "auth://close"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     .line 231
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;->a:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthDialog;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/AuthDialog;->dismiss()V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 232
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 233
a=0;//     :cond_8
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "download://"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     .line 235
a=0;//     const-string v0, "download://"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 236
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v3, "android.intent.action.VIEW"
a=0;// 
a=0;//     invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     .line 237
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v0, 0x10000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 238
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthDialog;->a()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthDialog;->a()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     .line 239
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthDialog;->a()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     :cond_9
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 241
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 244
a=0;//     :cond_a
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_1
a=0;// .end method
}}
