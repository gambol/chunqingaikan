package net.slidingmenu.tools.b.a.e.c.a; class b { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/a/e/c/a/b;
a=0;// .super Lnet/slidingmenu/tools/b/a/e/a/b/l;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/e/a/b/l;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/e/c/a/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Lnet/slidingmenu/tools/b/a/e/a/b/h;Lnet/slidingmenu/tools/b/a/e/a/b/f;Lorg/json/JSONObject;)Lorg/json/JSONObject;
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-interface {p1}, Lnet/slidingmenu/tools/b/a/e/a/b/h;->h()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     const-string v3, "a"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {p3, v3, v4}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/a/e/c/a/b;->a(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Null);
a=0;//     new-instance v4, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/json/JSONArray;);
a=0;//     invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);v4=(Reference,Lorg/json/JSONArray;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v1, v5, :cond_5
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v3, v1, v5}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONArray;ILjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     new-instance v6, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v6=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v7, "a"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-static {v2, v5}, Lnet/slidingmenu/tools/b/b/k/k;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     const-string v5, "b"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v6, v5, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     :goto_2
a=0;//     #v7=(Boolean);
a=0;//     invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
a=0;// 
a=0;//     :cond_3
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v5=(Boolean);v6=(Reference,Lorg/json/JSONObject;);v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "b"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v6, v5, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Integer);v2=(Reference,Landroid/content/Context;);v3=(Reference,Lorg/json/JSONArray;);v4=(Reference,Lorg/json/JSONArray;);v5=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/a/e/c/a/b;->a(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v3, "a"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v3, "d"
a=0;// 
a=0;//     invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     goto :goto_0
a=0;// .end method
}}
