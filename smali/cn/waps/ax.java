package cn.waps; class ax { void a() { int a;
a=0;// .class Lcn/waps/ax;
a=0;// .super Landroid/os/AsyncTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/content/Context;
a=0;// 
a=0;// .field b:Ljava/lang/String;
a=0;// 
a=0;// .field c:Ljava/lang/String;
a=0;// 
a=0;// .field d:I
a=0;// 
a=0;// .field e:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic f:Lcn/waps/at;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/at;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/ax;->f:Lcn/waps/at;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/ax;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcn/waps/ax;->d:I
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcn/waps/ax;->e:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/ax;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p3, p0, Lcn/waps/ax;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p4, p0, Lcn/waps/ax;->c:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;//     .locals 6
a=0;// 
a=0;//     const/16 v5, 0xce
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     iget-object v0, p0, Lcn/waps/ax;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "pkg="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ax;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcn/waps/ax;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "pkg="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x4
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/ax;->e:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ax;->e:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "&"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ax;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcn/waps/ax;->e:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "&"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/ax;->e:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Conflicted);
a=0;//     new-instance v0, Lcn/waps/cs;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/cs;);
a=0;//     iget-object v1, p0, Lcn/waps/ax;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcn/waps/cs;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/cs;);
a=0;//     iget-object v1, p0, Lcn/waps/ax;->b:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcn/waps/cs;->a(Ljava/lang/String;Ljava/util/List;[B)Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xc8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-eq v1, v2, :cond_1
a=0;// 
a=0;//     if-ne v1, v5, :cond_3
a=0;// 
a=0;//     :cond_1
a=0;//     if-eq v1, v5, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getContentLength()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, p0, Lcn/waps/ax;->d:I
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/ax;->b:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v1=(Integer);v2=(PosShort);v3=(Null);
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     const/16 v2, 0x194
a=0;// 
a=0;//     if-ne v1, v2, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ax;->f:Lcn/waps/at;
a=0;// 
a=0;//     const-string v1, "(404)\u4e0b\u8f7d\u6587\u4ef6\u4e0d\u5b58\u5728"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcn/waps/at;->a(Lcn/waps/at;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_2
a=0;//     #v1=(Integer);v2=(PosShort);v3=(Null);
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x1f4
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne v0, v1, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ax;->f:Lcn/waps/at;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/at;);
a=0;//     const-string v1, "(500)\u670d\u52a1\u7aef\u51fa\u73b0\u9519\u8bef"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcn/waps/at;->a(Lcn/waps/at;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(PosShort);
a=0;//     iget-object v0, p0, Lcn/waps/ax;->f:Lcn/waps/at;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/at;);
a=0;//     const-string v1, "\u670d\u52a1\u5668\u65e0\u54cd\u5e94"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcn/waps/at;->a(Lcn/waps/at;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected a(Ljava/lang/Boolean;)V
a=0;//     .locals 7
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcn/waps/at;->a()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/at;->a()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/ax;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/waps/AppConnect;->c(Landroid/content/Context;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/at;->a(Ljava/util/Map;)Ljava/util/Map;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget v0, p0, Lcn/waps/ax;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ax;->f:Lcn/waps/at;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/at;);
a=0;//     invoke-static {v0}, Lcn/waps/at;->a(Lcn/waps/at;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Lcn/waps/ax;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/ax;);
a=0;//     iget-object v1, p0, Lcn/waps/ax;->f:Lcn/waps/at;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/at;);
a=0;//     iget-object v2, p0, Lcn/waps/ax;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v3, p0, Lcn/waps/ax;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcn/waps/ax;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Lcn/waps/ax;-><init>(Lcn/waps/at;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/ax;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Void;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v0, v1}, Lcn/waps/ax;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ax;->f:Lcn/waps/at;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcn/waps/at;->a(Lcn/waps/at;Z)Z
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v1, p0, Lcn/waps/ax;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcn/waps/ax;->f:Lcn/waps/at;
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/at;);
a=0;//     invoke-static {v2}, Lcn/waps/at;->b(Lcn/waps/at;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "\uff0c"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/at;->a()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "failed_to_download"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ax;->f:Lcn/waps/at;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Lcn/waps/at;->a(Lcn/waps/at;Z)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
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
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v0, p0, Lcn/waps/ax;->f:Lcn/waps/at;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/at;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Lcn/waps/at;->a(Lcn/waps/at;Z)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ax;->f:Lcn/waps/at;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ax;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcn/waps/ax;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcn/waps/ax;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcn/waps/ax;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Lcn/waps/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcn/waps/aq;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ax;->f:Lcn/waps/at;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ax;->a:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v3, p0, Lcn/waps/ax;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v4, p0, Lcn/waps/ax;->c:Ljava/lang/String;
a=0;// 
a=0;//     iget v5, p0, Lcn/waps/ax;->d:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-object v6, p0, Lcn/waps/ax;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcn/waps/at;->a(Landroid/content/Context;Lcn/waps/aq;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     check-cast p1, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcn/waps/ax;->a([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     check-cast p1, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcn/waps/ax;->a(Ljava/lang/Boolean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
