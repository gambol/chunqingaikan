package net.slidingmenu.tools.b.a.e.c.f; class a { void a() { int a;
a=0;// .class public final Lnet/slidingmenu/tools/b/a/e/c/f/a;
a=0;// .super Lnet/slidingmenu/tools/b/a/e/a/b/l;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/e/a/b/l;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/e/c/f/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Lnet/slidingmenu/tools/b/a/e/a/b/h;Lnet/slidingmenu/tools/b/a/e/a/b/f;Lorg/json/JSONObject;)Lorg/json/JSONObject;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-interface {p1}, Lnet/slidingmenu/tools/b/a/e/a/b/h;->h()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v2, "a"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {p3, v2, v3}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/a/e/c/f/a;->a(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v3, "b"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {p3, v3, v4}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-instance v4, Lnet/slidingmenu/tools/b/a/e/c/f/b;
a=0;// 
a=0;//     #v4=(UninitRef,Lnet/slidingmenu/tools/b/a/e/c/f/b;);
a=0;//     invoke-direct {v4, p0, v1, v2, v3}, Lnet/slidingmenu/tools/b/a/e/c/f/b;-><init>(Lnet/slidingmenu/tools/b/a/e/c/f/a;Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v4=(Reference,Lnet/slidingmenu/tools/b/a/e/c/f/b;);
a=0;//     invoke-interface {p2, v4}, Lnet/slidingmenu/tools/b/a/e/a/b/f;->a(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/a/e/c/f/a;->a(I)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
}}
