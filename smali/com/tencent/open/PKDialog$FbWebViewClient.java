package com.tencent.open; class PKDialog$FbWebViewClient { void a() { int a;
a=0;// .class Lcom/tencent/open/PKDialog$FbWebViewClient;
a=0;// .super Landroid/webkit/WebViewClient;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/open/PKDialog;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "FbWebViewClient"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/tencent/open/PKDialog;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/tencent/open/PKDialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 254
a=0;//     iput-object p1, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/open/PKDialog$FbWebViewClient;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/tencent/open/PKDialog;Lcom/tencent/open/PKDialog$1;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 254
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/open/PKDialog$FbWebViewClient;-><init>(Lcom/tencent/open/PKDialog;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/open/PKDialog$FbWebViewClient;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 304
a=0;//     invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 309
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/PKDialog;);
a=0;//     invoke-static {v0}, Lcom/tencent/open/PKDialog;->access$600(Lcom/tencent/open/PKDialog;)Landroid/webkit/WebView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V
a=0;// 
a=0;//     .line 310
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 294
a=0;//     invoke-static {}, Lcom/tencent/open/PKDialog;->access$300()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
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
a=0;//     .line 295
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 300
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 279
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 280
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/PKDialog;);
a=0;//     invoke-static {v0}, Lcom/tencent/open/PKDialog;->access$500(Lcom/tencent/open/PKDialog;)Lcom/tencent/open/PKDialog$OnTimeListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-direct {v1, p2, p3, p4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/open/PKDialog$OnTimeListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 285
a=0;//     invoke-static {}, Lcom/tencent/open/PKDialog;->access$400()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/open/PKDialog;->access$400()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 286
a=0;//     invoke-static {}, Lcom/tencent/open/PKDialog;->access$400()Ljava/lang/ref/WeakReference;
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
a=0;//     .line 289
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/PKDialog;->dismiss()V
a=0;// 
a=0;//     .line 290
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 258
a=0;//     #v1=(One);
a=0;//     invoke-static {}, Lcom/tencent/open/PKDialog;->access$300()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
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
a=0;//     .line 259
a=0;//     invoke-static {}, Lcom/tencent/utils/ServerSetting;->getInstance()Lcom/tencent/utils/ServerSetting;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/open/PKDialog;->access$400()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
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
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 261
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/PKDialog;);
a=0;//     invoke-static {v0}, Lcom/tencent/open/PKDialog;->access$500(Lcom/tencent/open/PKDialog;)Lcom/tencent/open/PKDialog$OnTimeListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p2}, Lcom/tencent/utils/Util;->parseUrlToJson(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/tencent/open/PKDialog$OnTimeListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/PKDialog;->dismiss()V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 273
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 264
a=0;//     :cond_0
a=0;//     const-string v0, "auth://cancel"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 265
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/PKDialog;);
a=0;//     invoke-static {v0}, Lcom/tencent/open/PKDialog;->access$500(Lcom/tencent/open/PKDialog;)Lcom/tencent/open/PKDialog$OnTimeListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/PKDialog$OnTimeListener;->onCancel()V
a=0;// 
a=0;//     .line 266
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/PKDialog;->dismiss()V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 267
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 268
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "auth://close"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 270
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/PKDialog;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/PKDialog;->dismiss()V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 271
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 273
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
