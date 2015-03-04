package com.weibo.sdk.android; class WeiboDialog$WeiboWebViewClient { void a() { int a;
a=0;// .class Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;
a=0;// .super Landroid/webkit/WebViewClient;
a=0;// .source "WeiboDialog.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/weibo/sdk/android/WeiboDialog;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "WeiboWebViewClient"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/weibo/sdk/android/WeiboDialog;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/weibo/sdk/android/WeiboDialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     iput-object p1, p0, Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;->this$0:Lcom/weibo/sdk/android/WeiboDialog;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/weibo/sdk/android/WeiboDialog;Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     invoke-direct {p0, p1}, Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;-><init>(Lcom/weibo/sdk/android/WeiboDialog;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "view"    # Landroid/webkit/WebView;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     const-string v0, "Weibo-WebView"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "onPageFinished URL: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 214
a=0;//     invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;->this$0:Lcom/weibo/sdk/android/WeiboDialog;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/weibo/sdk/android/WeiboDialog;->access$2(Lcom/weibo/sdk/android/WeiboDialog;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;->this$0:Lcom/weibo/sdk/android/WeiboDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboDialog;);
a=0;//     invoke-static {v0}, Lcom/weibo/sdk/android/WeiboDialog;->access$2(Lcom/weibo/sdk/android/WeiboDialog;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 218
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;->this$0:Lcom/weibo/sdk/android/WeiboDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboDialog;);
a=0;//     invoke-static {v0}, Lcom/weibo/sdk/android/WeiboDialog;->access$3(Lcom/weibo/sdk/android/WeiboDialog;)Landroid/webkit/WebView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V
a=0;// 
a=0;//     .line 219
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;//     .locals 3
a=0;//     .param p1, "view"    # Landroid/webkit/WebView;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;//     .param p3, "favicon"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     const-string v0, "Weibo-WebView"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "onPageStarted URL: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 201
a=0;//     sget-object v0, Lcom/weibo/sdk/android/Weibo;->redirecturl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;->this$0:Lcom/weibo/sdk/android/WeiboDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboDialog;);
a=0;//     invoke-static {v0, p1, p2}, Lcom/weibo/sdk/android/WeiboDialog;->access$1(Lcom/weibo/sdk/android/WeiboDialog;Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 203
a=0;//     invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;->this$0:Lcom/weibo/sdk/android/WeiboDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/weibo/sdk/android/WeiboDialog;->dismiss()V
a=0;// 
a=0;//     .line 209
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 207
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 208
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;->this$0:Lcom/weibo/sdk/android/WeiboDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboDialog;);
a=0;//     invoke-static {v0}, Lcom/weibo/sdk/android/WeiboDialog;->access$2(Lcom/weibo/sdk/android/WeiboDialog;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/webkit/WebView;
a=0;//     .param p2, "errorCode"    # I
a=0;//     .param p3, "description"    # Ljava/lang/String;
a=0;//     .param p4, "failingUrl"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;->this$0:Lcom/weibo/sdk/android/WeiboDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboDialog;);
a=0;//     invoke-static {v0}, Lcom/weibo/sdk/android/WeiboDialog;->access$0(Lcom/weibo/sdk/android/WeiboDialog;)Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/weibo/sdk/android/WeiboDialogError;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/weibo/sdk/android/WeiboDialogError;);
a=0;//     invoke-direct {v1, p3, p2, p4}, Lcom/weibo/sdk/android/WeiboDialogError;-><init>(Ljava/lang/String;ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/weibo/sdk/android/WeiboDialogError;);
a=0;//     invoke-interface {v0, v1}, Lcom/weibo/sdk/android/WeiboAuthListener;->onError(Lcom/weibo/sdk/android/WeiboDialogError;)V
a=0;// 
a=0;//     .line 195
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;->this$0:Lcom/weibo/sdk/android/WeiboDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/weibo/sdk/android/WeiboDialog;->dismiss()V
a=0;// 
a=0;//     .line 196
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
a=0;//     .locals 0
a=0;//     .param p1, "view"    # Landroid/webkit/WebView;
a=0;//     .param p2, "handler"    # Landroid/webkit/SslErrorHandler;
a=0;//     .param p3, "error"    # Landroid/net/http/SslError;
a=0;// 
a=0;//     .prologue
a=0;//     .line 222
a=0;//     invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->proceed()V
a=0;// 
a=0;//     .line 223
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;//     .param p1, "view"    # Landroid/webkit/WebView;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     const-string v1, "Weibo-WebView"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Redirect URL: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 181
a=0;//     const-string v1, "sms:"
a=0;// 
a=0;//     invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 182
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 183
a=0;//     .local v0, "sendIntent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "address"
a=0;// 
a=0;//     const-string v2, "sms:"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-virtual {p2, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 184
a=0;//     const-string v1, "vnd.android-dir/mms-sms"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 185
a=0;//     iget-object v1, p0, Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;->this$0:Lcom/weibo/sdk/android/WeiboDialog;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/weibo/sdk/android/WeiboDialog;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 186
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 188
a=0;//     .end local v0    # "sendIntent":Landroid/content/Intent;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
