package net.slidingmenu.tools.b.a.e.c.e; class a { void a() { int a;
a=0;// .class public final Lnet/slidingmenu/tools/b/a/e/c/e/a;
a=0;// .super Lnet/slidingmenu/tools/b/a/e/a/b/k;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/e/a/b/k;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/e/c/e/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Lnet/slidingmenu/tools/b/a/e/a/b/h;Lnet/slidingmenu/tools/b/a/e/a/b/f;)Lorg/json/JSONObject;
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/a/e/c/e/a;->a(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-interface {p1}, Lnet/slidingmenu/tools/b/a/e/a/b/h;->h()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/a/e/c/e/a;->a(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     invoke-static {v5}, Lnet/slidingmenu/tools/b/b/i/k;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     move v4, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Boolean);
a=0;//     invoke-static {v5}, Lnet/slidingmenu/tools/b/b/i/k;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lnet/slidingmenu/tools/b/b/k/k;->b(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     move v3, v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v5}, Lnet/slidingmenu/tools/b/b/k/k;->d(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_3
a=0;//     invoke-static {v5}, Lnet/slidingmenu/tools/b/b/k/k;->g(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v5}, Lnet/slidingmenu/tools/b/b/h/e;->i(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v5}, Lnet/slidingmenu/tools/b/b/h/e;->j(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     new-instance v7, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v7=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v8, "a"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v4, "b"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v4, "c"
a=0;// 
a=0;//     invoke-virtual {v7, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v3, "d"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "e"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "f"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "g"
a=0;// 
a=0;//     invoke-virtual {v7, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/a/e/c/e/a;->a(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "d"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(One);v1=(Null);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Reference,Landroid/content/Context;);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move v4, v1
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Boolean);v6=(Reference,Ljava/lang/String;);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v3=(Boolean);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v2=(Boolean);v7=(Boolean);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_4
a=0;// .end method
}}
