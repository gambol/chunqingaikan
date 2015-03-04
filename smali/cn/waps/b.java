package cn.waps; class b { void a() { int a;
a=0;// .class Lcn/waps/b;
a=0;// .super Ljava/lang/Thread;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/webkit/WebView;
a=0;// 
a=0;// .field final synthetic b:Lcn/waps/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/a;Landroid/webkit/WebView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/b;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a;);
a=0;//     invoke-static {v0}, Lcn/waps/a;->a(Lcn/waps/a;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "connectivity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a;);
a=0;//     iget-boolean v0, v0, Lcn/waps/a;->a:Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcn/waps/b;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/a;->b(Lcn/waps/a;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a;);
a=0;//     iget-object v1, p0, Lcn/waps/b;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/webkit/WebView;);
a=0;//     iget-object v2, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/a;);
a=0;//     invoke-static {v2}, Lcn/waps/a;->c(Lcn/waps/a;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcn/waps/a;->a(Lcn/waps/a;Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcn/waps/a;->a(Lcn/waps/a;Z)Z
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-object v2, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/a;);
a=0;//     invoke-static {v2}, Lcn/waps/a;->d(Lcn/waps/a;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long/2addr v0, v2
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/a;);
a=0;//     invoke-static {v2}, Lcn/waps/a;->e(Lcn/waps/a;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/lit16 v2, v2, 0x3e8
a=0;// 
a=0;//     add-int/lit16 v2, v2, -0x1f4
a=0;// 
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a;);
a=0;//     invoke-static {v0}, Lcn/waps/a;->a(Lcn/waps/a;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->hasWindowFocus()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a;);
a=0;//     invoke-static {v0}, Lcn/waps/a;->f(Lcn/waps/a;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a;);
a=0;//     iget-object v1, p0, Lcn/waps/b;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/webkit/WebView;);
a=0;//     iget-object v2, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/a;);
a=0;//     invoke-static {v2}, Lcn/waps/a;->c(Lcn/waps/a;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcn/waps/a;->a(Lcn/waps/a;Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcn/waps/a;->b(Lcn/waps/a;Z)Z
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v0, v1, v2}, Lcn/waps/a;->a(Lcn/waps/a;J)J
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_3
a=0;//     :try_start_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
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
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, v0, Lcn/waps/a;->a:Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Lcn/waps/a;->a(Lcn/waps/a;Z)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/b;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/webkit/WebView;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcn/waps/a;->a(Lcn/waps/a;Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a;);
a=0;//     invoke-static {v0}, Lcn/waps/a;->e(Lcn/waps/a;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit16 v0, v0, 0x3e8
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Lcn/waps/b;->sleep(J)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a;);
a=0;//     iget-boolean v0, v0, Lcn/waps/a;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/b;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/b;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->clearHistory()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/b;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->clearCache(Z)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/b;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     :try_start_3
a=0;//     #v0=(Boolean);v1=(LongHi);v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a;);
a=0;//     invoke-static {v0}, Lcn/waps/a;->f(Lcn/waps/a;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a;);
a=0;//     iget-object v1, p0, Lcn/waps/b;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/webkit/WebView;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcn/waps/a;->a(Lcn/waps/a;Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/b;->b:Lcn/waps/a;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Lcn/waps/a;->b(Lcn/waps/a;Z)Z
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
}}
