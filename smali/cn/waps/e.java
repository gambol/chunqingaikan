package cn.waps; class e { void a() { int a;
a=0;// .class Lcn/waps/e;
a=0;// .super Landroid/webkit/WebViewClient;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcn/waps/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcn/waps/a;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/e;->a:Lcn/waps/a;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/e;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcn/waps/a;Lcn/waps/b;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcn/waps/e;-><init>(Lcn/waps/a;)V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/e;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "ad"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/e;->a:Lcn/waps/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a;);
a=0;//     invoke-static {v0}, Lcn/waps/a;->h(Lcn/waps/a;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcn/waps/g;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/g;);
a=0;//     invoke-direct {v1, p0}, Lcn/waps/g;-><init>(Lcn/waps/e;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/g;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcn/waps/e;->a:Lcn/waps/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a;);
a=0;//     invoke-static {v0}, Lcn/waps/a;->h(Lcn/waps/a;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcn/waps/h;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/h;);
a=0;//     invoke-direct {v1, p0, p1}, Lcn/waps/h;-><init>(Lcn/waps/e;Landroid/webkit/WebView;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/h;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/e;->a:Lcn/waps/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a;);
a=0;//     invoke-static {v0}, Lcn/waps/a;->a(Lcn/waps/a;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setScrollBarStyle(I)V
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "<html></html>"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "text/html"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "utf-8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/e;->a:Lcn/waps/a;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/a;->h(Lcn/waps/a;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcn/waps/f;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/f;);
a=0;//     invoke-direct {v1, p0}, Lcn/waps/f;-><init>(Lcn/waps/e;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/f;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/e;->a:Lcn/waps/a;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Lcn/waps/a;->b(Lcn/waps/a;Z)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {p2}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(One);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v2, "_self"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->F()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     const-string v2, "?"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "browser"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     const-string v3, "browser="
a=0;// 
a=0;//     invoke-virtual {p2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x8
a=0;// 
a=0;//     invoke-virtual {p2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "&"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-string v5, "&"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Boolean);v5=(Conflicted);
a=0;//     const-string v4, "ad_type"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     const-string v2, "ad_type="
a=0;// 
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x8
a=0;// 
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-string v5, "&"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_4
a=0;//     #v4=(Boolean);v5=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "cpc"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/e;->a:Lcn/waps/a;
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/a;);
a=0;//     invoke-static {v2, p2}, Lcn/waps/a;->a(Lcn/waps/a;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_1
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Null);v2=(Boolean);
a=0;//     new-instance v2, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     iget-object v4, p0, Lcn/waps/e;->a:Lcn/waps/a;
a=0;// 
a=0;//     invoke-static {v4}, Lcn/waps/a;->a(Lcn/waps/a;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v2, v4}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-virtual {v2, v3, p2}, Lcn/waps/SDKUtils;->openUrlByBrowser(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     :try_start_1
a=0;//     #v1=(One);v2=(Boolean);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcn/waps/e;->a:Lcn/waps/a;
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/a;);
a=0;//     invoke-static {v2, p2}, Lcn/waps/a;->a(Lcn/waps/a;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v2, p0, Lcn/waps/e;->a:Lcn/waps/a;
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/a;);
a=0;//     invoke-static {v2, p2}, Lcn/waps/a;->a(Lcn/waps/a;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
