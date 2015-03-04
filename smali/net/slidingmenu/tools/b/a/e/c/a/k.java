package net.slidingmenu.tools.b.a.e.c.a; class k { void a() { int a;
a=0;// .class public final Lnet/slidingmenu/tools/b/a/e/c/a/k;
a=0;// .super Lnet/slidingmenu/tools/b/a/e/a/b/l;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/e/a/b/l;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/e/c/a/k;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Lnet/slidingmenu/tools/b/a/e/a/b/h;Lnet/slidingmenu/tools/b/a/e/a/b/f;Lorg/json/JSONObject;)Lorg/json/JSONObject;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/a/e/c/a/k;->a(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-interface {p1}, Lnet/slidingmenu/tools/b/a/e/a/b/h;->h()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/a/e/c/a/k;->a(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     const-string v3, "a"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {p3, v3, v4}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/a/e/c/a/k;->a(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     const-string v4, "b"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {p3, v4, v5}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v0, v3, v4}, Lnet/slidingmenu/tools/b/b/k/h;->c(Landroid/content/Context;Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/a/e/c/a/k;->a(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     new-instance v4, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v5, "a"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v4, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "d"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
