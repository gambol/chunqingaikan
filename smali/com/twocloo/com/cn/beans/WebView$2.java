package com.twocloo.com.cn.beans; class WebView$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/beans/WebView$2;
a=0;// .super Landroid/webkit/WebViewClient;
a=0;// .source "WebView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/beans/WebView;->init(Landroid/content/Context;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;// .field private final synthetic val$context:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/beans/WebView;Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/WebView$2;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/beans/WebView$2;->val$context:Landroid/content/Context;
a=0;// 
a=0;//     .line 75
a=0;//     invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/WebView$2;);
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
a=0;//     .line 117
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WebView$2;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/beans/WebView;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WebView$2;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/beans/WebView;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WebView$2;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/beans/WebView;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WebView$2;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-object v2, v1, Lcom/twocloo/com/cn/beans/WebView;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 121
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WebView$2;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/beans/WebView;->access$1(Lcom/twocloo/com/cn/beans/WebView;)Lcom/twocloo/com/cn/view/PullRefreshWebView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WebView$2;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/beans/WebView;->access$1(Lcom/twocloo/com/cn/beans/WebView;)Lcom/twocloo/com/cn/view/PullRefreshWebView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/PullRefreshWebView;->onRefreshComplete()V
a=0;// 
a=0;//     .line 130
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WebView$2;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     const-string v2, "javascript:$(\"[href=\'#\']\").attr(\"href\",\"####\");"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 131
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WebView$2;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setBlockNetworkImage(Z)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 136
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 132
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 133
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;//     .locals 3
a=0;//     .param p1, "view"    # Landroid/webkit/WebView;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;//     .param p3, "favicon"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 84
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WebView$2;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/beans/WebView;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WebView$2;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WebView$2;->val$context:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v2}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v1, Lcom/twocloo/com/cn/beans/WebView;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 86
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WebView$2;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/beans/WebView;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 87
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WebView$2;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/beans/WebView;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->show()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 102
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 99
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 100
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;//     .param p1, "view"    # Landroid/webkit/WebView;
a=0;//     .param p2, "errorCode"    # I
a=0;//     .param p3, "description"    # Ljava/lang/String;
a=0;//     .param p4, "failingUrl"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 106
a=0;//     #v1=(Null);
a=0;//     const-string v0, "shower_error"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, ","
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/beans/WebView$2;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/WebView;->getProgress()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WebView$2;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     const-string v3, "text/html"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "utf-8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, v1
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/twocloo/com/cn/beans/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WebView$2;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/beans/WebView;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WebView$2;->this$0:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/beans/WebView;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 112
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/webkit/WebView;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     const-string v0, "tel:"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 141
a=0;//     invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 142
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
}}
